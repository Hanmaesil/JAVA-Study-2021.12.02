import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Piggy_Bank bank = new Piggy_Bank(1000);
//		System.out.println("���� �ݾ� : " + bank.money);
		bank.showMoney(bank.money);
		//�Ա�
		System.out.print("�Աݾ� �Է� : ");
		int intputMoney = sc.nextInt();
		bank.deposit(intputMoney);
		bank.showMoney(bank.money);
		
//		System.out.println("���� �ݾ� : " + bank.money);
		//���
		System.out.print("����� �Է� : ");
		int outMoney = sc.nextInt();
		bank.withDraw(outMoney);
		bank.showMoney(bank.money);
//		System.out.println("���� �ݾ� : " + bank.money);
		
	}
	//���� ����ϴ� �޼ҵ� showMoney()
	
	
}
