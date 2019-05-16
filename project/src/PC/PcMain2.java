package PC;

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

// ��ȸ�� ������ ��
public class PcMain2 {
	SeatDTO dto = new SeatDTO();
	int price;
	static CashPayment cashPayment = new CashPayment();
	
	
	public PcMain2() {
		// ������
		JFrame f = new JFrame();
		Color green = new Color(120,255,0);
		
		// ȸ�� ��ȸ�� ��ư
		JToggleButton membtn = new JToggleButton("ȸ ��");
		f.getContentPane().add(membtn);
		
		JToggleButton nonmembtn = new JToggleButton("��ȸ��");
		f.getContentPane().add(nonmembtn);
		nonmembtn.setSelected(true); // ó���� on
		
		nonmembtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				membtn.setSelected(false);
			}
		});
		membtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				nonmembtn.setSelected(false);
				PcMain pcMain2 = new PcMain();
				f.dispose();
			}
		});
		
		// ���� ��ư
		JToggleButton pricebtn1 = new JToggleButton("1200");
		pricebtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(true);
				price = 1200;
			}
		});
		f.getContentPane().add(pricebtn1);
		JToggleButton pricebtn2 = new JToggleButton("2200");
		pricebtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn2.setSelected(true);
				price = 2200;
			}
		});
		f.getContentPane().add(pricebtn2);
		JToggleButton pricebtn3 = new JToggleButton("3200");
		pricebtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn3.setSelected(true);
				price = 3200;
			}
		});
		f.getContentPane().add(pricebtn3);
		JToggleButton pricebtn4 = new JToggleButton("4200");
		pricebtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn4.setSelected(true);
				price = 4200;
			}
		});
		f.getContentPane().add(pricebtn4);
		JToggleButton pricebtn5 = new JToggleButton("5200");
		pricebtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn5.setSelected(true);
				price = 5200;
			}
		});
		f.getContentPane().add(pricebtn5);
		JToggleButton pricebtn6 = new JToggleButton("10200");
		pricebtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn6.setSelected(true);
				price = 10200;
			}
		});
		f.getContentPane().add(pricebtn6);
		JToggleButton pricebtn7 = new JToggleButton("15200");
		pricebtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn7.setSelected(true);
				price = 15200;
			}
		});
		f.getContentPane().add(pricebtn7);
		JToggleButton pricebtn8 = new JToggleButton("20200");
		pricebtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn8.setSelected(true);
				price = 20200;
			}
		});
		f.getContentPane().add(pricebtn8);
		
		
		// ���� ���� ��ư
		
		
		JButton seatViewerBtn = new JButton("�¼� ����");
		f.getContentPane().add(seatViewerBtn);
		
		JButton memberJoinBtn = new JButton("ȸ�� ����");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SignUp signUp = new SignUp();
				signUp.MemberJoin();
			}
		});
		f.getContentPane().add(memberJoinBtn);
		JButton cardBtn = new JButton("ī�� ����");
		cardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signUp = new SignUp();
				signUp.CardPayment();
			}
		});
		f.getContentPane().add(cardBtn);
		JButton cashBtn = new JButton("���� ����");
		cashBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp signUp = new SignUp();
				cashPayment.NonMemberCashPayment();
//				price=0; 
				f.dispose();
			}
		});
		f.getContentPane().add(cashBtn);
		JButton changeBtn = new JButton("�ܵ� ��ȯ");
		f.getContentPane().add(changeBtn);
		
		// ���� ��ư �ɼ�
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
		
		// ȸ�� ��ȸ�� ��ư �ɼ�
		membtn.setBounds(15, 10, 214, 40);
		f.getContentPane().add(membtn);
		nonmembtn.setBounds(241, 10, 216, 40);
		f.getContentPane().add(nonmembtn);
		
		// ���� ���� ��ư �ɼ�
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
		
		
		// ������ �ɼ�
		f.getContentPane().setLayout(null);
		f.setSize(912,	441);
		f.setVisible(true);
	}
	


//	public void SeatViewer() {
//		JFrame f = new JFrame("PC �ܸ���");
//
//		JButton[] button = new JButton[10];
//
//		for (int i = 1; i < 3; i++) {
//			int a = i * 80;
//			for (int j = 0; j < 10; j++) {
//				button[j] = new JButton(Integer.toString(dto.getSeat_num()) + "        " + dto.getSeat_num());
//				f.getContentPane().add(button[j]);
//				int b = j * 70;
//				button[j].setBounds(b, a, 50, 60); // ��ư ũ�� ���� x��ǥ y��ǥ ���� ����
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
		PcMain2 pc = new PcMain2();
//		SignUp dao = new SignUp();
		
//		dao.MemberJoin();
		
	}
} // class
