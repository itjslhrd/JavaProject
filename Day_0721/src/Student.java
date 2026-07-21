
public class Student {
	int hakbun;//학번
	String name;//이름
	int kor;//국어
	int eng;//영어
	int mat;//수학
	int tot;//총점
	double ave;//평균
	
	Student(){}
	
	Student(int hakbun, String name, int kor, int eng, int mat){
		this.hakbun=hakbun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		//totAve();
	}
	//총점, 평균을 구하는 메소드 구현
	void totAve() {
		tot = kor+eng+mat;
		ave =(double)tot/3;
	}
	//학점을 구하여 반환하는 메소드
	String studentGrade() {
		String grade="F";
		
		
		return grade; 
	}
}
