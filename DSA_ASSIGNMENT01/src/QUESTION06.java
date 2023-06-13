/*
 * <aside>
💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true

</aside>
 */
import java.util.HashSet;

public class QUESTION06 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        
        boolean containsDuplicate = containsDuplicate(nums);
        
        System.out.println("Output: " + containsDuplicate);
    }
    
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
}

