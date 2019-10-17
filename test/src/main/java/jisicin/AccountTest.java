package jisicin;

public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		System.out.println("새로운 계좌가 만들어졌습니다.");
		System.out.println(obj.withdraw(50000));
		
		System.out.println("새로운 계좌가 만들어졌습니다.");
		System.out.println(obj.deposit(100000));
		
		System.out.println("고객 #1 계좌 잔고 =" + obj.getBalance1());
		System.out.println("고객 #2 계좌 잔고 =" + obj.getBalance2());
	}

	static class Account {
		public int balance1 = 0;
		public int balance2 = 0;

		int withdraw(int amount) {
			this.balance1 += amount;
			System.out.println(amount + "원 저축");
			return amount;
		}

		int deposit(int amount) {
			this.balance2 += amount;
			System.out.println(amount + "원 저축");
			return amount;
		}

		public int getBalance1() {
			return balance1;
		}

		public void setBalance1(int balance) {
			this.balance1 = balance;
		}

		public int getBalance2() {
			return balance2;
		}

		public void setBalance2(int balance) {
			this.balance2 = balance;
		}

	}
}
