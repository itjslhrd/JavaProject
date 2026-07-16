//5! = 5 * 4 * 3 * 2 * 1
public class Exam_16 {
	static int function(int num) {
		if(num==1)
			return 1;
		return num * function(num-1);
	}
	public static void main(String[] args) {
		function(5);
	}

}
