/* 반복문 : for(), while(), do~while()
 * 
 *  // 이름을 5번 출력하시오 
 */
public class Exam_04 {
	public static void main(String[] args) {
		int i;
		for(i=1; i<=5; i++) {//i=1,2,3,4,5,6
			System.out.println(i + "나종민");
		}
		System.out.println("i=" + i);//6
		
		int j;
		for(j=0; j<5; j+=2) {//j=0,2 4, 6
			System.out.println(j);
		}
		System.out.println(j);//6
		
		for(int k=1; k<6; k++) {
			System.out.println(k);//1 2 3 4 5==> 6
		}
		
	}

}
