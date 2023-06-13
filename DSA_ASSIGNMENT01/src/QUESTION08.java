/*
 * <aside>
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

</aside>
 */
import java.util.Arrays;

public class QUESTION08 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        
        int[] result = findErrorNums(nums);
        
        System.out.println("Output: " + Arrays.toString(result));
    }
    
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        
        
        int sum = n * (n + 1) / 2;
        
        int duplicate = 0;
        
        for (int num : nums) 
        {
        	
           
            sum -= num;
            
            if (nums[Math.abs(num) - 1] < 0) {
                duplicate = Math.abs(num);
            } else {
                
                nums[Math.abs(num) - 1] *= -1;
            }
        }
        
        int missing = sum + duplicate;
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
    }
}
