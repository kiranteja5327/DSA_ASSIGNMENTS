/*
 * Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
 * 
 */
import java.util.Arrays;

public class QUESTION05 {

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxProduct = maximumProduct(nums);
        System.out.println(maxProduct);
    }
}
