import java.util.Arrays;

class Chejo{
	String name;
	int[] score;
	int max,min;
	
	Chejo(String name, int[] score){
		this.name=name;
		this.score=score;
	}
	//최대, 최소
	void maxMin() {
		max = score[0];
		min = score[0];
		for(int i=1; i<score.length; i++) {
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
	}
	//출력
	void dataPrint() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + Arrays.toString(score));
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
	}
	
}
public class Exam_14 {
	public static void main(String[] args) {
		Chejo c = new Chejo("김학생", new int[] {9,3,7,4,6,5,8,7});
		c.maxMin();
		c.dataPrint();
		c = new Chejo("오학생", new int[] {1,2,3,4,5,6,7,8,9});
		c.maxMin();
		c.dataPrint();
		c = new Chejo("강학생", new int[] {15,23,54,77,45,74,88,34,55});
		c.maxMin();
		c.dataPrint();
	}

}
