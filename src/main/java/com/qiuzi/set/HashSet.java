package com.qiuzi.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import com.qiuzi.dataStructures.Set;

public class HashSet<E> implements Set{

    protected static final int DEFAULT_INITIAL_CAPACITY = 16;
    protected static final int MAXIMUM_CAPACITY = 1 << 30;
    
    private HashMap<E,Object> map;
    private static final Object PRESENT = new Object();
    
    protected int size = 0;
    
    public HashSet(){
        map = new HashMap(DEFAULT_INITIAL_CAPACITY);
    }
    
    public HashSet(int initialCapacity){
        
        if(initialCapacity <= 0){
            throw new IllegalArgumentException("Illegal initial capacity: " + initialCapacity);
        }
        else if(initialCapacity > MAXIMUM_CAPACITY){
            map = new HashMap(MAXIMUM_CAPACITY);
        }
        else{
            map = new HashMap(initialCapacity);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(Object object) {
        if(size != 0 && map.containsKey(object)){
            return true;
        }
        return false;
    }

    public void add(Object object) {
        
        if(size == 0 || !map.containsKey(object)){
            map.put((E) object, PRESENT);
        }
    }

    public Object remove(Object object) {
        // TODO Auto-generated method stub
        return null;
    }

    public void clear() {
        // TODO Auto-generated method stub
        
    }

    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        return false;
    }
}