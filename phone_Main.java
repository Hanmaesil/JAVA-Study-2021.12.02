
public class phone_Main {

	public static void main(String[] args) {
		
		//phone Ŭ���� ���
		//Ŭ������ ��ü��(������) = new phone();
		phone iPhone = new phone(30,"22222");
//		iPhone.number = "22222";
//		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();
		
		phone galaxy = new phone(50,"111111111111");
//		galaxy.number = "111111111111";
//		galaxy.displaySize = 50;
		
		phone lollipop = new phone(10, "011");
//		lollipop.number = "011";
//		lollipop.displaySize = 10;
		
		
		
	}

}
