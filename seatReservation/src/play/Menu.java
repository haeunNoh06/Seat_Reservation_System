package play;

import java.util.Scanner;

public class Menu {
	
	Scanner scan = new Scanner(System.in);

	Reservation reservation = new Reservation();// 예약
	CheckSeat checkSeat = new CheckSeat();// 조회
	CancelSeat cancelSeat = new CancelSeat();// 취소
	
	boolean isEnded = false;

	void run() {
		System.out.println("▛▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝▝ ▜");
		System.out.print("▘        ");
		System.out.print("좌석예약");
		System.out.println("         ▝");
		System.out.print("▙▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗▗ ▟\n\n");
		
		checkSeat.run();
		
		while ( !isEnded ) {
			this.selectMenu();
		}
		System.out.println("<<< 좌석 예약이 종료되었습니다. >>>");
	}

	void selectMenu() {
		System.out.print("\n예약[1]    조회[2]    취소[3]    종료[4]  >> ");
		int menuNum = scan.nextInt();
		System.out.println();
		switch(menuNum) {
			case 1: reservation.run(); break;
			case 2: checkSeat.run(); break;
			case 3: cancelSeat.run(); break;
			case 4: this.isEnded = true; break;
			default: System.out.println("<<< 다시 입력하세요. >>>");
		}
	}
}
