
public class Exam_11 {
	public static void main(String[] args) {
		int a=95;
		//a 가 90이상 'A', 80이상 'B', 70이상 'C', 60이상 'D'
		String grade="";
		switch(a/10) {
			case 10:
				//grade="A";
				//break;
			case 9:
				grade="A";
				break;
			case 8:
				grade="B";
				break;
			case 7:
				grade="C";
				break;
		}
		
	}

}
