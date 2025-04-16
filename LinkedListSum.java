import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListSum {

    public static ListNode sumPairs(ListNode head) {
        Set<Integer> sumSet = new TreeSet<>(); // Sorted & unique

        for (ListNode curr1 = head; curr1 != null; curr1 = curr1.next) {
            for (ListNode curr2 = curr1; curr2 != null; curr2 = curr2.next) {
                sumSet.add(curr1.val + curr2.val);
            }
        }

        // Convert set to linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : sumSet) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper to create linked list
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = createList(new int[]{1, 2, 3});
        ListNode result = sumPairs(head);
        printList(result);  // Output: 2 -> 3 -> 4 -> 5 -> 6
    }
}
