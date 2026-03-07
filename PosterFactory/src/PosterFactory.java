/*
global preconditions:
- posters is not empty or null
- posters all have a size between [1, 5] inclusive
 */

import java.util.ArrayList;

public class PosterFactory {
    ArrayList<Poster> posters;

    public PosterFactory() {
        posters = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            posters.add(new Poster());
        }
    }

    // Q1: return the number of black and white posters, and ensure all black and white posters are printed
    public int printMonochrome() {
        int cnt = 0;
        for (Poster poster : posters) {
            if (!poster.isFullColour()) {
                poster.print();
                cnt++;
            }
        }
        return cnt;
    }

    // Q2: return a new ArrayList containing all A1 and A2 posters
    public ArrayList<Poster> hugePosters() {
        ArrayList<Poster> res = new ArrayList<>();
        for (Poster poster : posters) {
            if (poster.getSize() == 1 || poster.getSize() == 2) {
                res.add(poster);
            }
        }
        return res;
    }

    // Q3: shift the posters list to the left by steps places
    // precondition: steps >= 0
    public void prioritise(int steps) {
        ArrayList<Poster> temp = new ArrayList<>();
        for (int i = 0; i < steps; i++) {
            temp.add(posters.get(i));
        }
        for (int i = steps; i < posters.size() - steps; i++) {
            posters.set(i - steps, posters.get(i));
        }
        for (int i = 0; i < steps; i++) {
            posters.set(i + (posters.size() - steps), temp.get(i));
        }
    }

    // Q4: return true if there exists two unprinted posters with the same size
    public boolean hasDuplicates() {
        for (int i = 0; i < posters.size(); i++) {
            for (int j = i + 1; j < posters.size(); j++) {
                if (!posters.get(i).isPrinted() && !posters.get(j).isPrinted() && posters.get(i).getSize() == posters.get(j).getSize()) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<Poster> getPosters() {
        return posters;
    }

    public static void main(String[] args) {
        PosterFactory posterFactory = new PosterFactory();
        System.out.println(posterFactory.getPosters());

        // you must call the methods you wrote for testing, and print getPosters() to verify their behaviour
        System.out.println("the number of black and white posters: " + posterFactory.printMonochrome());
        System.out.println("a new ArrayList containing all A1 and A2 posters: " + posterFactory.hugePosters());
        posterFactory.prioritise(5);
        System.out.println("shift the posters list to the left by 5 places: " + posterFactory.getPosters());
        System.out.println("if there exists two unprinted posters with the same size: " + posterFactory.hasDuplicates());
    }
}
