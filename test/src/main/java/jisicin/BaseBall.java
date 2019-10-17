package jisicin;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String baseball[] = new String[3];
		boolean success = false;

		System.out.println("=== 숫자 야구 Game Start ===");

		// 숫자 생성
		for (int i = 0; i < 3; i++) {
			baseball[i] = String.valueOf((int) (Math.random() * 9));

			for (int j = 0; j < i; j++) {
				if (baseball[i].equals(baseball[j])) {
					i--;
					break;
				}
			}
		}

		// 정답 확인
		System.out.println(Arrays.toString(baseball));

		try {
			while (!success) {
				int ball = 0;
				int strike = 0;

				System.out.println("3개의 숫자를 입력하세요 EX) 1 2 3");
				String inputNum = sc.nextLine();

				String[] num = inputNum.split(" ");

				if (num.length != 3) {
					throw new Exception();
				}

				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						if (i == j) {
							if (num[i].equals(baseball[j])) {
								strike++;
							}
						} else {
							if (num[i].equals(baseball[j])) {
								ball++;
							}
						}

					}
				}

				if (strike == 3) {
					success = true;
				}

				System.out.println(ball + "볼" + strike + "스트라이크");

				if (success) {
					System.out.println("게임 종료");
				}

			}
		} catch (Exception e) {
			System.out.println("잘못입력하셨습니다. 게임을 종료합니다");
		}

	}

}
