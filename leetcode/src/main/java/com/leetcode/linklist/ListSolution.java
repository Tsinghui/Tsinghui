package com.leetcode.linklist;

import com.leetcode.base.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSolution {

    public  ListNode buildList(int[] vals){
        if (vals == null || vals.length==0){
            return null;
        }
        ListNode ret = new ListNode(vals[0]);
        ListNode head = ret;
        for (int i=1;i<vals.length;i++){
            head.next = new ListNode(vals[i]);
            head = head.next;
        }
        return ret;
    }

    public  ListNode buildList(Integer[] vals){
        if (vals == null || vals.length==0){
            return null;
        }
        ListNode ret = new ListNode(vals[0]);
        ListNode head = ret;
        for (int i=1;i<vals.length;i++){
            head.next = new ListNode(vals[i]);
            head = head.next;
        }
        return ret;
    }

    public void printListVal(ListNode head){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    //206反转链表
    public ListNode reverseList(ListNode head) {
        ListNode curr = head,pre = null;
        while (curr.next != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;

        }
        return pre;
    }

    //234回文链表  需要找空间O(1)的解法
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        while (head != null){
            vals.add(head.val);
            head = head.next;
        }
        for (int i=0,j=vals.size()-1;i<=j;i++,j--){
            if (vals.get(i) != vals.get(j)){
                return false;
            }
        }
        return true;
    }

    //141 环形链表 需要找空间O(1)的解法
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null ){
            if(nodeSet.contains(head)){
               return true;
            }
            nodeSet.add(head);
            head = head.next;
        }
        return false;
    }

    //21合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();
        while (list1 != null || list2!=null) {
            while (list2 != null) {
                if(list1 == null ||list1.val > list2.val){
                    vals.add(list2.val);
                    list2 = list2.next;
                } else {
                    break;
                }
            }
            if (list1 != null){
                vals.add(list1.val);
                list1 = list1.next;
            }
        }
//        if (vals.size() >0){
//            ListNode ret = new ListNode(vals.get(0));
//            ListNode head = ret;
//            for (int i=1;i<vals.size();i++){
//                head.next = new ListNode(vals.get(i));
//                head = head.next;
//            }
//            return ret;
//        }
//        return null;
        return buildList(vals.toArray(new Integer[0]));
    }
}
