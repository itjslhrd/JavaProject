
//학생 성적처리(번호,이름, 국어, 영,수학, 총, 평균)
class HakSeng{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	HakSeng(){}
	
	HakSeng(int bun, String name, int kor, int eng, int mat){
		this.bun=bun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
		//totAve();
		//hakSengPrint();
	}
	
	//총점, 평균을 계산하는 메소드
	void totAve() {
		tot = kor + eng + mat;
		ave = tot / 3.;
	}
	
	//출력 메소드
	void hakSengPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\n");
	}
}
public class Exam_12 {
	public static void main(String[] args) {
		HakSeng h1 = new HakSeng();
		h1.bun=1101;
		h1.name="김학생";
		h1.kor=90;
		h1.eng=88;
		h1.mat=85;
		h1.totAve();
		h1.hakSengPrint();
		
		HakSeng h2 = new HakSeng(1103,"이학생",97,66,88);
		h2.totAve();
		h2.hakSengPrint();
		
	}

}
