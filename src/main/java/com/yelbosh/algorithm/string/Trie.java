package com.yelbosh.algorithm.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trie {
	private Vertex root = new Vertex();
	 
    protected class Vertex {
        protected int words; // ���ʸ���
        protected int prefixes; // ǰ׺����
        protected Vertex[] edges; // �ӽڵ�
 
        Vertex() {
            this.words = 0;
            this.prefixes = 0;
            edges = new Vertex[26];
            for (int i = 0; i < edges.length; i++) {
                edges[i] = null;
            }
        }
    }
    
    //��ȡ���е���
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
    
    //���������������
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
    
    //����ָ��ǰ׺���ʵĸ���
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
    
    //������ȫƥ��ĵ��ʸ���
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
    
    //��Trie����ӵ���
    public void addWord(String word) {
    	addWord(word,root);
    }
    
    //��Trie����ӵ���
    public void addWord(String word, Vertex vertex) {
    	if(word.length() == 0){
    		vertex.prefixes++; //��ȫƥ��Ҳ��ǰ׺��һ��
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
    
    //��ȡָ���ֶ�ǰ׺ƥ����ĵ���
    public String getMaxMatchWord(String word) {
    	String s = "";
        String temp = "";// ��¼���һ��ƥ����ĵ���
        char[] w = word.toCharArray();
        Vertex vertex = root;
        for (int i = 0; i < w.length; i++) {
            char c = w[i];
            c = Character.toLowerCase(c);
            int index = c - 'a';
            if (vertex.edges[index] == null) {// ���û���ӽڵ�
                if (vertex.words != 0)// �����һ�����ʣ��򷵻�
                    return s;
                else
                    // �������һ�������򷵻�null
                    return null;
            } else {
                if (vertex.words != 0)
                    temp = s;
                s += c;
                vertex = vertex.edges[index];
            }
        }
        // trie�д��ڱ�ָ�����ʸ���������ָ���ʣ��ĵ���
        if (vertex.words == 0)//
            return temp;
        return s;
    }
    
    //���Խӿ�
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
