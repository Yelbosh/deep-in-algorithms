package com.qiuzi.dataStructures;

public abstract class Tree<E> implements DataStructure {
    
    protected Tree[] childs;
    
    protected Tree(int n){
        this.childs = new Tree[n];
    }
}
