package seatReservation;

import java.util.Scanner;

public class Reservation {
	
	Scanner scan = new Scanner(System.in);

	// 초반 실행할 때 메뉴
	void run() {
		while(true) {
			System.out.println("=======**********========");
			System.out.println("=======* 좌석예약 *========");
			System.out.println("=======**********========");
			this.selectMenu();
		}
	}
	
	int selectMenu() {
		System.out.println("예약[1]    조회[2]    취소[3]    종료[4]  >> ");
		return scan.nextInt();
	}
}
