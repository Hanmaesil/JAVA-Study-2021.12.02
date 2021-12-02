
public class Ex_call_by {

	public static void main(String[] args) {

		int num1 = 30;
		int[] numarray = { 1, 2 };
		change(num1);
		change2(numarray);
		System.out.println("바뀐값 : " + num1);
		//안바뀐 이유 : call by value ->> num1값이 다른 공간의 num으로 넘어가서 바뀐거기 때문이다.
		System.out.println("바뀐값 : " + numarray[0]);
		//바뀐 이유 : call by reference 주소값을 보내주는거기 때문에 안에 값이 바뀌면 그 주소에 있는 원소가 바뀐다.

	}

	public static void change(int num) {
		num = 10;
	}

	public static void change2(int[] numarry) {
		numarry[0] = 10;
	}
}
