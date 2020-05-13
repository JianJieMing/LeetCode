package simple;

/**
 * @author jianjieming
 * @date 2020/5/13 14:08
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        System.out.println(l1);
        System.out.println(l2);

//        System.out.println("合并后: " + mergeTwoLists(l1, l2));
        System.out.println("合并后: " + mergeTwoLists2(l1, l2));
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    private static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val){
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 != null) head.next = l1;
        if (l2 != null) head.next = l2;
        return dummy.next;
    }

    /**
     * @author jianjieming
     * @date 2020/5/13 14:10
     */
    public static class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            ListNode head = this;
            StringBuilder sb = new StringBuilder();
            while (head != null) {
                sb.append(head.getVal()).append(" ");
                head = head.next;
            }
            return sb.toString();
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
