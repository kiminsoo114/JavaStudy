package naver.com;


public class Test9 {
	public void test1(int score) {

	
	char grade =' ';
	
	if(score>=90) {
		grade='A';
	}else if(score>=80){
		grade='B';
	}else if(score>=70){
		grade='C';
	}else {
			grade='D';
		}
		System.out.println("����� ������"+grade+"�Դϴ�.");
	
	}

public static void main(String[] args) {
	Test9 t=new Test9();
	t.test1(65);
}	
}