## 58. Length of Last Word
The problem can be found at the following link: [Question Link](https://leetcode.com/problems/length-of-last-word/description/)

### Code

```java
import java.util.Scanner;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] ans = s.split(" ");
        int n = ans.length - 1;
        String res = ans[n];
        return res.length();
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Solution solution = new Solution();
        int result = solution.lengthOfLastWord(s);

        System.out.println("Length of the last word: " + result);

        sc.close();
    }
}
```