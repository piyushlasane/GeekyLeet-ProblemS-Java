## Code
```java
import java.util.Scanner;

// ListNode class definition
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution class with the reverseList method
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = new ListNode(0); // dummy node to start
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return prev.next; // return the new head of the reversed list
    }

    // //second approach:
    // class Solution {
    //     public ListNode reverseList(ListNode head) {
    //         if(head == null || head.next==null) return head;
    //         ListNode newNode = reverseList(head.next);
    //         head.next.next = head;
    //         head.next = null;
    //         return newNode;
    //     }
    // }
}

// Main class to test the solution
public class ReverseLinkedList {
    public static void main(String[] args) {
        // Read input values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for the linked list (space-separated): ");
        String input = sc.nextLine();
        sc.close();
        // Convert input string into a list of integers
        String[] values = input.split(" ");
        ListNode head = null;
        ListNode tail = null;
        
        // Create the linked list
        for (String value : values) {
            ListNode node = new ListNode(Integer.parseInt(value));
            if (head == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node;
                tail = tail.next;
            }
        }

        // Instantiate Solution and reverse the linked list
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.print("Reversed list: ");
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
```