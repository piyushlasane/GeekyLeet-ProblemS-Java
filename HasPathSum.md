```java
import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    private boolean dfs(TreeNode root, int s) {
        if (root == null)
            return false;
        s -= root.val;
        if (root.left == null && root.right == null && s == 0)
            return true;
        return dfs(root.left, s) || dfs(root.right, s);
    }
}

public class HasPathSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the tree (use -1 for null nodes):");
        int n = scanner.nextInt();
        Integer[] values = new Integer[n];
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            values[i] = val == -1 ? null : val;
        }

        TreeNode root = buildTree(values);

        System.out.println("Enter the target sum:");
        int targetSum = scanner.nextInt();

        scanner.close();

        Solution solution = new Solution();
        System.out.println("Path exists: " + solution.hasPathSum(root, targetSum));
    }

    private static TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}
```