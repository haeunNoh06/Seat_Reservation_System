package seatReservation;

import java.util.Scanner;

public class Reservation extends CheckSeat {

	Scanner scan = new Scanner(System.in);
	
	String userName;
	int seatNum;

	public void run() {
		System.out.print("[좌석구분] S[1] A[2] B[3] >> ");
		int seatNum = scan.nextInt();
		switch (seatNum) {
		case 1:
			checkSeatS();
			reserSeatS();
			break;
		case 2:
			checkSeatA();
			reserSeatA();
			break;
		case 3:
			checkSeatB();
			reserSeatB();
			break;
		default:
			System.out.println("좌석을 잘못 선택했습니다.");
		}
	}

	// 예약
	public void reserSeatS() {
		initNameToSelectSeat();
		initNumToSelectSeat();
		seat_S[seatNum-1] = this.userName;
	}

	public void reserSeatA() {
		initNameToSelectSeat();
		initNumToSelectSeat();
		seat_A[seatNum-1] = this.userName;
	}

	public void reserSeatB() {
		initNameToSelectSeat();
		initNumToSelectSeat();
		seat_B[seatNum-1] = this.userName;
	}
	
	// 이름, 번호 예약
	public void initNameToSelectSeat() {
		System.out.print("이름 >> ");
		this.userName = scan.next();
	}
	public void initNumToSelectSeat() {
		System.out.print("번호 >> ");
		this.seatNum = scan.nextInt();
	}
}
