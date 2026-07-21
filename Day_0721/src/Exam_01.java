//회원가입, 로그인, 로그아웃
public class Exam_01 {
	public static void main(String[] args) {
		//회원가입
		Member m1 = new Member();
		
		boolean bool = m1.memberRegister();
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		m1.name="강학생";
		m1.id="abcd";
		m1.pass="1234";
		m1.phone="010-2222-2222";
		bool = m1.memberRegister();
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		
		Member m2 = new Member("이사람","user", "1234","010-1111-1111");
		bool = m2.memberRegister();
		if(bool) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}

	}

}
