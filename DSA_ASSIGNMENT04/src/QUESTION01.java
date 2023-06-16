/*
 * <aside>
💡 **Question 1**
Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

**Example 1:**

Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

Output: [1,5]

**Explanation:** Only 1 and 5 appeared in the three arrays.

</aside>
 */
import java.util.ArrayList;
import java.util.List;

public class QUESTION01 {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int ptr1 = 0, ptr2 = 0, ptr3 = 0;
        List<Integer> result = new ArrayList<>();

        while (ptr1 < arr1.length && ptr2 < arr2.length && ptr3 < arr3.length) {
            if (arr1[ptr1] == arr2[ptr2] && arr2[ptr2] == arr3[ptr3]) {
                result.add(arr1[ptr1]);
                ptr1++;
                ptr2++;
                ptr3++;
            } else if (arr1[ptr1] < arr2[ptr2]) {
                ptr1++;
            } else if (arr2[ptr2] < arr3[ptr3]) {
                ptr2++;
            } else {
                ptr3++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
        System.out.println(commonElements);
    }
}

