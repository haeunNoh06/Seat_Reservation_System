package frame1;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import common.CommonUtil;

public class LogInFrame extends JFrame {

	// TODO: 이미지 상단에 노출시키기
	Image imgMovie = new ImageIcon(Main.class.getResource("../imgs/movieIcon.png")).getImage();
	
	JLabel lb = new JLabel("|");// 찾기 할 때 사이에 있는 줄
	JLabel lbImg = new JLabel();
	
	JPanel pn = new JPanel();
	
	JTextField tfID = new JTextField(15);
	JTextField tfPW = new JTextField(20);
	
	JButton btnLogin = new JButton("로그인");
	JButton btnJoin = new JButton("회원가입");
	JButton btnFindID = new JButton("아이디 찾기");
	JButton btnFindPW = new JButton("비밀번호 찾기");
	
	
	public void run() {
		
		set();
		
		pn.setLayout(null);
		
//		Container c = getContentPane();
//		c.add(lbImg);
//		
//		lbImg.setBounds(320,320,100,100);

		tfID.setBounds(40, 280, 400, 40);
		tfPW.setBounds(40, 330, 400, 40);

		btnLogin.setBounds(40, 420, 400, 40);
		btnJoin.setBounds(40, 470, 400, 40);
		btnFindID.setBounds(130, 540, 100, 20);
		btnFindPW.setBounds(240, 540, 120, 20);
		
		lb.setBounds(230, 540, 10, 20);
		lb.setFont(CommonUtil.fontSize30);
		
		
		pn.add(tfID);
		pn.add(tfPW);
		
		pn.add(btnLogin);
		pn.add(btnJoin);
		pn.add(btnFindID);
		pn.add(btnFindPW);
		
		pn.add(lb);
		
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
	
//	@Override
//	public void paint(Graphics g) {
//		g.drawImage(imgMovie, 100, 100, null);
//	}
}
