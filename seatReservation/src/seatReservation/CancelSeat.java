package seatReservation;

public class CancelSeat extends Reservation {

	int cancelSeatLevel;
	int cancelSeatNum;
	String cancelName;

	public void run() {
		initCancelSeatLevel();
		initCancelSeatNum();
		initCancelName();

		switch (this.cancelSeatLevel) {
		case 1:
			System.out.println((seat_S[cancelSeatNum - 1].equals(this.cancelName) ? successCancelMsg()
					: "<<< 예약 정보가 맞지 않습니다 >>>"));
			break;
		case 2:
			System.out.println((seat_A[cancelSeatNum - 1].equals(this.cancelName) ? successCancelMsg()
					: "<<< 예약 정보가 맞지 않습니다 >>>"));
			break;
		case 3:
			System.out.println((seat_B[cancelSeatNum - 1].equals(this.cancelName) ? successCancelMsg()
					: "<<< 예약 정보가 맞지 않습니다 >>>"));
			break;
		}
	}

	// 취소할 사람이름, 좌석레벨, 좌석번호 확인을 위해 입력
	public void initCancelSeatLevel() {
		System.out.print("[취소할 좌석 레벨] S[1] A[2] B[3] >> ");
		this.cancelSeatLevel = scan.nextInt();
	}

	public void initCancelSeatNum() {
		System.out.print("[취소할 좌석 번호] >> ");
		this.cancelSeatNum = scan.nextInt();
	}

	public void initCancelName() {
		System.out.print("[예약자명] >> ");
		this.cancelName = scan.next();
	}

	public String successCancelMsg() {
		return "<<< " + this.cancelName + "님, " + seatClass() + "좌석의 " + this.cancelSeatNum
				+ "번 예약이 취소되었습니다 >>>";
	}

	public char seatClass() {
		switch (this.cancelSeatLevel) {
		case 1:
			return 'S';
		case 2:
			return 'A';
		case 3:
			return 'B';
		}
		return 0;
	}

}
