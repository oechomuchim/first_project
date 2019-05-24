package PC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class PcMain_AfterSearchingId {
	static SeatDTO dto = new SeatDTO();
	PcMain pc = new PcMain();
	int price = pc.price;
	static JFrame f = new JFrame();
	static ArrayList list = new ArrayList();
	static CashPayment cash;
	static int cashh;
	
	
	public void PcMain_AfterSearchingIdCon() {
		SignUp signUp = new SignUp();
		CashPayment cashPayment = new CashPayment();
		// 프레임
		
		String a = CashPayment.pc_priceString;
		
		// 회원 비회원 버튼
		JToggleButton membtn = new JToggleButton("회 원");
		f.getContentPane().add(membtn);
		membtn.setSelected(true); // 처음에 on
		
		// 가격 버튼
		JToggleButton pricebtn1 = new JToggleButton("1000");
		JToggleButton pricebtn2 = new JToggleButton("2000");
		JToggleButton pricebtn3 = new JToggleButton("3000");
		JToggleButton pricebtn4 = new JToggleButton("4000");
		JToggleButton pricebtn5 = new JToggleButton("5000");
		JToggleButton pricebtn6 = new JToggleButton("10000");
		JToggleButton pricebtn7 = new JToggleButton("15000");
		JToggleButton pricebtn8 = new JToggleButton("20000");
		
		pricebtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(true);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);
				price = 1000;
			}
		});
		f.getContentPane().add(pricebtn1);
		pricebtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(true);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);
				price = 2000;
			}
		});
		f.getContentPane().add(pricebtn2);
		pricebtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(true);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);				
				price = 3000;
			}
		});
		f.getContentPane().add(pricebtn3);
		pricebtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(true);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);
				price = 4000;
			}
		});
		f.getContentPane().add(pricebtn4);
		pricebtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(true);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);
				price = 5000;
			}
		});
		f.getContentPane().add(pricebtn5);
		pricebtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(true);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(false);
				price = 10000;
			}
		});
		f.getContentPane().add(pricebtn6);
		pricebtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(true);
				pricebtn8.setSelected(false);
				price = 15000;
			}
		});
		f.getContentPane().add(pricebtn7);
		pricebtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pricebtn1.setSelected(false);
				pricebtn2.setSelected(false);
				pricebtn3.setSelected(false);
				pricebtn4.setSelected(false);
				pricebtn5.setSelected(false);
				pricebtn6.setSelected(false);
				pricebtn7.setSelected(false);
				pricebtn8.setSelected(true);
				price = 20000;
			}
		});
		f.getContentPane().add(pricebtn8);
		
		if(price==1000) {
			pricebtn1.setSelected(true);			
		} else if(price==2000) {
			pricebtn2.setSelected(true);	
		} else if(price==3000) {
				pricebtn3.setSelected(true);
		} else if(price==4000) {
			pricebtn4.setSelected(true);
		} else if(price==5000) {
			pricebtn5.setSelected(true);
		} else if(price==10000) {
			pricebtn6.setSelected(true);
		} else if(price==15000) {
			pricebtn7.setSelected(true);
		} else if(price==20000) {
			pricebtn8.setSelected(true);
		}
		
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
				price=0; 
			}                
		});
		f.getContentPane().add(cashBtn);
		JButton changeBtn = new JButton("잔돈 반환");
		changeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				f.dispose();
			}
		});
		
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
		membtn.setBounds(15, 10, 442, 40);
		f.getContentPane().add(membtn);
		
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
		
		// ID검색 후 정보 
				SearchingId searchingid = new SearchingId();
				JLabel searchingIdLabel = new JLabel(searchingid.id);
				searchingIdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				searchingIdLabel.setFont(new Font("굴림", Font.PLAIN, 25));
				searchingIdLabel.setForeground(Color.BLUE);
				searchingIdLabel.setBounds(716, 0, 168, 31);
				f.getContentPane().add(searchingIdLabel);
				f.setSize(912,	441);
				
		
		// 프레임 옵션
		f.getContentPane().setLayout(null);
		f.setSize(912,	441);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		PcMain_AfterSearchingId pc_ASI = new PcMain_AfterSearchingId();
		pc_ASI.PcMain_AfterSearchingIdCon();
	}
} // class
