package sist.com.basicQuiz.java;

public class Quiz2 {
	private String name;
	private int age;
	private String sex;
	private String local;
	private String ddi;
	
	public Quiz2() {
		super();
	}
	
	public Quiz2(String name, int age, String sex, String local, String ddi) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.local = local;
		this.ddi = ddi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDdi() {
		return ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	@Override
	public String toString() {
		return "Quiz2 [name=" + name + ", age=" + age + ", sex=" + sex + ", local=" + local + ", ddi=" + ddi + "]";
	}

	
}
