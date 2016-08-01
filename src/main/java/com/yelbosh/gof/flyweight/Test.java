package com.yelbosh.gof.flyweight;
/**
 *  享元模式，有些应用程序得益于在其整个设计过程中采用对象技术，但简单化的实现代价极大。使用面向对象的抽象化，可能会造成庞大的对象群，造成空间的巨大消耗，而影响性能。在文档编辑器例子中如果一个字符对应一个对象，那么一篇文档所要容纳的对象将是非常的庞大耗费大量的内存
 *  所以需要共享，将基本的字符进行共享，将使得字符对象变得有限。
 */
import java.io.*;
import java.util.*;

public class Test  {
    public static void main(String[] args) {
        int[] size = {8, 9, 10, 11, 12};
        String[] color = {"FFFFFF", "000000", "FF00FF", "CCCCCC", "111111"};
        FontFactory myFontFactory = new FontFactory();
        String aString = "A test string";
        for(int i = 0; i < aString.length(); i++) {
            int j = 0;
            j = (int)Math.floor(Math.random()*5);
            //System.out.println("j is:" + j + "---" +aString.substring(i, i+1));
            myFontFactory.GetFlyWeight(aString.substring(i, i+1)).SetFont(color[j], size[j]);
        }
        
        Hashtable myHashTable = myFontFactory.GetFactory();
        System.out.println("Hash table size is:" + myHashTable.size());
        for(int i = 0; i < aString.length(); i++) {
            ((Font)myHashTable.get(aString.substring(i, i+1))).GetFont();
        }
    }
}