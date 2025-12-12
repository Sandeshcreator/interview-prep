package array;

import java.util.Arrays;

public class MoveNegativeElement  {
    public static void main(String[] args) {
        int[] arr = {9, -1, 8, -2, 7, -3, 6, -4, 5};

        moveNegativeElements(arr);
        System.out.println("After moving negative element in left side: " + Arrays.toString(arr));
    }

    private static void moveNegativeElements(int[] arr) {
        //        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i] > 0) {
//                    res[j] = arr[i];
//                } else {
//                    res[j + 1] = arr[i];
//                    j = j + 1;
//                }
//            }
//
//        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;

            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
    }

}
