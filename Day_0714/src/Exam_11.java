//N개의 배열에 저장된 데이터를 출력하고 합계, 평균을 구하여 출력
/*  Data : 90  75  80  77  85  79  95  80  85  90  77
 *  총점 : xxx
 *  평균 : xx.xx
 */
public class Exam_11 {
	public static void main(String[] args) {
		int score[] = {90,75,80,77,85,79,95,80,85,90,77};
		// 기본 for() 이용시
		System.out.print("Data : ");
		int sum=0;
		for(int i=0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
			sum += score[i];
		}
		
		double ave = (double)sum/score.length;
		char grade = 'F';
		if(ave>=90)
			grade = 'A';
		else if(ave>=80)
			grade='B';
		else if(ave>=70)
			grade='C';
		else if(ave>=60)
			grade='D';
					
		System.out.print("\n합계 : " + sum);
		System.out.print("\n평균 : " + ave);
		System.out.print("\n학점 : " + grade);
		
		//확장 for() 이용시
		System.out.print("\nData : ");
		sum=0;
		for(int s : score) {
			System.out.printf("%4d", s);
			sum += s;
		}
		
		ave = (double)sum/score.length;
		grade = 'F';
		if(ave>=90)
			grade = 'A';
		else if(ave>=80)
			grade='B';
		else if(ave>=70)
			grade='C';
		else if(ave>=60)
			grade='D';
					
		System.out.print("\n합계 : " + sum);
		System.out.print("\n평균 : " + ave);
		System.out.print("\n학점 : " + grade);
		
		
	}

}
