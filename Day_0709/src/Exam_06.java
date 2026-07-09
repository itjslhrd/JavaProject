
public class Exam_06 {
	public static void main(String[] args) {
		double a = 3.14567; // 3.15
		//1 (3.14567 * 100) = > 314.567 + 0.5 = > 315.067
		//2 (int)(315.067) = 315,  315/100. = >3.15
		
		a = (int)(a * 100 + 0.5) / 100.;
		System.out.println("a=" + a);
		
		double aa = 3.14567; 
		System.out.println("aa=" + String.format("%f", aa));
		System.out.println("aa=" + String.format("%.2f", aa));
		System.out.println("aa=" + String.format("%7.2f", aa));
		
	}

}
