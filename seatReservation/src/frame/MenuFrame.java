package frame;

import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.CommonUtil;

public class MenuFrame extends JFrame {

	Scanner scan = new Scanner(System.in);

	String sDay = "";

	JPanel pnMenu = new JPanel();
	JPanel pnBtns = new JPanel();
	JButton btnReser = new JButton();
	JButton btnCancel = new JButton("예약 취소");

	JLabel lbDate = new JLabel();
	JLabel lbTime = new JLabel();

	Reservation reservation = new Reservation();// 예약
	CheckSeat checkSeat = new CheckSeat();// 조회
	CancelSeat cancelSeat = new CancelSeat();// 취소

	boolean isEnded = false;

	void run() {
		set();

		btnReser.setText("<HTML>티켓 구매<br>영화는 역시 CGV</HTML>");// 버튼 안 줄바꿈

		lbDate.setFont(CommonUtil.fontSize15);
		lbTime.setFont(CommonUtil.fontSize50);

		btnReser.setBounds(100, 300, 150, 300);
		btnCancel.setBounds(300, 300, 150, 300);

		this.lbDate.setBounds(185, 100, 200, 50);
		this.lbTime.setBounds(110, 60, 400, 300);
		
		this.add(btnCancel);
		this.add(btnReser);

		this.add(this.lbTime);
		this.add(this.lbDate);

//		this.add(pnMenu);
		this.add(pnBtns);

//		checkSeat.run();

//		while (!isEnded) {
		while (true) {
			Calendar today = Calendar.getInstance();
			
			int year = today.get(Calendar.YEAR);
			int month = today.get(Calendar.MONTH);
			int date = today.get(Calendar.DATE);
			int ampm = today.get(Calendar.AM_PM);
			int hour = today.get(Calendar.HOUR);
			int min = today.get(Calendar.MINUTE);
			String amPm = (ampm == Calendar.AM ? "AM" : "PM");
			int day = today.get(Calendar.DAY_OF_WEEK);// 요일
			int sec = today.get(Calendar.SECOND);
			
			chooseDays(day);// 요일 선택
			
			this.lbDate.setText(year+"년 "+month+"월 "+date+"일 "+sDay);
			this.lbTime.setText(amPm+" "+hour+" : "+min+" : "+sec);

//			System.out.println(year+"년 "+month+"월 "+date+"일 "+amPm+hour+"시 "+min+"분 "+sec);

			try {
				Thread.sleep(1000);// 1초
				this.repaint();
			} catch (Exception e) {}
			// this.selectMenu();
		}
//		System.out.println("<<< 좌석 예약이 종료되었습니다. >>>");
	}

	void set() {
		this.setSize(CommonUtil.W, CommonUtil.H);
		this.setResizable(false);
		this.setTitle("CGV 영화관");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	void chooseDays(int day) {
		switch (day) {
		case 1:
			sDay = "SUN";
			break;
		case 2:
			sDay = "MON";
			break;
		case 3:
			sDay = "TUS";
			break;
		case 4:
			sDay = "WED";
			break;
		case 5:
			sDay = "THU";
			break;
		case 6:
			sDay = "FRI";
			break;
		case 7:
			sDay = "SAT";
			break;
		}
	}
	
	void selectMenu() {
		System.out.print("\n예약[1]    조회[2]    취소[3]    종료[4]  >> ");
		int menuNum = scan.nextInt();
		System.out.println();
		switch (menuNum) {
		case 1:
			reservation.run();
			break;
		case 2:
			checkSeat.run();
			break;
		case 3:
			cancelSeat.run();
			break;
		case 4:
			this.isEnded = true;
			break;
		default:
			System.out.println("<<< 다시 입력하세요. >>>");
		}
	}
}
