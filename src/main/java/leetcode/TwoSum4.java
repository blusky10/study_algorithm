package leetcode;

//Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

import java.util.ArrayList;

public class TwoSum4 {

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> empList = new ArrayList<>();

        ArrayList treeToList = makeTreeToArray(root, empList);

        for (int i=0; i<treeToList.size(); i++){
            int node = (int) treeToList.get(i);
            int findNumber = k-node;

            for (int j=treeToList.size()-1; j>i; j--){
                int rNode = (int) treeToList.get(j);
                if (rNode == findNumber){
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList makeTreeToArray(TreeNode root, ArrayList<Integer> arr){
        while(true){
            if (root.left != null){
                arr = makeTreeToArray(root.left, arr);
            }
            arr.add(root.val);
            if (root.right != null){
                arr = makeTreeToArray(root.right, arr);
            }
            break;
        }
        return arr;
    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
