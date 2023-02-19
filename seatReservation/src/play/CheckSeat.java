package play;

// 좌석 조회
public class CheckSeat {
	static String[] seat_S = new String[10];
	static String[] seat_A = new String[15];
	static String[] seat_B = new String[20];

	public void run() {
		this.checkSeatS();
		this.checkSeatA();
		this.checkSeatB();
	}

	// 초기화
	public void initSeatSData() {
		for (int i = 0; i < seat_S.length; i++)
			seat_S[i] = "----";
	}
	public void initSeatAData() {
		for (int i = 0; i < seat_A.length; i++)
			seat_A[i] = "----";
	}
	public void initSeatBData() {
		for (int i = 0; i < seat_B.length; i++)
			seat_B[i] = "----";
	}

	// 좌석 조회
	public void checkSeatS() {
		if (seat_S[0] == null) initSeatSData();
		System.out.print("S >> ");
		for (int i = 0; i < seat_S.length; i++)
			System.out.print(seat_S[i] + " ");
		System.out.println();
	}
	public void checkSeatA() {
		if (seat_A[0] == null) initSeatAData();
		System.out.print("A >> ");
		for (int i = 0; i < seat_A.length; i++)
			System.out.print(seat_A[i] + " ");
		System.out.println();
	}
	public void checkSeatB() {
		if (seat_B[0] == null) initSeatBData();
		System.out.print("B >> ");
		for (int i = 0; i < seat_B.length; i++)
			System.out.print(seat_B[i] + " ");
		System.out.println();
	}
}
