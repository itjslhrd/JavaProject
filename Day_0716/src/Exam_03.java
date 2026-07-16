//석차 구하기
public class Exam_03 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65} ;
		//             1   7
		for(int i=0; i<score.length;i++) {
			int rank=1;
			System.out.print(score[i] + " : ");
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j])
					rank++;
			}
			System.out.println(rank);
		}
		
	}

}
