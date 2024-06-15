import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i + 1 to avoid using the same element twice
                if (nums[i] + nums[j] == target) {
                    res[k++] = i;
                    res[k++] = j;
                    return res;
                }
            }
        }
        return res;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        if (result[0] != 0 || result[1] != 0) {
            System.out.println("Indices of the two numbers are: [" + result[0] + " " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        scanner.close();
    }
}