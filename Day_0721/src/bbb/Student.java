package bbb;
//학번(hak)-정수, 이름(name)-문자열, 성별(gender)/true/false, 
//나이(age)-정수, 국어(kor), 영어(eng), 수학(mat)
public class Student {
	private int hak;
	private String name;
	private boolean gender;
	private int age;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {}
	
	public Student(int hak, String name, boolean gender, int age, int kor, int eng, int mat) {
		this.hak=hak;
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	//생성자 없음
	
}
