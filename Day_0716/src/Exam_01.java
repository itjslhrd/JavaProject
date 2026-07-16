
public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90,60,80,70,55,88,77,65} ;

		// 선택정렬(오름차순)
		System.out.println("--- 선택정렬(오름차순) ---");
		int[] arr = score.clone();
		for(int i=0; i<arr.length-1 ;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
			}
		}
		//출력
		System.out.print("정렬 전 : ");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		System.out.print("정렬 후 : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		
	
		// 버블정렬(내림차순)
		System.out.println("--- 버블정렬(내림차순) ---");
		int var[] = score.clone();
		for(int i=0; i<var.length-1; i++) {
			for(int j= 0; j<var.length-i-1; j++) {
				if(var[j] < var[j+1]) {
					int imsi = var[j];
					var[j] = var[j+1];
					var[j+1] = imsi;
				}
			}
		}
		//출력
		System.out.print("정렬 전 : ");
		for(int i=0; i<score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		System.out.print("정렬 후 : ");
		for(int i=0; i<var.length;i++) {
			System.out.print(var[i] + " ");
		}
		System.out.print("\n");
		
	}

}
