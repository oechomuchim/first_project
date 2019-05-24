package PC;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.Choice;
import java.awt.List;
import java.awt.Button;


 
public class SeatView extends JFrame{
	JPanel panel = new JPanel();
	JPanel[] p = new JPanel[28];
	JLabel la; //메세지를 출력하기 위한 레이블 컴포넌트
	SeatDAO seatdao;
	
	int x, y , p_x, p_y, w, h, i;
	ArrayList list = new ArrayList(); // getBounds담고 MouseListener로 보내기 위한 배열
	public void SeatView() {
		setSize(912,441);
		getContentPane().setLayout(null);
		
		setContentPane(panel); //프레임에 패널을 셋팅
		
		//패널을 MouseListener 리스너 등록
		panel.addMouseListener(new Mouse());
		//패널을 MouseMotionListener 리스너 등록
		panel.addMouseMotionListener(new Mouse());
		
		panel.setBounds(12, 6, 80, 93);
		panel.setLayout(null);		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(10, 6, 80, 93);
		getContentPane().add(panel1);
		list.add(panel1.getBounds());
			JLabel pane1_l1 = new JLabel("빈자리여부");
			pane1_l1.setBounds(0, 0, 80, 31);
			panel1.add(pane1_l1);
			
			JLabel pane1_l2 = new JLabel("이름");
			pane1_l2.setBounds(0, 32, 80, 31);
			panel1.add(pane1_l2);
			
			JLabel pane1_l13 = new JLabel("남은 시간");
			pane1_l13.setBounds(0, 62, 80, 31);
			panel1.add(pane1_l13);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(104, 6, 80, 93);
		getContentPane().add(panel2);
		list.add(panel2.getBounds());
		
			JLabel pane2_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			pane2_l1.setBounds(0, 0, 80, 31);
			panel2.add(pane2_l1);
			
			JLabel pane2_l2 = new JLabel("\uC774\uB984");
			pane2_l2.setBounds(0, 32, 80, 31);
			panel2.add(pane2_l2);
			
			JLabel pane2_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			pane2_l3.setBounds(0, 62, 80, 31);
			panel2.add(pane2_l3);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(196, 6, 80, 93);
		getContentPane().add(panel3);
		list.add(panel3.getBounds());
		
			JLabel pane3_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			pane3_l1.setBounds(0, 0, 80, 31);
			panel3.add(pane3_l1);
			
			JLabel pane3_l2 = new JLabel("\uC774\uB984");
			pane3_l2.setBounds(0, 32, 80, 31);
			panel3.add(pane3_l2);
			
			JLabel pane3_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			pane3_l3.setBounds(0, 62, 80, 31);
			panel3.add(pane3_l3);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(528, 6, 80, 93);
		getContentPane().add(panel4);
		list.add(panel4.getBounds());
		
			JLabel panel4_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel4_l1.setBounds(0, 0, 80, 31);
			panel4.add(panel4_l1);
			
			JLabel panel4_l2 = new JLabel("\uC774\uB984");
			panel4_l2.setBounds(0, 32, 80, 31);
			panel4.add(panel4_l2);
			
			JLabel panel4_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel4_l3.setBounds(0, 62, 80, 31);
			panel4.add(panel4_l3);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBounds(620, 6, 80, 93);
		getContentPane().add(panel5);
		list.add(panel5.getBounds());
		
			JLabel panel5_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel5_l1.setBounds(0, 0, 80, 31);
			panel5.add(panel5_l1);
			
			JLabel panel5_l2 = new JLabel("\uC774\uB984");
			panel5_l2.setBounds(0, 32, 80, 31);
			panel5.add(panel5_l2);
			
			JLabel panel5_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel5_l3.setBounds(0, 62, 80, 31);
			panel5.add(panel5_l3);
		
		JPanel panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBounds(712, 6, 80, 93);
		getContentPane().add(panel6);
		list.add(panel6.getBounds());
		
			JLabel panel6_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel6_l1.setBounds(0, 0, 80, 31);
			panel6.add(panel6_l1);
			
			JLabel panel6_l2 = new JLabel("\uC774\uB984");
			panel6_l2.setBounds(0, 32, 80, 31);
			panel6.add(panel6_l2);
			
			JLabel panel6_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel6_l3.setBounds(0, 62, 80, 31);
			panel6.add(panel6_l3);
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBounds(804, 6, 80, 93);
		getContentPane().add(panel7);
		list.add(panel7.getBounds());
		
			JLabel panel7_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel7_l1.setBounds(0, 0, 80, 31);
			panel7.add(panel7_l1);
			
			JLabel panel7_l2 = new JLabel("\uC774\uB984");
			panel7_l2.setBounds(0, 32, 80, 31);
			panel7.add(panel7_l2);
			
			JLabel panel7_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel7_l3.setBounds(0, 62, 80, 31);
			panel7.add(panel7_l3);
		
		JPanel panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBounds(12, 105, 80, 93);
		getContentPane().add(panel8);
		list.add(panel8.getBounds());
		
			JLabel panel8_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel8_l1.setBounds(0, 0, 80, 31);
			panel8.add(panel8_l1);
			
			JLabel panel8_l2 = new JLabel("\uC774\uB984");
			panel8_l2.setBounds(0, 32, 80, 31);
			panel8.add(panel8_l2);
			
			JLabel panel8_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel8_l3.setBounds(0, 62, 80, 31);
			panel8.add(panel8_l3);
		
		JPanel panel9 = new JPanel();
		panel9.setLayout(null);
		panel9.setBounds(104, 105, 80, 93);
		getContentPane().add(panel9);
		list.add(panel9.getBounds());
		
			JLabel panel9_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel9_l1.setBounds(0, 0, 80, 31);
			panel9.add(panel9_l1);
			
			JLabel panel9_l2 = new JLabel("\uC774\uB984");
			panel9_l2.setBounds(0, 32, 80, 31);
			panel9.add(panel9_l2);
			
			JLabel panel9_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel9_l3.setBounds(0, 62, 80, 31);
			panel9.add(panel9_l3);
		
		JPanel panel10 = new JPanel();
		panel10.setLayout(null);
		panel10.setBounds(196, 105, 80, 93);
		getContentPane().add(panel10);
		list.add(panel10.getBounds());
		
			JLabel panel10_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel10_l1.setBounds(0, 0, 80, 31);
			panel10.add(panel10_l1);
			
			JLabel panel10_l2 = new JLabel("\uC774\uB984");
			panel10_l2.setBounds(0, 32, 80, 31);
			panel10.add(panel10_l2);
			
			JLabel panel10_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel10_l3.setBounds(0, 62, 80, 31);
			panel10.add(panel10_l3);
		
		JPanel panel11 = new JPanel();
		panel11.setLayout(null);
		panel11.setBounds(528, 105, 80, 93);
		getContentPane().add(panel11);
		list.add(panel1.getBounds());
		
			JLabel panel11_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel11_l1.setBounds(0, 0, 80, 31);
			panel11.add(panel11_l1);
			
			JLabel panel11_l2 = new JLabel("\uC774\uB984");
			panel11_l2.setBounds(0, 32, 80, 31);
			panel11.add(panel11_l2);
			
			JLabel panel11_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel11_l3.setBounds(0, 62, 80, 31);
			panel11.add(panel11_l3);
		
		JPanel panel12 = new JPanel();
		panel12.setLayout(null);
		panel12.setBounds(620, 105, 80, 93);
		getContentPane().add(panel12);
		list.add(panel12.getBounds());
		
			JLabel panel12_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel12_l1.setBounds(0, 0, 80, 31);
			panel12.add(panel12_l1);
			
			JLabel panel12_l2 = new JLabel("\uC774\uB984");
			panel12_l2.setBounds(0, 32, 80, 31);
			panel12.add(panel12_l2);
			
			JLabel panel12_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel12_l3.setBounds(0, 62, 80, 31);
			panel12.add(panel12_l3);
		
		JPanel panel13 = new JPanel();
		panel13.setLayout(null);
		panel13.setBounds(712, 105, 80, 93);
		getContentPane().add(panel13);
		list.add(panel13.getBounds());
		
			JLabel panel13_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel13_l1.setBounds(0, 0, 80, 31);
			panel13.add(panel13_l1);
			
			JLabel panel13_l2 = new JLabel("\uC774\uB984");
			panel13_l2.setBounds(0, 32, 80, 31);
			panel13.add(panel13_l2);
			
			JLabel panel13_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel13_l3.setBounds(0, 62, 80, 31);
			panel13.add(panel13_l3);
		
		JPanel panel14 = new JPanel();
		panel14.setLayout(null);
		panel14.setBounds(804, 105, 80, 93);
		getContentPane().add(panel14);
		list.add(panel14.getBounds());
		
			JLabel panel14_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel14_l1.setBounds(0, 0, 80, 31);
			panel14.add(panel14_l1);
			
			JLabel panel14_l2 = new JLabel("\uC774\uB984");
			panel14_l2.setBounds(0, 32, 80, 31);
			panel14.add(panel14_l2);
			
			JLabel panel14_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel14_l3.setBounds(0, 62, 80, 31);
			panel14.add(panel14_l3);
		
		JPanel panel15 = new JPanel();
		panel15.setLayout(null);
		panel15.setBounds(288, 105, 80, 93);
		getContentPane().add(panel15);
		list.add(panel15.getBounds());
		
			JLabel panel15_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel15_l1.setBounds(0, 0, 80, 31);
			panel15.add(panel15_l1);
			
			JLabel panel15_l2 = new JLabel("\uC774\uB984");
			panel15_l2.setBounds(0, 32, 80, 31);
			panel15.add(panel15_l2);
			
			JLabel panel15_l3 = new JLabel("남은 시간");
			panel15_l3.setBounds(0, 62, 80, 31);
			panel15.add(panel15_l3);
		
		JPanel panel16 = new JPanel();
		panel16.setLayout(null);
		panel16.setBounds(12, 204, 80, 93);
		getContentPane().add(panel16);
		list.add(panel16.getBounds());
		
			JLabel panel16_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel16_l1.setBounds(0, 0, 80, 31);
			panel16.add(panel16_l1);
			
			JLabel panel16_l2 = new JLabel("\uC774\uB984");
			panel16_l2.setBounds(0, 32, 80, 31);
			panel16.add(panel16_l2);
			
			JLabel panel16_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel16_l3.setBounds(0, 62, 80, 31);
			panel16.add(panel16_l3);
		
		JPanel panel17 = new JPanel();
		panel17.setLayout(null);
		panel17.setBounds(104, 204, 80, 93);
		getContentPane().add(panel17);
		list.add(panel17.getBounds());
		
			JLabel panel17_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel17_l1.setBounds(0, 0, 80, 31);
			panel17.add(panel17_l1);
			
			JLabel panel17_l2 = new JLabel("\uC774\uB984");
			panel17_l2.setBounds(0, 32, 80, 31);
			panel17.add(panel17_l2);
			
			JLabel panel17_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel17_l3.setBounds(0, 62, 80, 31);
			panel17.add(panel17_l3);
		
		JPanel panel18 = new JPanel();
		panel18.setLayout(null);
		panel18.setBounds(196, 204, 80, 93);
		getContentPane().add(panel18);
		list.add(panel18.getBounds());
		
			JLabel panel18_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel18_l1.setBounds(0, 0, 80, 31);
			panel18.add(panel18_l1);
			
			JLabel panel18_l2 = new JLabel("\uC774\uB984");
			panel18_l2.setBounds(0, 32, 80, 31);
			panel18.add(panel18_l2);
			
			JLabel panel18_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel18_l3.setBounds(0, 62, 80, 31);
			panel18.add(panel18_l3);
		
		JPanel panel19 = new JPanel();
		panel19.setLayout(null);
		panel19.setBounds(288, 204, 80, 93);
		getContentPane().add(panel19);
		list.add(panel19.getBounds());
		
			JLabel panel19_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel19_l1.setBounds(0, 0, 80, 31);
			panel19.add(panel19_l1);
			
			JLabel panel19_l2 = new JLabel("\uC774\uB984");
			panel19_l2.setBounds(0, 32, 80, 31);
			panel19.add(panel19_l2);
			
			JLabel panel19_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel19_l3.setBounds(0, 62, 80, 31);
			panel19.add(panel19_l3);
		
		JPanel panel20 = new JPanel();
		panel20.setLayout(null);
		panel20.setBounds(528, 204, 80, 93);
		getContentPane().add(panel20);
		list.add(panel20.getBounds());
		
			JLabel panel20_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel20_l1.setBounds(0, 0, 80, 31);
			panel20.add(panel20_l1);
			
			JLabel panel20_l2 = new JLabel("\uC774\uB984");
			panel20_l2.setBounds(0, 32, 80, 31);
			panel20.add(panel20_l2);
			
			JLabel panel20_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel20_l3.setBounds(0, 62, 80, 31);
			panel20.add(panel20_l3);
		
		JPanel panel21 = new JPanel();
		panel21.setLayout(null);
		panel21.setBounds(620, 204, 80, 93);
		getContentPane().add(panel21);
		list.add(panel21.getBounds());
		
			JLabel panel21_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel21_l1.setBounds(0, 0, 80, 31);
			panel21.add(panel21_l1);
			
			JLabel panel21_l2 = new JLabel("\uC774\uB984");
			panel21_l2.setBounds(0, 32, 80, 31);
			panel21.add(panel21_l2);
			
			JLabel panel21_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel21_l3.setBounds(0, 62, 80, 31);
			panel21.add(panel21_l3);
		
		JPanel panel22 = new JPanel();
		panel22.setLayout(null);
		panel22.setBounds(712, 204, 80, 93);
		getContentPane().add(panel22);
		list.add(panel22.getBounds());
		
			JLabel panel22_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel22_l1.setBounds(0, 0, 80, 31);
			panel22.add(panel22_l1);
			
			JLabel panel22_l2 = new JLabel("\uC774\uB984");
			panel22_l2.setBounds(0, 32, 80, 31);
			panel22.add(panel22_l2);
			
			JLabel panel22_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel22_l3.setBounds(0, 62, 80, 31);
			panel22.add(panel22_l3);
		
		JPanel panel23 = new JPanel();
		panel23.setLayout(null);
		panel23.setBounds(804, 204, 80, 93);
		getContentPane().add(panel23);
		list.add(panel23.getBounds());
		
			JLabel panel23_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel23_l1.setBounds(0, 0, 80, 31);
			panel23.add(panel23_l1);
			
			JLabel panel23_l2 = new JLabel("\uC774\uB984");
			panel23_l2.setBounds(0, 32, 80, 31);
			panel23.add(panel23_l2);
			
			JLabel panel23_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel23_l3.setBounds(0, 62, 80, 31);
			panel23.add(panel23_l3);
		
		JPanel panel24 = new JPanel();
		panel24.setLayout(null);
		panel24.setBounds(12, 303, 80, 93);
		getContentPane().add(panel24);
		list.add(panel24.getBounds());
		
			JLabel panel24_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel24_l1.setBounds(0, 0, 80, 31);
			panel24.add(panel24_l1);
			
			JLabel panel24_l2 = new JLabel("\uC774\uB984");
			panel24_l2.setBounds(0, 32, 80, 31);
			panel24.add(panel24_l2);
			
			JLabel panel24_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel24_l3.setBounds(0, 62, 80, 31);
			panel24.add(panel24_l3);
		
		JPanel panel25 = new JPanel();
		panel25.setLayout(null);
		panel25.setBounds(104, 303, 80, 93);
		getContentPane().add(panel25);
		list.add(panel25.getBounds());
		
			JLabel panel25_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel25_l1.setBounds(0, 0, 80, 31);
			panel25.add(panel25_l1);
			
			JLabel panel25_l2 = new JLabel("\uC774\uB984");
			panel25_l2.setBounds(0, 32, 80, 31);
			panel25.add(panel25_l2);
			
			JLabel panel25_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel25_l3.setBounds(0, 62, 80, 31);
			panel25.add(panel25_l3);
		
		JPanel panel26 = new JPanel();
		panel26.setLayout(null);
		panel26.setBounds(196, 303, 80, 93);
		getContentPane().add(panel26);
		list.add(panel26.getBounds());
		
			JLabel panel26_l1 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			panel26_l1.setBounds(0, 0, 80, 31);
			
			panel26.add(panel26_l1);
			
			JLabel panel26_l2 = new JLabel("\uC774\uB984");
			panel26_l2.setBounds(0, 32, 80, 31);
			panel26.add(panel26_l2);
			
			JLabel panel26_l3 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			panel26_l3.setBounds(0, 62, 80, 31);
			panel26.add(panel26_l3);
		
		JPanel panel27 = new JPanel();
		panel27.setLayout(null);
		panel27.setBounds(288, 303, 80, 93);
		getContentPane().add(panel27);
		list.add(panel27.getBounds());
		
			JLabel label_75 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			label_75.setBounds(0, 0, 80, 31);
			panel27.add(label_75);
			
			JLabel label_76 = new JLabel("\uC774\uB984");
			label_76.setBounds(0, 32, 80, 31);
			panel27.add(label_76);
			
			JLabel label_77 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			label_77.setBounds(0, 62, 80, 31);
			panel27.add(label_77);
		
		JPanel panel28 = new JPanel();
		panel28.setLayout(null);
		panel28.setBounds(528, 303, 80, 93);
		getContentPane().add(panel28);
		list.add(panel28.getBounds());
		
			JLabel label_78 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			label_78.setBounds(0, 0, 80, 31);
			panel28.add(label_78);
			
			JLabel label_79 = new JLabel("\uC774\uB984");
			label_79.setBounds(0, 32, 80, 31);
			panel28.add(label_79);
			
			JLabel label_80 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			label_80.setBounds(0, 62, 80, 31);
			panel28.add(label_80);
		
		JPanel panel29 = new JPanel();
		panel29.setLayout(null);
		panel29.setBounds(620, 303, 80, 93);
		getContentPane().add(panel29);
		list.add(panel29.getBounds());
		
			JLabel label_81 = new JLabel("\uBE48\uC790\uB9AC\uC5EC\uBD80");
			label_81.setBounds(0, 0, 80, 31);
			panel29.add(label_81);
			
			JLabel label_82 = new JLabel("\uC774\uB984");
			label_82.setBounds(0, 32, 80, 31);
			panel29.add(label_82);
			
			JLabel label_83 = new JLabel("\uB0A8\uC740 \uC2DC\uAC04");
			label_83.setBounds(0, 62, 80, 31);
			panel29.add(label_83);
			
		setVisible(true);
		
	}
	
	class Mouse implements MouseListener, MouseMotionListener {
 
		@Override
		public void mouseDragged(MouseEvent e) {
			
		}
 
		@Override
		public void mouseMoved(MouseEvent e) {
			
		}
 
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}
 
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
 
		@Override
		public void mouseExited(MouseEvent e) {
			
		}
 
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
			for (i = 0; i < 29; i++) {
				String str =(String)list.get(i).toString();
				p_x = Integer.parseInt(str.substring(20,25).replaceAll("[^0-9]", ""));
				p_y = Integer.parseInt(str.substring(25,31).replaceAll("[^0-9]", ""));
				w = Integer.parseInt(str.substring(34,41).replaceAll("[^0-9]", ""));
				h = Integer.parseInt(str.substring(41).replaceAll("[^0-9]", ""));
				
				if((x > p_x && x < (p_x+w)) && (y > p_y && y < (p_y+h))) {
					JOptionPane.showMessageDialog(null, i+1);
				}
			}
		}
 
		@Override
		public void mouseReleased(MouseEvent e) {
			x = e.getX();	 
			y = e.getY();
			
		}
	}
	
	
	public static void main(String[] args) {
		SeatView seatview = new SeatView();
		
		seatview.SeatView();
	}
}