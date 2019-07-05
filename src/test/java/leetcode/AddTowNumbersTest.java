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

//        ListNode l4 = new ListNode(5);
//        ListNode l5 = new ListNode(6);
//        ListNode l6 = new ListNode(4);
//        l4.next = l5;
//        l5.next = l6;

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
    public void makeIntMethodTest(){

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



        StringBuilder stringBuilder = addTwoNumbers.makeListNodeToNumber(l1);

        Integer.parseInt(stringBuilder.reverse().toString());

        Assert.assertEquals("1999999999", stringBuilder.toString());
    }


    @Test
    public void setListNodeTest(){

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

        StringBuilder re = new StringBuilder();

        addTwoNumbers.setListNode(l1, re);

        System.out.println(re.toString());
    }

}
