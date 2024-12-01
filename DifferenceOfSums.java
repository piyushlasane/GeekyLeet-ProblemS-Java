import java.util.*;

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0, num2 = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i % m == 0)
                num2 += i;
            else
                num1 += i;
        }
        return num1 - num2;
    }
}

public class DifferenceOfSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Description of the code
        System.out.println("This program calculates the difference between the sum of integers not divisible by 'm' and those divisible by 'm' for numbers from 1 to 'n'.");
        
        System.out.println("Enter the number of test cases:");
        int t = scanner.nextInt(); // Number of test cases
        Solution solution = new Solution();

        for (int testCase = 1; testCase <= t; testCase++) {
            System.out.println("Test Case " + testCase + ":");
            
            System.out.println("Enter the value of n (upper limit):");
            int n = scanner.nextInt();
            
            System.out.println("Enter the value of m (divisor):");
            int m = scanner.nextInt();
            
            int result = solution.differenceOfSums(n, m);
            System.out.println("Difference of Sums: " + result);
        }
        
        scanner.close();
    }
}