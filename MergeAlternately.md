## 1768. Merge Strings Alternately
The problem can be found at the following link: [Question Link](https://leetcode.com/problems/merge-strings-alternately/description/)

### Code

```java
import java.util.Scanner;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i++));
        }
        if (i < word1.length()) ans.append(word1.substring(i));
        else if (i < word2.length()) ans.append(word2.substring(i));
        return ans.toString();
    }
}

public class MergeAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        Solution solution = new Solution();
        String result = solution.mergeAlternately(word1, word2);

        System.out.println("Merged string: " + result);

        sc.close();
    }
}
```