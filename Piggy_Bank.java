
public class Piggy_Bank {

	int money;

	public Piggy_Bank(int money) {
		this.money = money;
	}

	// ���� �ִ´�
	public void deposit(int inputMoney) {
		this.money += inputMoney;
	}

	// ���� ����(����)
	public void withDraw(int outMoney) {
		this.money -= outMoney;
	}
	//�� ���
	public void showMoney(int money) {
		System.out.println("���� �ݾ� : " + this.money);
	}
}
