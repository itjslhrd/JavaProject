//화폐단위별 매수 출력
//50000,10000,5000,1000,500,100,50,10,5,1
//176874 => 
/* 176874/50000 -> 3 -> 26874
 * 
 */
public class Exam_08 {
	public static void main(String[] args) {
		int pay = 176874;
		int money = 50000;
		
		for(int i=1; i<=10; i++) {
			System.out.print(money + "원 : ");
			int mok = pay / money;
			System.out.println(mok);
			pay = pay % money;
			if(i%2==1) {
				money /= 5;//money=money/5
			}else {
				money /= 2 ;//money=money/2;
			}
		}
		
	}

}
