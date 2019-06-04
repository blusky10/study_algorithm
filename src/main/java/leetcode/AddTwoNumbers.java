//package leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//
////Add Two Numbers
////Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
////Output: 7 -> 0 -> 8
////Explanation: 342 + 465 = 807.
//public class AddTwoNumbers {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        int i = Integer.parseInt(makeListNodeToNumber(l1).reverse().toString())
//                + Integer.parseInt(makeListNodeToNumber(l2).reverse().toString());
//
//        return makeNumberToListNodeList(i);
//    }
//
//    public StringBuilder makeListNodeToNumber(ListNode l){
//        StringBuilder number = new StringBuilder();
//        number.append(l.val);
//
//        if (l.next != null){
//            number.append(makeListNodeToNumber(l.next));
//        }
//
//        return number;
//    }
//
//    public ListNode makeNumberToListNode(int n){
//        String number = Integer.toString(n);
//
//        char[] chars = number.toCharArray();
//        int index = chars.length-1;
//
//        List<ListNode> listNodes = new ArrayList<>();
//
//        for (int i=index; i>0; i--){
//            listNodes.add(new ListNode(chars[i]-'0'));
//        }
//
//        return l;
//    }
//
//    public ListNode makeListToNode(List<ListNode> listNodes){
//        int size = listNodes.size();
//
//        if (size == 1){
//            return listNodes.get(0);
//        }
//
//
//
//
//    }
//}
//
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}