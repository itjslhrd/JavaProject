
public class Exam_03 {
	//합계 출력 메소드
	//Data : 30+67+55+79+97+65+33+78+96+58+94+32=784
	static void dataTotal(int arr[]) {
		int sum=0;
		System.out.print("Data : ");
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]);
			if(i==arr.length-1)
				System.out.print("=");
			else
				System.out.print("+");
		}
		System.out.println(sum);
	}
	
	//평균이상 점수를 구하여 출력하는 메소드 
	//Data :  30  67  55  79  97  65  33 78  96  58  94  32
    //평균(65.33)이상 :  67  79   78  96  94
	static void dataAverage(int arr[]) {
		int sum=0;
		System.out.print("Data : ");
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
			System.out.printf("%4d", arr[i]);
		}
		System.out.print("\n");
		double ave = (double)sum / arr.length;
		System.out.printf("평균(%.2f)이상 : ", ave);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=ave)
				System.out.printf("%4d", arr[i]);
		}
		System.out.print("\n");
	}
	//오름차순 정렬 메소드
    //Data :  30  67  55  79  97  65  33 78  96  58  94  32
    //Sort  :  30  32  33  55  58  65  67 78  79  94  96  97
	static void dataSort(int arr[]) {
		int temp[] = arr.clone();
		//sort
		
		//출력
		System.out.print("Data :" );
		for(int i=0; i<arr.length;i++) {
			
		}
		System.out.print("\n");
		System.out.print("Sort :" );
		for(int i=0; i<temp.length;i++) {
			
		}
		System.out.print("\n");
		
	}
	//배열요소중 최대값을 반환하는 메소드
    //Data :  30  67  55  79  97  65  33 78  96  58  94  32
    //최대값 : 97
	static int dataMax(int arr[]) {
		int max = arr[0];
		System.out.print("Data : ");
		for(int i=0; i<arr.length;i++) {
			System.out.printf("%4d", arr[i]);
			if(max < arr[i])
				max = arr[i];
		}
		System.out.print("\n");
		
		return max;
	}
	
	public static void main(String[] args) {
		int score[] = {30,67,55,79,97,65,33,78,96,58,94,32};
		//1.
		dataTotal(score);
		
		//2.
		dataAverage(score);
		
		//3.
		dataSort(score);
		
		//4.
		int max = dataMax(score);
		System.out.println("최대값 : " + max);
	}

}
