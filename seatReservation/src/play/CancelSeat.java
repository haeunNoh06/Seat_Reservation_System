package play;

public class CancelSeat extends Reservation {

	String cancelName;
	int cancelSeatLevel;
	int cancelSeatNum;

	public void run() {
		initCancelName();
		initCancelSeatLevel();
		initCancelSeatNum();

		switch (this.cancelSeatLevel) {
		case 1:
			if (seat_S[cancelSeatNum - 1].equals(this.cancelName)) {
				deleteSuccessReser(seat_S);
				successCancelMsg();
			} else 
				System.out.println("<<< 예약 정보가 맞지 않습니다 >>>");
			break;
		case 2:
			if (seat_A[cancelSeatNum - 1].equals(this.cancelName)) {
				deleteSuccessReser(seat_A);
				successCancelMsg();
			} else 
				System.out.println("<<< 예약 정보가 맞지 않습니다 >>>");
			break;
		case 3:
			if (seat_B[cancelSeatNum - 1].equals(this.cancelName)) {
				deleteSuccessReser(seat_B);
				successCancelMsg();
			} else 
				System.out.println("<<< 예약 정보가 맞지 않습니다 >>>");
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
		try {
			this.cancelSeatNum = scan.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			//Scanner.nextInt() 문제 해결방법 1 - 남아있는 개행문자를 제거한다.
			scan.nextLine();
			System.out.println("숫자를 입력해 주세요....^^");
			initCancelSeatNum();
		}
	}

	public void initCancelName() {
		System.out.print("[예약자명] >> ");
		this.cancelName = scan.next();
	}

	public void successCancelMsg() {
		System.out.println("<<< " + this.cancelName + "님, " + seatClass() + "좌석의 " + this.cancelSeatNum
				+ "번 예약이 취소되었습니다 >>>");
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
	
	// 빈 자리로 변경
	public void deleteSuccessReser(String[] seatLevel) {
		seatLevel[this.cancelSeatNum-1] = "----"; 
	}

}
