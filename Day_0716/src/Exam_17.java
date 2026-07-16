// 1 ~ 10 합계 ( 10+9+ .... +1) = 55
public class Exam_17 {
	static int funcSum(int num) {
		if(num==1)
			return 1;
		return num + funcSum(num-1);
	}
	public static void main(String[] args) {
		System.out.println(funcSum(10));

	}

}
