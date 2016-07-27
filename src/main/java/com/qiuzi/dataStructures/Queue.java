package com.qiuzi.dataStructures;
import java.util.NoSuchElementException;

public class Queue<E> implements DataStructure{

    /*
     * 队列，后进后出
     * 使用数组存储
     */
    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private int size = 0;
    
    private Object[] queue;
    
    Queue(){
        this.queue = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    
    Queue(int array_capacity){
        this.queue = new Object[array_capacity];
    }
    
    //入队列
    public boolean enqueue(Object object){
        
        if(size == this.queue.length){
            throw new IllegalStateException("Queue full");
        }
        else if(object == null){
            throw new NullPointerException();
        }
        else{
            queue[size] = object;
            size ++;
            return true;
        }
    }
    
    //出队列
    public Object dequeue(){
        
        if(queue.length == 0){
            throw new NoSuchElementException();
        }
        else{
            
            Object x = queue[0];
            for(int i = 0; i < size-1;i++){
                queue[i] = queue[i+1];
            }
            queue[size-1] = null;
            size --;
            return x;
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
            throw new IllegalStateException("Queue empty");
        }
        else{
            for(int i = 0;i <size;i++){
                if(queue[size].equals(object)){
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
        else if(queue[0].equals(object)){
            
            return dequeue();
        }
        else{
            return null;
        }
    }

    public void add(Object object) {
        enqueue(object);
    }

    public void clear() {
        for(int i = 0;i < size;i++){
            queue[i] = null;
        }
        size = 0;
    }
}
