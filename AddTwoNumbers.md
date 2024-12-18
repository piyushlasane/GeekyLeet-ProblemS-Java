## 2. Add Two Numbers
The problem can be found at the following link: [Question Link](https://leetcode.com/problems/add-two-numbers/description/)


### Code

```java
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return dummy.next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input linked lists
        System.out.println("Enter digits of the first number separated by spaces(in reverse oder as mentioned in question):");
        ListNode l1 = createLinkedList(sc.nextLine());
        System.out.println("Enter digits of the second number separated by spaces(in reverse oder as mentioned in question):");
        ListNode l2 = createLinkedList(sc.nextLine());

        // Add two numbers
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        System.out.print("Reversed Result: ");
        printLinkedList(result);
        sc.close();
    }

    // Helper function to create a linked list from input
    private static ListNode createLinkedList(String input) {
        String[] nums = input.split(" ");
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (String num : nums) {
            curr.next = new ListNode(Integer.parseInt(num));
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper function to print a linked list
    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
```