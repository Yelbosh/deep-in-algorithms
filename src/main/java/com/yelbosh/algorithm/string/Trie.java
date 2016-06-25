package com.yelbosh.algorithm.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trie {
	private Vertex root = new Vertex();
	 
    protected class Vertex {
        protected int words; // 单词个数
        protected int prefixes; // 前缀个数
        protected Vertex[] edges; // 子节点
 
        Vertex() {
            this.words = 0;
            this.prefixes = 0;
            edges = new Vertex[26];
            for (int i = 0; i < edges.length; i++) {
                edges[i] = null;
            }
        }
    }
    
    //获取所有单词
    public List<String> listAllWords() {
    	List<String> words = new ArrayList<String>();
    	Vertex[] edges = root.edges;
    	for(int i=0;i<edges.length;i++){
    		if(edges[i] != null){
    			String word = "" + (char)('a' + i);
        		depthFirstSearchWords(words, edges[i], word);
    		}
    	}
    	return words;
    }
    
    //深度优先搜索单词
    private void depthFirstSearchWords(List<String> words, Vertex vertex,
            String wordSegment) {
    	if(vertex.words != 0){
    		words.add(wordSegment);
    	}
    	Vertex[] edges = vertex.edges;
    	for(int i=0;i<edges.length;i++){
    		if(edges[i] != null){
    			String word = wordSegment + (char)('a' + i);
        		depthFirstSearchWords(words, edges[i], word);
    		}
    	}
    }
    
    //计算指定前缀单词的个数
    public int countPrefixes(String prefix) {
    	return countPrefixes(root, prefix);
    }
    
    private int countPrefixes(Vertex vertex, String prefixSegment) {
    	if(prefixSegment.length() == 0)
    		return vertex.prefixes;
    	else{
    		char prefix0 = Character.toLowerCase(prefixSegment.charAt(0));
    		int index = prefix0 - 'a';
    		if(vertex.edges[index] == null)
    			return 0;
    		return countPrefixes(vertex.edges[index],prefixSegment.substring(1));
    	}
    }
    
    //计算完全匹配的单词个数
    public int countWords(String word) {
    	return countWords(root, word);
    }
    
    public int countWords(Vertex vertex, String word) {
    	if(word.length() == 0)
    		return vertex.words;
    	else{
    		char prefix0 = Character.toLowerCase(word.charAt(0));
    		int index = prefix0 - 'a';
    		if(vertex.edges[index] == null)
    			return 0;
    		return countWords(vertex.edges[index], word.substring(1));
    	}
    }
    
    //向Trie中添加单词
    public void addWord(String word) {
    	addWord(word,root);
    }
    
    //向Trie中添加单词
    public void addWord(String word, Vertex vertex) {
    	if(word.length() == 0){
    		vertex.prefixes++; //完全匹配也算前缀的一种
    		vertex.words++;
    	}
    	else{
    		vertex.prefixes++;
    		char prefix0 = Character.toLowerCase(word.charAt(0));
    		int index = prefix0 - 'a';
    		if(vertex.edges[index] == null)
    			vertex.edges[index] = new Vertex();
    		addWord(word.substring(1), vertex.edges[index]);
    	}
    }
    
    //获取指定字段前缀匹配最长的单词
    public String getMaxMatchWord(String word) {
    	String s = "";
        String temp = "";// 记录最近一次匹配最长的单词
        char[] w = word.toCharArray();
        Vertex vertex = root;
        for (int i = 0; i < w.length; i++) {
            char c = w[i];
            c = Character.toLowerCase(c);
            int index = c - 'a';
            if (vertex.edges[index] == null) {// 如果没有子节点
                if (vertex.words != 0)// 如果是一个单词，则返回
                    return s;
                else
                    // 如果不是一个单词则返回null
                    return null;
            } else {
                if (vertex.words != 0)
                    temp = s;
                s += c;
                vertex = vertex.edges[index];
            }
        }
        // trie中存在比指定单词更长（包含指定词）的单词
        if (vertex.words == 0)//
            return temp;
        return s;
    }
    
    //测试接口
    public static void test(){
    	Trie trie = new Trie();
        trie.addWord("abcedfddddddd");
        trie.addWord("a");
        trie.addWord("ba");
        trie.addWord("abce");
        trie.addWord("abcedfdddd");
        trie.addWord("abcef");
 
//        List<String> list = trie.listAllWords();
//        Iterator listiterator = list.listIterator();
//        while (listiterator.hasNext()) {
//	        String s = (String) listiterator.next();
//	        System.out.println(s);
//        }
//        int result = trie.countPrefixes("a");
//        int result = trie.countWords("abcef");
        String words = trie.getMaxMatchWord("abcedf");
        System.out.println(words);
    }
}
