package com.leetcode.tree;

import com.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeSolution {

    public TreeNode tree;

    public TreeNode buildTree(Integer[] preOrder,Integer[] inOrder){

        Integer headVal = inOrder[0];
        Integer leftLen = 0;
        while (leftLen<preOrder.length){
            if (headVal==preOrder[leftLen]){
                break;
            }
            leftLen++;
        }
        TreeNode head = new TreeNode(preOrder[0]);
        head.left = buildTree(preOrder,inOrder,0,leftLen-1,1,leftLen);
        head.right = buildTree(preOrder,inOrder,leftLen+1,preOrder.length-1,leftLen+1,preOrder.length);

        return head;
    }

    public TreeNode buildTree(Integer[] preOrder,Integer[] inOrder,int ps,int pe,int is,int ie){
        Integer headVal = inOrder[is];
        TreeNode head = new TreeNode(headVal);
        int leftLen = 0;
        for (int i = ps;i<pe;i++){
            if(preOrder[i]==headVal){
                break;
            }
            leftLen++;
        }
//        int rightLen = pe-ps-leftLen;
        head.left = buildTree(preOrder,inOrder,ps,ps+leftLen-1,is+1,is+leftLen);
        head.right = buildTree(preOrder,inOrder,ps+leftLen+1,pe,is+leftLen+1,ie);

        return head;
    }

    public void printTree(TreeNode tree){

    }

    //94 ¶þ²æÊ÷ÖÐÐò±éÀú
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList<>();

        return retList;

    }

}
