package com.yelbosh.gof.adapter;

/**
 * ������ģʽ�еĶ�������ģʽ����������Ҫ����Ķ����ϣ���װ��ͬ�Ľӿڣ�Ȼ������������Ľӿڽ������伴��
 * ����Ӧ�ã�Android ListView�е�DataAdapter����BaseAdapter�ж���setItem��getItem��������ListView��ʵ�����ǵ�������Щ�������ķ���
 * @author Yabo
 * ���ó����� ϵͳ��Ҫʹ�����е��࣬���Ǵ����Ѿ�û�취����ϵͳ����Ҫ����ˣ������뽨��һ�������ظ�ʹ�õ��࣬������˴�֮��û��̫�������һЩ�࣬����һЩ
 * ��������������һЩ�࣬���к�����
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
	
	//���䷽��
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
