package MemberDAO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PcMain {
	SeatDTO dto = new SeatDTO();

	public PcMain() {
		// 프레임
		JFrame f = new JFrame();
		Color green = new Color(120,255,0);
		
		// 회원 비회원 버튼
		JToggleButton membtn = new JToggleButton("회 원");
		f.getContentPane().add(membtn);
		membtn.setSelected(true); // 처음에 on
				
		membtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
					 membtn.setBackground(green);
			}
		});
		
		JToggleButton nonmembtn = new JToggleButton("비회원");
		f.getContentPane().add(nonmembtn);
		
		nonmembtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
			}
		});
		
		
		// 가격 버튼
		JButton pricebtn1 = new JButton("1000");
		f.getContentPane().add(pricebtn1);
		JButton pricebtn2 = new JButton("2000");
		f.getContentPane().add(pricebtn2);
		JButton pricebtn3 = new JButton("3000");
		f.getContentPane().add(pricebtn3);
		JButton pricebtn4 = new JButton("4000");
		f.getContentPane().add(pricebtn4);
		JButton pricebtn5 = new JButton("5000");
		f.getContentPane().add(pricebtn5);
		JButton pricebtn6 = new JButton("10000");
		f.getContentPane().add(pricebtn6);
		JButton pricebtn7 = new JButton("15000");
		f.getContentPane().add(pricebtn7);
		JButton pricebtn8 = new JButton("20000");
		f.getContentPane().add(pricebtn8);
		
		// 결제 수단 버튼
		JButton seatViewerBtn = new JButton("좌석 보기");
		f.getContentPane().add(seatViewerBtn);
		JButton memberJoinBtn = new JButton("회원 가입");
		f.getContentPane().add(memberJoinBtn);
		JButton cardBtn = new JButton("카드 결제");
		f.getContentPane().add(cardBtn);
		JButton cashBtn = new JButton("현금 결제");
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
		PcDAO dao = new PcDAO();
		
		dao.MemberJoin();
		
	}
} // class
