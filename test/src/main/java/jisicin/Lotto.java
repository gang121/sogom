package jisicin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Lottery lt = new Lottery();

		lt.playLottery();
		lt.inputNum();
		lt.generate();
		lt.getResult();
	}

	public static class Lottery {
		Scanner sc = new Scanner(System.in);
		private int[] lotteryNum = new int[6];
		private int[] array = new int[6];
		private int cnt = 0;

		// 로또 프로그램 시작
		void playLottery() {
			System.out.println("*** 로또 추첨기 ***");
		}

		// 로또 응모번호 입력
		void inputNum() {
			System.out.print("응모번호 입력(1~45, 6개) \n");
			for (int i = 0; i < 6; i++) {
				System.out.print((i + 1) + "번째 응모번호 : ");
				lotteryNum[i] = sc.nextInt();
			}
		}

		// 로또 당첨번호 뽑기
		void generate() {
			Random rn = new Random();
			for (int i = 0; i < 6; i++) {
				array[i] = (int) ((Math.random() * 45) + 1);

				// 중복 제거
				for (int j = 0; j < i; j++) {
					if (array[i] == array[j]) {
						i--;
						break;
					}
				}
			}
		}

		// 로또 당첨번호 확인 및 당첨갯수 확인
		void getResult() {

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lotteryNum[i] == array[j]) {
						cnt += 1;
					}
				}
			}

			System.out.println("응모 번호 : " + Arrays.toString(lotteryNum));
			System.out.println("당첨 번호 : " + Arrays.toString(array));
			System.out.println("당첨 갯수 : " + cnt);

			if (cnt == 6) {
				System.out.println("축하합니다! 1등입니다.");
			} else if (cnt == 5) {
				System.out.println("축하합니다! 2등입니다.");
			} else if (cnt == 4) {
				System.out.println("축하합니다! 3등입니다.");
			} else if (cnt == 3) {
				System.out.println("축하합니다! 4등입니다.");
			} else if (cnt == 2) {
				System.out.println("축하합니다! 5등입니다.");
			} else if (cnt == 1) {
				System.out.println("축하합니다! 6등입니다.");
			} else if (cnt == 0) {
				System.out.println("축하합니다! 꽝입니다.");
			}

		}
	}
}
