package com.leetcode.tree;

import com.leetcode.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeSolution {

    public TreeNode tree;

    public TreeNode buildTree(Integer[] preOrder,Integer[] inOrder){
        if(preOrder == null || inOrder==null){
            return null;
        }

        return buildTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
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
        if(ie>is && leftLen>0){
            head.left = buildTree(preOrder,inOrder,ps,ps+leftLen-1,is+1,is+leftLen);
        }
        if (pe>ps){
            head.right = buildTree(preOrder,inOrder,ps+leftLen+1,pe,is+leftLen+1,ie);
        }

        return head;
    }

    public void printTree(TreeNode tree){

    }

    //94 ¶þ²æÊ÷ÖÐÐò±éÀú
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList<>();
        inorder(root,retList);
        return retList;

    }

    public void inorder(TreeNode root,List<Integer> retList){
        if (root == null){
            return;
        }
        inorder(root.left,retList);
        retList.add(root.val);
        inorder(root.right,retList);
    }

}
