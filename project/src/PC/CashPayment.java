package PC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CashPayment {
	static PcMain pc = new PcMain();
	static PcMain2 pc2 = new PcMain2();
	// ȸ�� ���� ����
		public void MemberCashPayment() {
			
			JFrame f = new JFrame();
			PcDAO dao = new PcDAO();
			PcDTO dto = new PcDTO();

			JLabel cashPaymentLabel = new JLabel("ȸ�� ���� ����");
			cashPaymentLabel.setFont(new Font("����", Font.PLAIN, 18));
			cashPaymentLabel.setBounds(129, 10, 190, 31);
			f.getContentPane().add(cashPaymentLabel);

			// ���� �ݾ�
			JLabel selectCashLabel = new JLabel("���� �ݾ�");
			
			String pc_priceString = Integer.toString(pc.price);
			JLabel selectCashLabel2 = new JLabel(pc_priceString);
			
			f.getContentPane().add(selectCashLabel);
			f.getContentPane().add(selectCashLabel2);
			
			selectCashLabel.setBounds(36, 60, 69, 40);
			selectCashLabel2.setBounds(117, 69, 51, 23);

			// ���� �ݾ�
			JLabel insertCashLabel = new JLabel("���� �ݾ�");
			f.getContentPane().add(insertCashLabel);
			
			String[] cashType = { "1000", "2000", "3000", "4000", "5000", "10000", "20000" };
			JComboBox comboBox = new JComboBox(cashType);
			// comboBox.setSelectedItem(null);
			f.getContentPane().add(comboBox);
			String comboBoxSelectedItemString = (String)comboBox.getSelectedItem();
			
			int comboBoxSelectedItemInt;
			comboBoxSelectedItemInt = Integer.parseInt(comboBoxSelectedItemString);
			
			JButton insertCashCompleteBtn = new JButton("����");
			insertCashCompleteBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int pc_priceInt = Integer.parseInt(pc_priceString);
					int cashResult = pc_priceInt-comboBoxSelectedItemInt;
					String cashResultString = Integer.toString(cashResult);
					JLabel cashChangeLabel2 = new JLabel(cashResultString);
					cashChangeLabel2.setForeground(Color.RED);
					
					f.getContentPane().add(cashChangeLabel2);
					cashChangeLabel2.setBounds(117, 179, 103, 31);
					
				}
			});
			f.getContentPane().add(insertCashCompleteBtn);
			
			insertCashCompleteBtn.setBounds(235, 126, 69, 23);
			comboBox.setBounds(117, 127, 103, 21);
			insertCashLabel.setBounds(36, 126, 69, 23);

			// �Ž�����
			JLabel cashChangeLabel = new JLabel("�Ž�����");
			f.getContentPane().add(cashChangeLabel);
			
			cashChangeLabel.setBounds(36, 179, 69, 31);

			// ���� �Ϸ�
			JButton completeBtn = new JButton("����");
			completeBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�");
					f.dispose();
				}
			});
			completeBtn.setBounds(149, 248, 97, 23);
			f.getContentPane().add(completeBtn);

			// ������ �ɼ�
			f.setTitle("ȸ�� ���� ����");
			f.setSize(421, 331);
			f.getContentPane().setLayout(null);
			
			f.setVisible(true);
		}
		
	// ��ȸ�� ���� ����	
	public void NonMemberCashPayment() {
		
		JFrame f = new JFrame();
		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();
	
		JLabel cashPaymentLabel = new JLabel("��ȸ�� ���� ����");
		cashPaymentLabel.setFont(new Font("����", Font.PLAIN, 18));
		cashPaymentLabel.setBounds(129, 10, 190, 31);
		f.getContentPane().add(cashPaymentLabel);
	
		// ���� �ݾ�
		JLabel selectCashLabel = new JLabel("���� �ݾ�");
		
		String pc2_priceString = Integer.toString(pc2.price);
		JLabel selectCashLabel2 = new JLabel(pc2_priceString);
		
		f.getContentPane().add(selectCashLabel);
		f.getContentPane().add(selectCashLabel2);
		
		selectCashLabel.setBounds(36, 60, 69, 40);
		selectCashLabel2.setBounds(117, 69, 51, 23);
	
		// ���� �ݾ�
		JLabel insertCashLabel = new JLabel("���� �ݾ�");
		f.getContentPane().add(insertCashLabel);
		
		String[] cashType = { "1000", "2000", "3000", "4000", "5000", "10000", "20000" };
		JComboBox comboBox = new JComboBox(cashType);
		// comboBox.setSelectedItem(null);
		f.getContentPane().add(comboBox);
		String comboBoxSelectedItemString = (String)comboBox.getSelectedItem();
		
		int comboBoxSelectedItemInt;
		comboBoxSelectedItemInt = Integer.parseInt(comboBoxSelectedItemString);
		
		JButton insertCashCompleteBtn = new JButton("����");
		insertCashCompleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pc_priceInt = Integer.parseInt(pc2_priceString);
				int cashResult = pc_priceInt-comboBoxSelectedItemInt;
				String cashResultString = Integer.toString(cashResult);
				JLabel cashChangeLabel2 = new JLabel(cashResultString);
				cashChangeLabel2.setForeground(Color.RED);
				
				f.getContentPane().add(cashChangeLabel2);
				cashChangeLabel2.setBounds(117, 179, 103, 31);
				
			}
		});
		f.getContentPane().add(insertCashCompleteBtn);
		
		insertCashCompleteBtn.setBounds(235, 126, 69, 23);
		comboBox.setBounds(117, 127, 103, 21);
		insertCashLabel.setBounds(36, 126, 69, 23);
	
		// �Ž�����
		JLabel cashChangeLabel = new JLabel("�Ž�����");
		f.getContentPane().add(cashChangeLabel);
		
		cashChangeLabel.setBounds(36, 179, 69, 31);
	
		// ���� �Ϸ�
		JButton completeBtn = new JButton("����");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�");
				f.dispose();
			}
		});
		completeBtn.setBounds(149, 248, 97, 23);
		f.getContentPane().add(completeBtn);
	
		// ������ �ɼ�
		f.setTitle("��ȸ�� ���� ����");
		f.setSize(421, 331);
		f.getContentPane().setLayout(null);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		CashPayment cashPayment = new CashPayment();
		
		cashPayment.MemberCashPayment();
		cashPayment.NonMemberCashPayment();
		
	}
}


