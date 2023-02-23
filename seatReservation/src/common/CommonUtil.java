package common;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CommonUtil extends JFrame {

	public static final int H = 800;
	public static final int W = 550;

	// 폰트
	public static Font fontSize10 = new Font("맑은고딕", Font.PLAIN, 10);
	public static Font fontSize15 = new Font("맑은고딕", Font.PLAIN, 15);
	public static Font fontSize30 = new Font("맑은고딕", Font.PLAIN, 30);
	public static Font fontSize50 = new Font("맑은고딕", Font.BOLD, 50);

	static JPanel pnBackground = new JPanel();

	public CommonUtil(JPanel pnBackground) {
		this.pnBackground = pnBackground;
	}
	
	// 세팅
	public static void set(JFrame frame) {
		frame.setSize(500, 800);
		frame.setResizable(false);
		frame.setTitle("영화 예매 프로그램");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		JPanel pnTopBlue = new JPanel();
		pnTopBlue.setBackground(new Color(53, 121, 247));
		pnTopBlue.setBounds(0, 0, 500, 60);
		frame.add(pnTopBlue);

		pnBackground.setLayout(null);
		pnBackground.setBackground(Color.WHITE);
		pnBackground.setBounds(0, 60, W, H);
		frame.add(pnBackground);
	}

	// 에러 메시지
	public static void errMsg(Container c, String text) {
		JOptionPane.showMessageDialog(c, text, "오류", JOptionPane.ERROR_MESSAGE);
	}

	// 정보 메시지
	public static void infoMsg(Container c, String text) {
		JOptionPane.showMessageDialog(c, text, "메시지", JOptionPane.PLAIN_MESSAGE);
	}

	// textField 세팅
	public JTextField setTextField(String name, String placeholder) {
		JTextField tf = new JTextField();

		tf.setForeground(Color.gray.brighter());
		tf.setText(placeholder);

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

	// password textField 세팅
	
	// TODO : 비밀번호 암호화 계속 나타나기
	public JPasswordField setPWTextField(String name, String placeholder) {
		JPasswordField pf = new JPasswordField();

		pf.setForeground(Color.gray.brighter());
		pf.setText(placeholder);

		pf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// 입력 여부
				if ( placeholder == null ) {
					pf.setForeground(Color.gray.brighter());
					pf.setText(placeholder);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {

				// 
//				if (pf.getPassword().equals(placeholder) || pf.getPassword().clone() == pf.get) {
				if ( pf.getPassword().length == placeholder.length()) {
					pf.setText("");
					pf.setForeground(Color.BLACK);
				}
			}
		});

		pf.setName(name);

		return pf;
	}
	
	// 하얀색 버튼
	public JButton setBtnColor(String name, String text, Color fore, Color back) {
		JButton btn = new JButton(text);
		
		btn.setBackground(back);
		btn.setForeground(fore);
		btn.setName(name);
		
//		pnBackground.add(btn);
		
		return btn;
	}
	
	// button 세팅
	public JButton setJButton(JFrame frame, String name, int x, int y, int w, int h) {
		JButton btn = new JButton();
		
		frame.setBounds(x, y, w, h);
		
		btn.setName(name);
		
		return btn;
	}
}
