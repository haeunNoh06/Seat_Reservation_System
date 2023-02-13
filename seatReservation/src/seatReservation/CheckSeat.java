package seatReservation;

// 좌석 조회
public class CheckSeat extends Reservation {
	String[] seat_S = new String[10];
	String[] seat_A = new String[15];
	String[] seat_B = new String[20];

	public void run() {
		if (seat_S[0] == null) initSeatSData();
		if (seat_A[0] == null) initSeatAData();
		if (seat_B[0] == null) initSeatBData();
		
		this.checkSeat();
	}

	// 초기화
	public void initSeatSData() {
		for (int i = 0; i < seat_S.length; i++)
			seat_S[i] = "---";
	}
	public void initSeatAData() {
		for (int i = 0; i < seat_A.length; i++)
			seat_A[i] = "---";
	}
	public void initSeatBData() {
		for (int i = 0; i < seat_B.length; i++)
			seat_B[i] = "---";
	}

	// 조회
	public void checkSeat() {
		System.out.print("S >> ");
		for (int i = 0; i < seat_S.length; i++) {
			System.out.print(seat_S[i] + " ");
		}
		System.out.print("\nA >> ");
		for (int i = 0; i < seat_A.length; i++) {
			System.out.print(seat_A[i] + " ");
		}
		System.out.print("\nB >> ");
		for (int i = 0; i < seat_B.length; i++) {
			System.out.print(seat_B[i] + " ");
		}
		System.out.println("\n");
	}
}
