package com.qiuzi.dataStructures;

public interface DataStructure {

    public boolean isEmpty();
    
    public int size();
    
    public boolean contains(Object object);
    
    public Object remove(Object object);
    
    public void add(Object object);
    
    public void clear();
}
