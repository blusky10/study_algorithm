package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddTowNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();


    @Test
    public void test(){
        ListNode ll1 = new ListNode(2);
        ListNode ll2 = new ListNode(4);
        ListNode ll3 = new ListNode(3);
        ll1.next = ll2;
        ll2.next = ll3;


        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;

        ListNode listNode = addTwoNumbers.addTwoNumbers(ll1, l1);

        Assert.assertEquals(7, listNode.val);

    }

}
