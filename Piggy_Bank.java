
public class Piggy_Bank {

	int money;

	public Piggy_Bank(int money) {
		this.money = money;
	}

	// 돈을 넣는다
	public void deposit(int inputMoney) {
		this.money += inputMoney;
	}

	// 돈을 뺀다(인출)
	public void withDraw(int outMoney) {
		this.money -= outMoney;
	}
	//돈 출력
	public void showMoney(int money) {
		System.out.println("현재 금액 : " + this.money);
	}
}
