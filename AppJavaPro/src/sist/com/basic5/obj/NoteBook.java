package sist.com.basic5.obj;

public class NoteBook {
	private int screenSize;
	private String ram;//������ ����
	private final int COUNT=100;
	
	static {
		System.out.println("staticBlock");
		nation="�ѱ�";
	}
	static String nation;
	
	public NoteBook() {
		System.out.println("NoteBook()");
		ram="16gb";
		cpu="intel 10����";
	}
	private String cpu;
	
	public static void main(String[] args) {
		System.out.println("MainMethod");
		NoteBook notebook=new NoteBook();
	}
}
