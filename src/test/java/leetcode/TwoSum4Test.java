package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TwoSum4Test {

    @Test
    public void twoSum4Test(){
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(6);

        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right.right = new TreeNode(7);

        TwoSum4 twoSum4 = new TwoSum4();
//        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Integer> arrayList = twoSum4.makeTreeToArray(node, arr);
//
//        for (Integer i : arrayList){
//            System.out.println(i);
//        }

        Assert.assertTrue(twoSum4.findTarget(node, 9));
        Assert.assertFalse(twoSum4.findTarget(node, 28));
    }
}
