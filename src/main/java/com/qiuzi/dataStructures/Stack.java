package com.qiuzi.dataStructures;

public class Stack<E> implements DataStructure{
    
    /*
     * 栈，先进后出
     * 使用数组存储
     */
    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private int size = 0;
    private Object[] stack;
    
    Stack(){
        this.stack = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    
    Stack(int initial_capacity){
        this.stack = new Object[initial_capacity];
    }
    
    public void push(Object object){
        
        if(size == this.stack.length){
            throw new IllegalStateException("Stack full");
        }
        else if(object == null){
            throw new NullPointerException();
        }
        else{
            stack[size] = object;
            size ++;
        }
    }
    
    public E pop(){
        
        if(size == 0){
            throw new IllegalStateException("Stack empty");
        }
        else{
            E e = (E) stack[size-1];
            stack[size-1] = null;
            size --;
            return e;
        }
    }

    public boolean isEmpty() {
        return size == 0?true:false;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object object) {
        
        boolean objectExistFlag = false;
        if(object == null){
            throw new NullPointerException();
        }
        else if(size == 0){
            throw new IllegalStateException("Stack empty");
        }
        else{
            for(int i = 0;i <size;i++){
                if(stack[size].equals(object)){
                    objectExistFlag = true;
                    break;
                }
            }
        }
        return objectExistFlag;
    }

    public Object remove(Object object) {
        
        if(object == null){
            throw new NullPointerException();
        }
        else if(stack[size-1].equals(object)){
            return pop();
        }
        else{
            return null;
        }
    }

    public void add(Object object) {
        push(object);
    }

    public void clear() {
        for(int i = 0;i < size;i++){
            stack[i] = null;
        }
        size = 0;
    }
}
