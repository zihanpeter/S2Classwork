import java.util.Arrays;

    /*
    modify this class as follows:
          - maintain a counter that increments every time the merge method is called (use an instance variable)
          - print the counter's value as part of a message at the beginning of each call to merge (first call is Call #1)
          - in addition, output the state of data by calling showData before each merge is performed
          - in the main method, experiment with at least 3 sizes of population
          - visually inspect the output to confirm that:
               - the number of calls to merge matches what you were taught exactly
               - the state of the array before the final merge matches what you were taught exactly
     */

public class MergeSort {
    private int[] data;
    private int counter;

    public MergeSort(int populationSize) {
        data = new int[populationSize];
        randomize();
        counter = 0;
    }

    /*
    assigns random integer values between 1 and 99 inclusive to each element of data
     */
    public void randomize() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 99) + 1;
        }
    }

    /* outputs the values of data in a readable format */
    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    /*
    sorts data into ascending order
    preconditions: data is not null, data.length > 0
     */
    public void mergeSort() {
        mergeSortHelper(0, data.length - 1);
    }

    private void mergeSortHelper(int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortHelper(left, mid);
            mergeSortHelper(mid + 1, right);

            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        counter++;
        System.out.println("Call #" + counter);
        showData();

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = data[i++];
        }

        while (j <= right) {
            temp[k++] = data[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            data[left + x] = temp[x];
        }

    }

    /*
    test the class with at least 3 different sizes of array
    - use even and odd numbers, along with varying sizes
    - show the data before and after the merge
     */
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(4);
        MergeSort mergeSort1 = new MergeSort(5);
        MergeSort mergeSort2 = new MergeSort(10);

        System.out.println("Before sorting: ");
        mergeSort.showData();
        mergeSort.mergeSort();
        System.out.println("After sorting: ");
        mergeSort.showData();

        System.out.println("Before sorting: ");
        mergeSort1.showData();
        mergeSort1.mergeSort();
        System.out.println("After sorting: ");
        mergeSort1.showData();

        System.out.println("Before sorting: ");
        mergeSort2.showData();
        mergeSort2.mergeSort();
        System.out.println("After sorting: ");
        mergeSort2.showData();
    }
}
