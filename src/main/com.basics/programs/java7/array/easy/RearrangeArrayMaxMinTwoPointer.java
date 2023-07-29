package programs.java7.array.easy;

import java.util.Arrays;

public class RearrangeArrayMaxMinTwoPointer {
    public static void main(String[] args) {
        /*Rearrange an array in maximum minimum form using Two Pointer Technique*/
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };  // Output: arr[] = {7, 1, 6, 2, 5, 3, 4}
        int n = arr.length;

        System.out.println("Actual Array ");
        System.out.println(Arrays.toString(arr));

        // Auxiliary array to hold modified array
        int temp[] = arr.clone();

        // Indexes of smallest and largest elements
        // from remaining array.
        int small = 0, large = n - 1;

        // To indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < n; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }

        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }
}
