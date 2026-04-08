import java.util.Arrays;

public class MergeArrays {
    /*
    Return an array that contains the contents of arr1 and arr2 in ascending order. arr1 and arr2 may be of different lengths.
    Precondition:   arr1 and arr2 are independently sorted
                    arr1 and arr2 are not null and contain at least one element
    */
    public static int[] merge(int[] arr1, int[] arr2) {

        // partial algorithm:
        // 1. create a new array of the correct size
        // 2. define indices that will iterate separately through arr1 and arr2
        // 3. iterate through the arrays, copying a suitable element into the new array, and updating indices as appropriate
        // tip: you may need several (non-nested) loops.

        int[] merged = new int[arr1.length + arr2.length];
        int left = 0;
        int right = 0;
        int index = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                merged[index] = arr1[left];
                left++;
                index++;
            }
            else {
                merged[index] = arr2[right];
                right++;
                index++;
            }
        }

        if (left != arr1.length) {
            for (int i = left; i < arr1.length; i++) {
                merged[index] = arr1[i];
                index++;
            }
        }

        if (right != arr2.length) {
            for (int i = right; i < arr2.length; i++) {
                merged[index] = arr2[i];
                index++;
            }
        }

        return merged;
    }

    /*
    test data - make sure you method works for all three cases (L+R same length, L > R, R > L)
     */
    public static void main(String[] args) {
        int[] one = {1, 3, 9, 12};
        int[] two = {2, 4, 8, 15};

        int[] three = {5, 7, 9};
        int[] four = {1, 3, 6, 8, 10, 11, 12, 13};

        int[] five = {0, 1, 2, 3, 6, 8, 11, 13, 14};
        int[] six = {6, 21, 22};

        System.out.println("Expected:\t[1, 2, 3, 4, 8, 9, 12, 15]");
        System.out.println("Actual:\t\t" + Arrays.toString(merge(one, two)));

        System.out.println("Expected:\t[1, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13]");
        System.out.println("Actual:\t\t" + Arrays.toString(merge(three, four)));

        System.out.println("Expected:\t [0, 1, 2, 3, 6, 6, 8, 11, 13, 14, 21, 22]");
        System.out.println("Actual:\t\t" + Arrays.toString(merge(five, six)));
    }
}
