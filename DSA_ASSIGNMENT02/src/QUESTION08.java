/*
 * Question 8
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 */
import java.util.Arrays;

public class QUESTION08 {

    public static int minimumScore(int[] nums, int k) {
        int n = nums.length;

        if (n == 1) {
            return 0;
        }

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[n - 1];

        int minScore = max - min;

        for (int i = 1; i <= k; i++) {
            int newMin = nums[i];
            int newMax = nums[n - 1 - (k - i)];

            minScore = Math.min(minScore, newMax - newMin);
        }

        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimumScore(nums, k);
        System.out.println(minScore);
    }
}

