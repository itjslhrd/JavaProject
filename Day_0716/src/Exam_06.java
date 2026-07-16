//2차원 배열의 정렬 5*6
//번호, 국어, 영어, 수학, 총점, 석차
// 0    1    2    3    4    5
public class Exam_06 {
	public static void main(String[] args) {
		//int student[][] = new int[5][6]
		int student[][]= {{1,90,80,70,0,0}, {5,70,86,75,0,0},
				{3,95,88,77,0,0},{4,70,78,97,0,0},
				{2,89,85,75,0,0}};
		
		//총점 계산
		for(int i=0; i<student.length; i++) {
			student[i][4] = student[i][1] + student[i][2] + student[i][3]; 
		}
/*		과목수가 많은 경우 유리
		for(int i=0; i<student.length; i++) {
			for(int j=1; j<4; j++) {
				student[i][4] = student[i][4] + student[i][j];
			}
		}
*/		
		//순위 계산
		for(int i=0; i<student.length; i++) {
			student[i][5]=1;
			for(int j=0; j<student.length; j++) {
				if(student[i][4] < student[j][4])//총점기준
					student[i][5]++;
			}
		}
		
		//출력(입력자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<student.length; i++) {//줄
			for(int j=0; j<student[i].length; j++) {//칸
				System.out.print(student[i][j] + "\t");
			}
			System.out.print("\n");
		}
/*		
		//출력(석차순으로) 또는 번호순
		for(int i=0; i<student.length-1; i++ ) {
			for(int j=i+1; j<student.length-1; j++) {
				if(student[i][0] > student[j][0]) {
					//번호기준 오름차순
					for(int k=0; k<6; k++) {
						int imsi = student[i][k];
						student[i][k] = student[j][k];
						student[j][k] = imsi;
					}
				}
			}
		}
*/
		//출력(석차순으로) 또는 번호순
		//줄단위 교환(참조방식)
		for(int i=0; i<student.length-1; i++ ) {
			for(int j=i+1; j<student.length; j++) {
				if(student[i][0] > student[j][0]) {
					//번호기준 오름차순
					int imsi[] = student[i];
					student[i] = student[j];
					student[j] = imsi;
				}
			}
		}
		
		//출력
		//출력(번호순 자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<student.length; i++) {//줄
			for(int j=0; j<student[i].length; j++) {//칸
				System.out.print(student[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
	}

}
