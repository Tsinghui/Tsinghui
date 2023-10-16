package com.leetcode.test;

import com.leetcode.base.TreeNode;
import com.leetcode.tree.TreeSolution;

public class TestTreeSolution {
    public static void main(String[] args) {
        Integer[] inOrder = new Integer[]{1,2,4,5,3,6};
        Integer[] preOrder = new Integer[]{4,2,5,1,3,6};
        TreeSolution solution = new TreeSolution();
        TreeNode node = solution.buildTree(preOrder,inOrder);
        solution.inorderTraversal(node).forEach(integer -> System.out.println(integer));
        solution.printTree(node);
    }
}
