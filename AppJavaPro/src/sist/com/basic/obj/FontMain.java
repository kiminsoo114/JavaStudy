package sist.com.basic.obj;

public class FontMain {
	static String nation;
	public static void main(String[] args) {
		new Font().fontFace="����";
		new Font().fontFace="�ü�";
		System.out.println(new Font().fontFace);
		nation = "�찣��";
		System.out.println(FontMain.nation);
		System.out.println(Font.weight);
	}
	
}
