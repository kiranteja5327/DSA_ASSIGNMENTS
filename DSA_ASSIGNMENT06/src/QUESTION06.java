/*
 <aside>
💡 **Question 6**

An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

</aside>
 */
import java.util.*;

public class QUESTION06 {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> originalList = new ArrayList<>();
        
        Arrays.sort(changed);
        
        for (int num : changed) {
            if (countMap.get(num) == 0) {
                continue;
            }
            
            int half = num / 2;
            
            if (countMap.containsKey(half) && countMap.get(half) > 0) {
                originalList.add(half);
                countMap.put(half, countMap.get(half) - 1);
                countMap.put(num, countMap.get(num) - 1);
            } else {
                return new int[0]; 
            }
        }
        
        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }
        
        return original;
    }
    
    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        
        System.out.println(Arrays.toString(original)); 
    }
}

