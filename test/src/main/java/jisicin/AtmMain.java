package jisicin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {

		ATMachine atm = new ATMachine(1000, 500000, "admin");
		boolean bool = true;

		Scanner sc = new Scanner(System.in);

		while (bool) {
			atm.displayMenu();
			System.out.print("메뉴를 선택하세요 >>");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				atm.createAccount();
				break;
			case 2:
				atm.checkMoney();
				break;
			case 9:
				System.out.println("안녕히 가세요!");
				bool = false;
				break;
			default:
				System.out.println(" 정확하게 입력해주세요.");
				break;
			}
		}
	}

}

class ATMachine {
	private Account[] accountArray;
	private int nMachineBalance;
	private int nMaxAccountNum;
	private int nCurrentAccountNum;
	private String strManagerPassword;

	public ATMachine(int i, int j, String string) {
		// TODO Auto-generated constructor stub
	}

	public void checkMoney() {
		// TODO Auto-generated method stub

	}

	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("----------개설----------");
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("암호 입력: ");
		int assword = sc.nextInt();

	}

	public void displayMenu() {
		System.out.println("----------------------");
		System.out.println("-      KPU bank      -");
		System.out.println("----------------------");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 계좌 조회");
		System.out.println("9. 업무 종료");
	}

}

class Account {

	private int nID;
	private int nBalance;
	private String strAccountName;
	private String strPassword;

	public Account(int id, int money, String name, String password) {
		this.nID = id;
		this.nBalance = money;
		this.strAccountName = name;
		this.strPassword = password;

	}

	boolean authenticate(int id, String passwd) {

		return false;
	}

	public int getnID() {
		return nID;
	}

	public int getnBalance() {
		return nBalance;
	}
}
