package play;

import java.util.Scanner;

public class Reservation extends CheckSeat {

	Scanner scan = new Scanner(System.in);

	int seatClass;
	String userName;
	int seatNum;

	public void run() {
		initNameToSelectSeat();
		initSeatLevelToSelectSeat();
		initNumToSelectSeat();

		switch (this.seatClass) {
		case 1:
			reserSeatS();
			checkSeatS();
			break;
		case 2:
			reserSeatA();
			checkSeatA();
			break;
		case 3:
			reserSeatB();
			checkSeatB();
			break;
		default:
			System.out.println("<<< 좌석을 잘못 선택했습니다. >>>");
		}
		System.out.println("<<< 예약되었습니다! >>>");
	}

	// 예약
	public void reserSeatS() {
		if ( seat_S[seatNum - 1] == "----" ) {
			seat_S[seatNum - 1] = this.userName;
		} else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	public void reserSeatA() {
		if ( seat_A[seatNum - 1] == "----" )
			seat_A[seatNum - 1] = this.userName;
		else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	public void reserSeatB() {
		if ( seat_B[seatNum - 1] == "----" )
			seat_B[seatNum - 1] = this.userName;
		else
			System.out.println("<<< 이미 예약된 좌석입니다. >>>");
	}

	// 이름, 좌석 번호 예약
	public void initSeatLevelToSelectSeat() {
		System.out.print("[좌석구분] S[1] A[2] B[3] >> ");
		this.seatClass = scan.nextInt();
	}
	
	public void initNameToSelectSeat() {
		System.out.print("이름 >> ");
		this.userName = scan.next();
	}

	public void initNumToSelectSeat() {
		System.out.print("번호 >> ");
		this.seatNum = scan.nextInt();
	}
}
