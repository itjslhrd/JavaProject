//형변환 예제
public class Exam_02 {
	public static void main(String[] args) {
		char ch = 'A';//문자('') 또는 정수(65000)
		int in1 = 65;
		double do1 = 3.14;
		
		int chInt = ch;//문자를 정수로 형변환(자동) ==> 65
		System.out.println("chInt = " + chInt);
		
		char intCh = (char)in1;//
		System.out.println("intCh = " + intCh);
		int a = 75000;
		char intCh1 = (char)a;
		System.out.println("intCh1 = " + intCh1);
		
		int intA = 100;
		double intDouble = intA;//자동형변화
		System.out.println("intDouble = " + intDouble);//100.0
		
		double doubleA = 3.14;
		int doubleInt = (int)doubleA;//강제형변환
		System.out.println("doubleInt = " + doubleInt);//3
		
	}

}
