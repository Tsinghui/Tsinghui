package com.leetcode.test;

import com.leetcode.base.ListNode;
import com.leetcode.linklist.ListSolution;

import java.util.List;

public class TestListSolution {
    public static void main(String[] args) {
        ListSolution listSolution = new ListSolution();

//        ListNode head = listSolution.buildList(new int[]{1,2});
//        listSolution.printListVal(head);
//        System.out.println(listSolution.isPalindrome(head));

        ListNode list1 = listSolution.buildList(new int[]{1,3,5});
        ListNode list2 = listSolution.buildList(new int[]{2,4,6});
        ListNode merge = listSolution.mergeTwoLists(list1,list2);
        listSolution.printListVal(merge);
    }
}
