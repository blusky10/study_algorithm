package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddTowNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();


    @Test
    public void test(){
        ListNode ll1 = new ListNode(2);
        ListNode ll2 = new ListNode(4);
        ListNode ll3 = new ListNode(3);
        ll1.next = ll2;
        ll2.next = ll3;


        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;

        ListNode listNode = addTwoNumbers.addTwoNumbers(ll1, l1);

        Assert.assertEquals(7, listNode.val);

    }
    @Test
    public void makeNumberToListNodeTest(){
        ListNode listNode = addTwoNumbers.makeNumberToListNode(807);

        while (listNode.next != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    @Test
    public void makeNumberTest(){
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(0);
        ListNode l6 = new ListNode(9);
        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;

        long l = addTwoNumbers.makeNumber(l1);

        System.out.println(l);
    }

    @Test
    public void test1(){
        long i = Long.parseLong("1000000000000000000000000000001");

        System.out.println(i);
    }


    @Test
    public void makeNumberTest1(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(0);
        ListNode l6 = new ListNode(0);
        ListNode l7 = new ListNode(0);
        ListNode l8 = new ListNode(0);
        ListNode l9 = new ListNode(0);
        ListNode l10 = new ListNode(0);
        ListNode l11 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = l10;
        l10.next = l11;

//[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        System.out.println(addTwoNumbers.makeNumber(l1));

        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Math.pow(10, 31) * 1 + 664);

        Double d = Math.pow(10, 31) * 1 + 664;
        System.out.println(d.longValue());
    }


}
