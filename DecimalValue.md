## 1290. Convert Binary Number in a Linked List to Integer
The problem can be found at the following link: [Question Link](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/)


### Code

```java
import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        
        // int dec = 0;
        // StringBuilder s = new StringBuilder();
        // while (head != null) {
        //     s.append(head.val);
        //     head = head.next;
        // }
        // s.reverse();
        // for (int i = 0, k = 0; i < s.length(); i++, k++) {
        //     if (s.charAt(i) == '1') {
        //         dec += Math.pow(2, k);
        //     }
        // }
        // return dec;
        
        int ans=0;
        for(;head!=null;head=head.next){
            ans = ans<<1 | head.val;
        }
        return ans;
    }
}

public class DecimalValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements (0 or 1 only): ");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        Solution solution = new Solution();
        int decimalValue = solution.getDecimalValue(head);

        System.out.println("The decimal value is: " + decimalValue);
        sc.close();
    }
}

```