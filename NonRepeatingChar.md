## [Question]
The problem can be found at the following link: [Question Link](PasteLink)

### Code

```java
import java.util.*;

class Solution {
    // Function to find the first non-repeating character in a string
    static char nonRepeatingChar(String S) {
        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a']++;
        }
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i) - 'a'] == 1) return S.charAt(i);
        }
        return '$';
    }
}

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Description of the code
        System.out.println("This program finds the first non-repeating character in a string.");

        System.out.println("Enter the number of test cases:");
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the leftover newline

        for (int testCase = 1; testCase <= t; testCase++) {
            System.out.println("Test Case " + testCase + ":");

            System.out.println("Enter the string:");
            String S = scanner.nextLine();

            char result = Solution.nonRepeatingChar(S);
            if (result == '$') {
                System.out.println("No non-repeating character found.");
            } else {
                System.out.println("First non-repeating character: " + result);
            }
        }

        scanner.close();
    }
}

```