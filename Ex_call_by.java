
public class Ex_call_by {

	public static void main(String[] args) {

		int num1 = 30;
		int[] numarray = { 1, 2 };
		change(num1);
		change2(numarray);
		System.out.println("�ٲﰪ : " + num1);
		//�ȹٲ� ���� : call by value ->> num1���� �ٸ� ������ num���� �Ѿ�� �ٲ�ű� �����̴�.
		System.out.println("�ٲﰪ : " + numarray[0]);
		//�ٲ� ���� : call by reference �ּҰ��� �����ִ°ű� ������ �ȿ� ���� �ٲ�� �� �ּҿ� �ִ� ���Ұ� �ٲ��.

	}

	public static void change(int num) {
		num = 10;
	}

	public static void change2(int[] numarry) {
		numarry[0] = 10;
	}
}
