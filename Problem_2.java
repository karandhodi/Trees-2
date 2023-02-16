// Time Complexity : O(n) where n is number of nodes in tree
// Space Complexity : O(h) where h is the height of tree
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We use pre-order recursive traversal here. We use a global variable sum. We initialize a variable num to 0 and pass it after updating the number constructed so far to
   next node in traversal. When we see a leaf node, we add the sum found so far to global sum. In this way after traversing the tree, we have the total sum and return it.
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum;
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        sumNum(root, 0);
        return sum;
    }

    private void sumNum(TreeNode root, int num){
        if(root == null)
            return;
        
        if(root.left == null && root.right == null)
            sum += num * 10 + root.val;
        

        sumNum(root.left, num * 10 + root.val);
        sumNum(root.right, num * 10 + root.val);
    }
}