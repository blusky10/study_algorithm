//package leetcode;
//
//import org.junit.Assert;
//import org.junit.Test;
//
///**
// * Created by Sanghyun KIM on 2019-05-15.
// */
//public class AddTowNumbersTest {
//
//    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//
//
//    @Test
//    public void test(){
//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(4);
//        ListNode l3 = new ListNode(3);
//        l1.next = l2;
//        l2.next = l3;
//
//        ListNode l4 = new ListNode(5);
//        ListNode l5 = new ListNode(6);
//        ListNode l6 = new ListNode(4);
//        l4.next = l5;
//        l5.next = l6;
//
//        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l4);
//
//        Assert.assertEquals(7, listNode.val);
//
//    }
//    @Test
//    public void makeIntMethodTest(){
//
//        ListNode l1 = new ListNode(8);
//        ListNode l2 = new ListNode(0);
//        ListNode l3 = new ListNode(7);
//        l1.next = l2;
//        l2.next = l3;
//
//        StringBuilder stringBuilder = addTwoNumbers.makeListNodeToNumber(l1);
//
//        Assert.assertEquals("807", stringBuilder.toString());
//    }
//
//    @Test
//    public  void makeListNodeTest(){
//        ListNode listNode = addTwoNumbers.makeNumberToListNodeList(345);
//        Assert.assertEquals(5, listNode.val);
//    }
//}
