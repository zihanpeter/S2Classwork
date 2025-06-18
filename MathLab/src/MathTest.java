public class MathTest {
    public static void main(String[] args) {
        System.out.println("Testing...");
        System.out.println();
        System.out.println("findDifference method");
        int test1 = MathLab.findDifference(-7, 5);
        int test2 = MathLab.findDifference(100, 92);
        System.out.println("findDifference(-7, 5) returns 12?");
        System.out.println(test1 == 12);
        System.out.println("findDifference(100, 92) returns 8?");
        System.out.println(test2 == 8);
        System.out.println();

        System.out.println("areaOfCircle method");
        double test3 = MathLab.areaOfCircle(5.5);
        System.out.println("findDifference(5.5) returns approx 95.03?");
        System.out.println(test3 >= 95.03 && test3 <= 95.035);
        System.out.println();

        System.out.println("findFirstX and findSecondX methods");
        double test4 = MathLab.findFirstX(1, -3, 2);
        double test5 = MathLab.findSecondX(1, -3, 2);
        System.out.println("Do they find the correct values for a=1, b=-3, c=2?");
        System.out.println(test4 == 2.0 && test5 == 1.0);
    }
}

