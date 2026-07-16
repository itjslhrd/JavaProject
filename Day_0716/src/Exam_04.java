//석차 구하기
public class Exam_04 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65} ;
		int rank[] = new int[score.length];
		
		//             1   7
		for(int i=0; i<score.length;i++) {
			rank[i]=1;
			//System.out.print(score[i] + " : ");
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j])
					rank[i]++;
			}
			//System.out.println(rank);
		}
		
		//출력
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i] + ":" + rank[i]);
		}
	}

}
