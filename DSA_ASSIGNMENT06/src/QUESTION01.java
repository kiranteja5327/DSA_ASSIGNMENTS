/*
 * <aside>
💡 **Question 1**

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

</aside>
 */
import java.util.ArrayList;
import java.util.List;

public class QUESTION01 {
    public static int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int current = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = current;
                current++;
                start = i + 1;
            } else {
                start = i + 1;
                while (i < n && s.charAt(i) == 'D') {
                    i++;
                }
                perm[i] = current + i - start;
                current += i - start + 1;
            }
        }

        perm[n] = current;

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";

        int[] perm = findPermutation(s);
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}

