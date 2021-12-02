
public class phone {
	
	//버튼갯수
	int btnNum = 12;
	//화면크기
	int displaySize;
	//전화번호
	String number;
	
	//생성자 메소드
	//클래스에 대한 크기를 지정할 때 필드값(클래스가 가지고 있는 변수)도 같이 지정할 수 있는 메소드.
	//특징 : 리턴 값 자체가 없다!, 메소드 이름이 클래스 이름과 같다.
	public phone(int displaySize, String number) {
		this.displaySize = displaySize; // this 라는 키워드는 현재 이 클래스 안에있는 변수에 매개변수 값을 넣는 키워드이다.
		this.number = number;
	}
	//문자를 전송하다.
	public void msgSend() {
		System.out.println("문자를 전송하다");
		
	}
	//전화를 걸다.
	public void call() {
		System.out.println("전화를 걸다.");
	}
	//인터넷 연결하다.
	public void wifi() {
		System.out.println("인터넷 연결");
	}
	//사진을 찍다
	public void Camera() {
		System.out.println("사진을 찍다");
	}
	
	
}
