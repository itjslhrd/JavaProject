package aaa;

public class Exam_09 {

	public static void main(String[] args) {
		Person p = new Person();
		//p.ssn=1111;
		p.setSsn("1234567");
		p.setName("김사람");
		p.setGender(true);
		p.setAge(30);
		
		System.out.println("이름 : " + p.getName());
		System.out.println("주민번호 : " + p.getName());
		System.out.println("나이 : " + p.getName());
		if(p.isGender()) {
			System.out.println("성별 : " + "남");
		}else {
			
		}
		

	}

}
