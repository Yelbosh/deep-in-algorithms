package com.yelbosh.gof.adapter;

/**
 * 适配器模式中的对象适配模式，就是在需要适配的对象上，封装相同的接口，然后调用适配对象的接口进行适配即可
 * 典型应用：Android ListView中的DataAdapter，如BaseAdapter中都有setItem和getItem方法，在ListView中实际上是调用了这些适配对象的方法
 * @author Yabo
 * 适用场景： 系统需要使用现有的类，但是此类已经没办法满足系统的需要；因此，我们想建立一个可以重复使用的类，用于与彼此之间没有太大关联的一些类，包括一些
 * 将来可能引进的一些类，进行合作。
 *
 */
public class TextObjectAdapter implements Shape {
	private Text text;
	
	public TextObjectAdapter(Text t){this.text = t;}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("object adapter draw");
	}

	public void border() {
		// TODO Auto-generated method stub
		System.out.println("object adapter border");
	}
	
	//适配方法
	public void setText(String text){
		this.text.setText(text);
	}
	
	public String getText(){
		return text.getText();
	}
	
	public static void main(String[] args){
		Text text = new Text();
		TextObjectAdapter adapter = new TextObjectAdapter(text);
		adapter.setText("My Love");
		System.out.println(adapter.getText());
	}
	
	
}
