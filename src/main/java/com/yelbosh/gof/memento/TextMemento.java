package com.yelbosh.gof.memento;

import java.util.LinkedList;

public class TextMemento {
    //String state;
    int i = 0;
    LinkedList memoList;
    
    TextMemento() {
        //state = null;
        memoList = new LinkedList();
    }
    
    void addMemo(String state) {
        memoList.addLast(state);
    }
    
    String getState() {
        if(memoList.size() != 0) {
            String tmp = (String)memoList.getLast();
            memoList.removeLast();
            return tmp;
        } else {
            return null;
        }      
    }
}
