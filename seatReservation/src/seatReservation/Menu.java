package seatReservation;

import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);

	Reservation reservation = new Reservation();// 예약
	CheckSeat checkSeat = new CheckSeat();// 조회
	CancelSeat cancelSeat = new CancelSeat();// 취소

	void run() {
		System.out.println("▛▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝ ▜");
		System.out.print("▘        ");
		System.out.print("좌석예약");
		System.out.println("         ▝");
		System.out.print("▙▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗ ▟\n");
		while (true) {
			this.selectMenu();
		}
	}

	int selectMenu() {
		System.out.print("\n예약[1]    조회[2]    취소[3]    종료[4]  >> ");
		int menuNum = scan.nextInt();
		switch(menuNum) {
			case 1: // 예약
			case 2: checkSeat.run(); break;
			case 3: // 취소
			case 4: // 종료
			default: System.out.println("잘못 입력하셨습니다.");
		}
		return 0;
	}
}
