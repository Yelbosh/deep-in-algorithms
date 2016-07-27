package com.qiuzi.dataStructures;

import java.util.Collection;
import java.util.Iterator;

public interface Set extends DataStructure{

    public boolean isEmpty();
    
    public int size();
    
    public boolean contains(Object object);
    
    public void add(Object object);
    
    public Object remove(Object object);
    
    public void clear();

    public Iterator iterator();

    public Object[] toArray();

    public boolean containsAll(Collection c);

    public boolean addAll(Collection c);

    public boolean retainAll(Collection c);

    public boolean removeAll(Collection c);
}