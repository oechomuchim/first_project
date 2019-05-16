package PC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JPanel;

public class PcMain {
	SeatDTO dto = new SeatDTO();
	int price;
	static SignUp signUp = new SignUp();
	CashPayment cashPayment = new CashPayment();
	
	public PcMain() {
		// 프레임
		JFrame f = new JFrame();
		
		// 회원 비회원 버튼
		JToggleButton membtn = new JToggleButton("회 원");
		f.getContentPane().add(membtn);
		membtn.setSelected(true); // 처음에 on
		
		JToggleButton nonmembtn = new JToggleButton("비회원");
		f.getContentPane().add(nonmembtn);
		
		nonmembtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				membtn.setSelected(false);
				PcMain2 pcMain2 = new PcMain2();
				f.dispose();
			}
		});
		membtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				nonmembtn.setSelected(false);
			}
		});
		
		// 가격 버튼
		JToggleButton pricebtn1 = new JToggleButton("1000");
		pricebtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(true);
				price = 1000;
			}
		});
		f.getContentPane().add(pricebtn1);
		JToggleButton pricebtn2 = new JToggleButton("2000");
		pricebtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn2.setSelected(true);
				price = 2000;
			}
		});
		f.getContentPane().add(pricebtn2);
		JToggleButton pricebtn3 = new JToggleButton("3000");
		pricebtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn3.setSelected(true);
				price = 3000;
			}
		});
		f.getContentPane().add(pricebtn3);
		JToggleButton pricebtn4 = new JToggleButton("4000");
		pricebtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn4.setSelected(true);
				price = 4000;
			}
		});
		f.getContentPane().add(pricebtn4);
		JToggleButton pricebtn5 = new JToggleButton("5000");
		pricebtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn5.setSelected(true);
				price = 5000;
			}
		});
		f.getContentPane().add(pricebtn5);
		JToggleButton pricebtn6 = new JToggleButton("10000");
		pricebtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn6.setSelected(true);
				price = 10000;
			}
		});
		f.getContentPane().add(pricebtn6);
		JToggleButton pricebtn7 = new JToggleButton("15000");
		pricebtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn7.setSelected(true);
				price = 15000;
			}
		});
		f.getContentPane().add(pricebtn7);
		JToggleButton pricebtn8 = new JToggleButton("20000");
		pricebtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn8.setSelected(true);
				price = 20000;
			}
		});
		f.getContentPane().add(pricebtn8);
		
		
		// 결제 수단 버튼
		
		
		JButton seatViewerBtn = new JButton("좌석 보기");
		f.getContentPane().add(seatViewerBtn);
		
		JButton memberJoinBtn = new JButton("회원 가입");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				signUp.MemberJoin();
			}
		});
		f.getContentPane().add(memberJoinBtn);
		JButton cardBtn = new JButton("카드 결제");
		cardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signUp.CardPayment();
			}
		});
		f.getContentPane().add(cardBtn);
		JButton cashBtn = new JButton("현금 결제");
		cashBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cashPayment.MemberCashPayment();
//				price=0; 
			}                
		});
		f.getContentPane().add(cashBtn);
		JButton changeBtn = new JButton("잔돈 반환");
		f.getContentPane().add(changeBtn);
		
		// 가격 버튼 옵션
		pricebtn1.setBounds(15, 80, 214, 74);
		f.getContentPane().add(pricebtn1);
		pricebtn2.setBounds(15, 159, 214, 74);
		f.getContentPane().add(pricebtn2);
		pricebtn3.setBounds(15, 239, 214, 74);
		f.getContentPane().add(pricebtn3);
		pricebtn4.setBounds(15, 320, 214, 74);
		f.getContentPane().add(pricebtn4);
		pricebtn5.setBounds(243, 80, 214, 74);
		f.getContentPane().add(pricebtn5);
		pricebtn6.setBounds(243, 159, 214, 74);
		f.getContentPane().add(pricebtn6);
		pricebtn7.setBounds(243, 239, 214, 74);
		f.getContentPane().add(pricebtn7);
		pricebtn8.setBounds(243, 320, 214, 74);
		f.getContentPane().add(pricebtn8);
		
		// 회원 비회원 버튼 옵션
		membtn.setBounds(15, 10, 214, 40);
		f.getContentPane().add(membtn);
		nonmembtn.setBounds(241, 10, 216, 40);
		f.getContentPane().add(nonmembtn);
		
		// 결제 수단 버튼 옵션
		seatViewerBtn.setBounds(482, 41, 195, 91);
		f.getContentPane().add(seatViewerBtn);
		memberJoinBtn.setBounds(689, 41, 195, 91);
		f.getContentPane().add(memberJoinBtn);
		cardBtn.setBounds(689, 159, 195, 91);
		f.getContentPane().add(cardBtn);
		cashBtn.setBounds(482, 159, 195, 91);
		f.getContentPane().add(cashBtn);
		changeBtn.setBounds(482, 282, 402, 91);
		f.getContentPane().add(changeBtn);
		
		
		// 프레임 옵션
		f.getContentPane().setLayout(null);
		f.setSize(912,	441);
		f.setVisible(true);
	}
	


//	public void SeatViewer() {
//		JFrame f = new JFrame("PC 단말기");
//
//		JButton[] button = new JButton[10];
//
//		for (int i = 1; i < 3; i++) {
//			int a = i * 80;
//			for (int j = 0; j < 10; j++) {
//				button[j] = new JButton(Integer.toString(dto.getSeat_num()) + "        " + dto.getSeat_num());
//				f.getContentPane().add(button[j]);
//				int b = j * 70;
//				button[j].setBounds(b, a, 50, 60); // 버튼 크기 지정 x좌표 y좌표 가로 세로
//			}
//		}
//
//		f.setSize(1040, 700);
//		f.getContentPane().setLayout(null);
//
//		f.setVisible(true);
//
//	}

	public static void main(String[] args) {
		PcMain pc = new PcMain();
//		SignUp dao = new SignUp();
		
//		dao.MemberJoin();
		
	}
} // class
