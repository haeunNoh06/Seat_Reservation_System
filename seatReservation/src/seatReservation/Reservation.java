package seatReservation;

import java.util.Scanner;

public class Reservation extends CheckSeat {

	Scanner scan = new Scanner(System.in);

	String userName;
	int seatNum;

	public void run() {
		System.out.print("[좌석구분] S[1] A[2] B[3] >> ");
		int seatClass = scan.nextInt();

		initNameToSelectSeat();
		initNumToSelectSeat();

		switch (seatClass) {
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
			System.out.println("<<< 좌석을 잘못 선택했습니다. >>>");
		}
	}

	// 예약
	/*
	 * TODO: 중복 처리 불가능하게
	 */
	public void reserSeatS() {
		System.out.println("S랭크입니다.");
		if (!seat_S[seatNum - 1].equals("----")) {
			seat_S[seatNum - 1] = this.userName;
			System.out.println("if문 안 들어감");
		} else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	public void reserSeatA() {
		if (!seat_A[seatNum - 1].equals("----"))
			seat_A[seatNum - 1] = this.userName;
		else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	public void reserSeatB() {
		if (!seat_B[seatNum - 1].equals("----"))
			seat_B[seatNum - 1] = this.userName;
		else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	// 이름, 좌석 번호 예약
	public void initNameToSelectSeat() {
		System.out.print("이름 >> ");
		this.userName = scan.next();
	}

	public void initNumToSelectSeat() {
		System.out.print("번호 >> ");
		this.seatNum = scan.nextInt();
	}
}
