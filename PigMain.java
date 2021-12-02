import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Piggy_Bank bank = new Piggy_Bank(1000);
//		System.out.println("현재 금액 : " + bank.money);
		bank.showMoney(bank.money);
		//입금
		System.out.print("입금액 입력 : ");
		int intputMoney = sc.nextInt();
		bank.deposit(intputMoney);
		bank.showMoney(bank.money);
		
//		System.out.println("현재 금액 : " + bank.money);
		//출금
		System.out.print("인출금 입력 : ");
		int outMoney = sc.nextInt();
		bank.withDraw(outMoney);
		bank.showMoney(bank.money);
//		System.out.println("현재 금액 : " + bank.money);
		
	}
	//돈을 출력하는 메소드 showMoney()
	
	
}
