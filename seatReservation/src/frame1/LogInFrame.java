package frame1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import common.CommonUtil;

public class LogInFrame extends JFrame {

	// TODO: 이미지 상단에 노출시키기
	JLabel lbLine = new JLabel("|");// 찾기 할 때 사이에 있는 줄
	JLabel lbImg = new JLabel(new ImageIcon("./imgs/movieImg.png"));

	JPanel pn = new JPanel();

	JTextField tfID = new JTextField(15);
	JTextField tfPW = new JTextField(20);

	JButton btnLogin = new JButton("로그인");
	JButton btnJoin = new JButton("회원가입");
	JButton btnFindID = new JButton("아이디 찾기");
	JButton btnFindPW = new JButton("비밀번호 찾기");

	private final String ID = "haeun06";
	private final int PW = 1234;

	public void run() {

		set();

		pn.setLayout(null);

//		Container c = getContentPane();
//		c.add(lbImg);
//		
//		lbImg.setBounds(320,320,100,100);

		btnFindID.setBorderPainted(false); // 버튼 테두리 설정 해제
		btnFindPW.setBorderPainted(false);
		btnFindID.setContentAreaFilled(false);// 버튼 바탕 없애기
		btnFindPW.setContentAreaFilled(false);

		tfID = setTextField("tfID", "ID");
		tfPW = setTextField("tfPW", "Password");

		// 로그인 성공 여부
		btnLogin.addActionListener(e -> {
			if (tfID.getText().equals(ID))
				CommonUtil.infoMsg(this, "로그인에 성공하셨습니다.");
			else
				CommonUtil.errMsg(this, "아이디가 맞지 않습니다.");
		});

		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(53, 121, 247));
		btnJoin.setBackground(new Color(53, 121, 247));
		btnJoin.setForeground(Color.WHITE);

		btnFindID.setForeground(Color.gray.brighter());
		btnFindPW.setForeground(Color.gray.brighter());

		lbImg.setBounds(100, 100, 100, 100);
		
		tfID.setBounds(40, 300, 400, 40);
		tfPW.setBounds(40, 350, 400, 40);

		btnLogin.setBounds(40, 440, 400, 40);
		btnJoin.setBounds(40, 490, 400, 40);
		btnFindID.setBounds(140, 560, 100, 15);
		btnFindPW.setBounds(220, 560, 120, 15);

		lbLine.setBounds(230, 555, 10, 20);
		lbLine.setFont(CommonUtil.fontSize15);
		lbLine.setForeground(Color.gray.brighter());

		
//		pn.setBounds(200,200,500, 600);
		
		pn.add(tfID);
		pn.add(tfPW);

		pn.add(btnLogin);
		pn.add(btnJoin);
		pn.add(btnFindID);
		pn.add(btnFindPW);

		pn.add(lbLine);

		pn.add(lbImg);
		this.add(pn);
//		this.add(pnLogin);
	}

	void set() {
		this.setSize(500, 800);
//		this.setResizable(false);
		this.setTitle("영화 예매 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

//		setBackground(new Color(255, 255, 255));
	}

	JTextField setTextField(String name, String placeholder) {
		JTextField tf = new JTextField();

		tf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// 입력 여부
				if (tf.getText().equals("")) {
					tf.setForeground(Color.gray.brighter());
					tf.setText(placeholder);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {

				if (tf.getText().equals(placeholder) || tf.getText().equals("")) {
					tf.setText("");
					tf.setForeground(Color.BLACK);
				}
			}
		});

		tf.setName(name);

		return tf;
	}

//	@Override
//	public void paint(Graphics g) {
//		g.drawImage(imgMovie, 100, 100, null);
//	}
}
