package sist.com.basic.obj;

public class FontMain {
	static String nation;
	public static void main(String[] args) {
		new Font().fontFace="±¼¸²";
		new Font().fontFace="±Ã¼­";
		System.out.println(new Font().fontFace);
		nation = "¿ì°£´Ù";
		System.out.println(FontMain.nation);
		System.out.println(Font.weight);
	}
	
}
