
public class phone {
	
	//��ư����
	int btnNum = 12;
	//ȭ��ũ��
	int displaySize;
	//��ȭ��ȣ
	String number;
	
	//������ �޼ҵ�
	//Ŭ������ ���� ũ�⸦ ������ �� �ʵ尪(Ŭ������ ������ �ִ� ����)�� ���� ������ �� �ִ� �޼ҵ�.
	//Ư¡ : ���� �� ��ü�� ����!, �޼ҵ� �̸��� Ŭ���� �̸��� ����.
	public phone(int displaySize, String number) {
		this.displaySize = displaySize; // this ��� Ű����� ���� �� Ŭ���� �ȿ��ִ� ������ �Ű����� ���� �ִ� Ű�����̴�.
		this.number = number;
	}
	//���ڸ� �����ϴ�.
	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�");
		
	}
	//��ȭ�� �ɴ�.
	public void call() {
		System.out.println("��ȭ�� �ɴ�.");
	}
	//���ͳ� �����ϴ�.
	public void wifi() {
		System.out.println("���ͳ� ����");
	}
	//������ ���
	public void Camera() {
		System.out.println("������ ���");
	}
	
	
}
