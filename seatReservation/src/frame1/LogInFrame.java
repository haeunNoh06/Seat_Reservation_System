package frame1;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import common.CommonUtil;

public class LogInFrame extends JFrame {

	
	// TODO: 이미지 상단에 노출시키기
	JLabel lbLine = new JLabel("|");// 찾기 할 때 사이에 있는 줄
	JLabel lbImg = new JLabel(new ImageIcon("./imgs/movieImg.png"));

	JPanel pnBackground = new JPanel();

	JTextField tfID = new JTextField(15);
	JPasswordField tfPW = new JPasswordField(20);

	JButton btnLogin = new JButton("로그인");
	JButton btnJoin = new JButton("회원가입");
	JButton btnFindID = new JButton("아이디 찾기");
	JButton btnFindPW = new JButton("비밀번호 찾기");

	CommonUtil cu = new CommonUtil(this.pnBackground);

	private String ID = "";
	private char[] PW = {};
	

	public LogInFrame() {
		CommonUtil.set(this);// 기본 세팅
		run();
	}
	
	public void run() {


//		Container c = getContentPane();
//		c.add(lbImg);
		
		lbImg.setBounds(190,110,100,100);

		tfID = cu.setTextField("tfID", "ID");
		tfPW = cu.setPWTextField("tfPW", "Password");

		// 색 세팅
		btnLogin = cu.setBtnColor("btnLogin", btnLogin.getText(), new Color(53, 121, 247) , Color.WHITE);
		btnJoin = cu.setBtnColor("btnJoin", btnJoin.getText(), Color.WHITE, new Color(53, 121, 247));
		btnFindID = cu.setBtnColor("btnFindID", btnFindID.getText(), Color.gray.brighter(), null);
		btnFindPW = cu.setBtnColor("btnFindPW", btnFindPW.getText(), Color.gray.brighter(), null);
		
		btnFindID.setBorderPainted(false); // 버튼 테두리 설정 해제
		btnFindPW.setBorderPainted(false);
		btnFindID.setContentAreaFilled(false);// 버튼 바탕 없애기
		btnFindPW.setContentAreaFilled(false);

		btnJoin.setAutoscrolls(true);
		
		acceptLogin();// 로그인 성공 여부
		acceptJoin();// 회원가입 성공 여부

		tfID.setBounds(40, 300, 400, 40);
		tfPW.setBounds(40, 350, 400, 40);

		btnLogin.setBounds(40, 440, 400, 40);
		btnJoin.setBounds(40, 490, 400, 40);
		btnFindID.setBounds(140, 560, 100, 15);
		btnFindPW.setBounds(220, 560, 120, 15);

		lbLine.setBounds(230, 555, 10, 20);
		lbLine.setFont(CommonUtil.fontSize15);
		lbLine.setForeground(Color.gray.brighter());

		pnBackground.setBackground(Color.white);
		pnBackground.setBounds(0, 60, 500, 720);

		pnBackground.add(tfID);
		pnBackground.add(tfPW);

		pnBackground.add(btnLogin);
		pnBackground.add(btnJoin);
		pnBackground.add(btnFindID);
		pnBackground.add(btnFindPW);

		pnBackground.add(lbLine);

		pnBackground.add(lbImg);
		this.add(pnBackground);
	}

	// 로그인 성공 여부
	void acceptLogin() {
		btnLogin.addActionListener(e -> {
			if (ID.equals("")) {
				CommonUtil.errMsg(this, "아이디가 존재하지 않습니다.\n회원가입이 필요합니다.");
				tfID.setText("");
				tfPW.setText("");
				tfID = cu.setTextField("tfID", "ID");
				tfPW = cu.setPWTextField("tfPW", "Password");
			} else {
				if (tfID.getText().equals(ID) && tfPW.getPassword().equals(PW+"") ) {
					this.ID = tfID.getText();
					this.PW = tfPW.getPassword();
					CommonUtil.infoMsg(this, "로그인에 성공하셨습니다.");
				} else
					CommonUtil.errMsg(this, "아이디가 맞지 않습니다.");
			}
		});
	}

	// 회원 가입 성공 여부
	void acceptJoin() {
		btnJoin.addActionListener(e -> {
			this.setVisible(false);
			Join join = new Join();
		});
	}
//	@Override
//	public void paint(Graphics g) {
//		g.drawImage(lbImg, 100, 100, null);
//	}
}
