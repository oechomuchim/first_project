package MemberDAO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Canvas;
import javax.swing.ButtonGroup;

public class PcMain {
	SeatDTO dto = new SeatDTO();

	public PcMain() {
		// ������
		JFrame f = new JFrame();
		
		// ȸ�� ��ȸ�� ��ư
		JToggleButton membtn = new JToggleButton("ȸ ��");
		membtn.setSelected(true); // ó���� on
		f.getContentPane().add(membtn);
		JToggleButton nonmembtn = new JToggleButton("��ȸ��");
		f.getContentPane().add(nonmembtn);
		
		// ���� ��ư
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
		
		pricebtn1.setBounds(15, 80, 240, 74);
		f.getContentPane().add(pricebtn1);
		pricebtn2.setBounds(15, 159, 240, 74);
		f.getContentPane().add(pricebtn2);
		pricebtn3.setBounds(15, 239, 240, 74);
		f.getContentPane().add(pricebtn3);
		pricebtn4.setBounds(15, 320, 240, 74);
		f.getContentPane().add(pricebtn4);
		pricebtn5.setBounds(267, 80, 239, 74);
		f.getContentPane().add(pricebtn5);
		pricebtn6.setBounds(267, 159, 239, 74);
		f.getContentPane().add(pricebtn6);
		pricebtn7.setBounds(267, 239, 239, 74);
		f.getContentPane().add(pricebtn7);
		pricebtn8.setBounds(267, 320, 239, 74);
		f.getContentPane().add(pricebtn8);
		
		membtn.setBounds(15, 10, 240, 40);
	
		f.getContentPane().add(membtn);
		nonmembtn.setBounds(265, 10, 241, 40);
		f.getContentPane().add(nonmembtn);
		
		f.getContentPane().setLayout(null);
		

		f.setSize(1080,	441);
		
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
		PcMain pc = new PcMain();
	}
} // class
