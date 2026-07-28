package com.mnu.exam02;

public class Exam_07 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			System.out.print(arr[4]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			//ae.printStackTrace();
			System.out.println("배열의 인덱스를 확인해 주세요");
			System.out.println("에러 메시지 : " + ae.getMessage());
		}catch(Exception e) {
			
		}finally {
			System.out.println("프로그램을 종료합니다");
		}
	}

}
