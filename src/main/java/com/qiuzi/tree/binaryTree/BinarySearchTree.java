package com.qiuzi.tree.binaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchTree {
    
    BinarySearchTree left;
    BinarySearchTree right;
    int depth;
    int data;
    
    //�ж�node��ֵ�Ƿ��������ҽڵ��ֵ֮��
    boolean valueisBetweenChildren(BinarySearchTree node){
        Map map = new HashMap<Integer,Integer>();
        
        //left��right��־���ڵ��ֵ�Ƿ������ҽڵ�ֵ֮�䣬1Ϊ�ڣ�0Ϊ����
        int left = 1, right = 1; 
        if(node.left != null && node.left.data > node.data)  
            left = 0;
        if(node.right != null && node.right.data < node.data)  
            right = 0;
        if(left == 1 && right == 1)  
            return true;
        return false;
    }
    
    //�ж�node�Ƿ�ƽ�⣬�Ƿ���true�����򷵻�false
    boolean isBalanced(BinarySearchTree node){
        
        int depth_left = 0, depth_right = 0;
        if(node == null)
            return true;
        else{
            if(isBalanced(node.left) && isBalanced(node.right)){
                if(node.left != null)
                    depth_left = node.left.depth; 
                if(node.right != null)
                    depth_right = node.right.depth;
                node.depth = depth_left >= depth_right?depth_left+1:depth_right+1;
                if(valueisBetweenChildren(node))  
                    return true;
            }
            return false;
        }
    }
}
