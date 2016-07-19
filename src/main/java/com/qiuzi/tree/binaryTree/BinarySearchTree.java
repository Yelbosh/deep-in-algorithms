package com.qiuzi.tree.binaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchTree {
    
    BinarySearchTree left;
    BinarySearchTree right;
    int depth;
    int data;
    
    //判断node的值是否在其左右节点的值之间
    boolean valueisBetweenChildren(BinarySearchTree node){
        Map map = new HashMap<Integer,Integer>();
        
        //left和right标志根节点的值是否处于左右节点值之间，1为在，0为不在
        int left = 1, right = 1; 
        if(node.left != null && node.left.data > node.data)  
            left = 0;
        if(node.right != null && node.right.data < node.data)  
            right = 0;
        if(left == 1 && right == 1)  
            return true;
        return false;
    }
    
    //判断node是否平衡，是返回true，否则返回false
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
