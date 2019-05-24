package PC;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp {
	/**
	 * @wbp.parser.entryPoint
	 */
	static PcMain pc = new PcMain();
	
	// ī�� ����
	public void CardPayment() {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();

		JLabel signUpLabel = new JLabel("ī�� ����");
		signUpLabel.setFont(new Font("����", Font.PLAIN, 18));
		signUpLabel.setBounds(199, 10, 125, 31);
		f.getContentPane().add(signUpLabel);

		// ī������
		JLabel idLabel = new JLabel("ī�� ����");
		f.getContentPane().add(idLabel);

		String[] cardType = { "��������", "�츮����", "��������", "�������", "��������", "���̹�ũ", "īī����ũ" };
		JComboBox comboBox = new JComboBox(cardType);
		f.getContentPane().add(comboBox);
		

		comboBox.setBounds(104, 70, 103, 21);
		idLabel.setBounds(36, 60, 69, 40);

		// ī���ȣ
		JLabel cardNumberLabel = new JLabel("ī�� ��ȣ");
		f.getContentPane().add(cardNumberLabel);
		
		JTextField cardNumberTextField1 = new JTextField();
		cardNumberTextField1.setBounds(104, 127, 57, 21);
		f.getContentPane().add(cardNumberTextField1);
		cardNumberTextField1.setColumns(10);

		JTextField cardNumberTextField2 = new JTextField();
		cardNumberTextField2.setColumns(10);
		cardNumberTextField2.setBounds(188, 127, 57, 21);
		f.getContentPane().add(cardNumberTextField2);

		JTextField cardNumberTextField3 = new JTextField();
		cardNumberTextField3.setColumns(10);
		cardNumberTextField3.setBounds(267, 127, 57, 21);
		f.getContentPane().add(cardNumberTextField3);

		JTextField cardNumberTextField4 = new JTextField();
		cardNumberTextField4.setColumns(10);
		cardNumberTextField4.setBounds(347, 127, 57, 21);
		f.getContentPane().add(cardNumberTextField4);
		
		JLabel cardNumberLabel1 = new JLabel("-");
		cardNumberLabel1.setBounds(169, 130, 57, 15);
		f.getContentPane().add(cardNumberLabel1);

		JLabel cardNumberLabel2 = new JLabel("-");
		cardNumberLabel2.setBounds(251, 130, 49, 15);
		f.getContentPane().add(cardNumberLabel2);

		JLabel cardNumberLabel3 = new JLabel("-");
		cardNumberLabel3.setBounds(330, 130, 57, 15);
		f.getContentPane().add(cardNumberLabel3);

		cardNumberLabel.setBounds(36, 126, 69, 23);

		// ��ȿ�Ⱓ
		JLabel cardDueDateLabel = new JLabel("��ȿ �Ⱓ");
		f.getContentPane().add(cardDueDateLabel);
		
		JTextField cardDueDateTextField1 = new JTextField(10);
		cardDueDateTextField1.setBounds(105, 180, 57, 21);
		f.getContentPane().add(cardDueDateTextField1);

		JTextField cardDueDateTextField2 = new JTextField(10);
		cardDueDateTextField2.setBounds(188, 180, 57, 21);
		f.getContentPane().add(cardDueDateTextField2);
		
		JLabel cardDueDateLabel1 = new JLabel("/");
		cardDueDateLabel1.setBounds(169, 183, 57, 15);
		f.getContentPane().add(cardDueDateLabel1);
		
		JLabel cardDueDateLabel2 = new JLabel("(mm/yy)");
		cardDueDateLabel2.setBounds(251, 183, 57, 15);
		f.getContentPane().add(cardDueDateLabel2);

		cardDueDateLabel.setBounds(36, 170, 57, 40);

		// cvc
		JLabel cardCvcLabel = new JLabel("cvc");
		f.getContentPane().add(cardCvcLabel);
		
		JTextField cardCvcTextField1 = new JTextField(10);
		cardCvcTextField1.setBounds(104, 230, 57, 21);
		f.getContentPane().add(cardCvcTextField1);

		cardCvcLabel.setBounds(36, 230, 69, 21);

		// ��й�ȣ �� ���ڸ�
		JLabel cardPasswordLabel = new JLabel("��й�ȣ");
		f.getContentPane().add(cardPasswordLabel);
		
		JTextField cardPasswordTextField1 = new JTextField(2);
		cardPasswordTextField1.setBounds(104, 278, 37, 21);
		f.getContentPane().add(cardPasswordTextField1);
		
		JLabel cardPasswordLabel1 = new JLabel("* *");
		cardPasswordLabel1.setBounds(150, 281, 57, 15);
		f.getContentPane().add(cardPasswordLabel1);

		cardPasswordLabel.setBounds(36, 273, 69, 31);

		// �������
		JLabel cardBirthLabel = new JLabel("�������");
		f.getContentPane().add(cardBirthLabel);
		
		JTextField cardBirthTextField1 = new JTextField(6);
		cardBirthTextField1.setBounds(104, 333, 57, 21);
		f.getContentPane().add(cardBirthTextField1);
		
		JLabel cardBirthLabel1 = new JLabel("(6�ڸ�)");
		cardBirthLabel1.setBounds(169, 336, 57, 15);
		f.getContentPane().add(cardBirthLabel1);

		cardBirthLabel.setBounds(36, 318, 69, 50);
		
		// ���� �Ϸ�
		JButton completeBtn = new JButton("����");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�");
				f.dispose();
			}
		});
		completeBtn.setBounds(193, 402, 97, 23);
		f.getContentPane().add(completeBtn);
		

		// ������ �ɼ�
		f.setTitle("ī�� ����");
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		
		f.setVisible(true);
	}
	
	 //ȸ������
	public void MemberJoin() {
		JFrame f = new JFrame();
		JButton signUp = new JButton();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();

		JLabel signUpLabel = new JLabel("ȸ�� ����");
		signUpLabel.setFont(new Font("����", Font.PLAIN, 18));
		signUpLabel.setBounds(199, 10, 125, 31);
		f.getContentPane().add(signUpLabel);

		// ���̵� �Է�
		JLabel idLabel = new JLabel("*���̵�");
		f.getContentPane().add(idLabel);
		JTextField idTextField = new JTextField(10);
		f.getContentPane().add(idTextField);

		idLabel.setBounds(36, 60, 69, 40);
		idTextField.setBounds(136, 65, 214, 31);

		// ���̵� �ߺ�Ȯ��
		JButton idCheckBtn = new JButton("�ߺ�Ȯ��");
		idCheckBtn.setBounds(361, 69, 97, 23);
		f.getContentPane().add(idCheckBtn);
		
		idCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String inputId = idTextField.getText(); // �Է��� ���̵� string������ ����
				
				PcDTO dto = dao.selectId(inputId); // dto�� dao�� ã�� db������� ���̵� ����
				String id = dto.getId(); // selectid�� dto�� setid�س��� id���� �ٽ� getid�� �ҷ��� = id�� db�� ����� id!

			if (inputId.equals(id)) {
				JOptionPane.showMessageDialog(null, "�ߺ��Դϴ� �ٽ� �Է����ּ���");
				idTextField.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "��밡���� ���̵� �Դϴ�:)");
			}
		  }
		});

		// ��й�ȣ �Է�
		JLabel pwLabel = new JLabel("*��й�ȣ");
		JTextField pwTextField = new JPasswordField();

		f.getContentPane().add(pwLabel);
		f.getContentPane().add(pwTextField);

		pwLabel.setBounds(32, 106, 57, 40);
		pwTextField.setBounds(136, 111, 214, 31);

		// ��й�ȣ ��Ȯ�� �Է�
		JLabel pwLabel2 = new JLabel("*��й�ȣ ��Ȯ��");
		JTextField pwTextField2 = new JPasswordField();

		f.getContentPane().add(pwLabel2);
		f.getContentPane().add(pwTextField2);

		pwLabel2.setBounds(32, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);

		// �޴��� ��ȣ �Է�
		JLabel telLabel = new JLabel("*�޴��� ��ȣ");
		f.getContentPane().add(telLabel);
		JTextField telTextField = new JTextField(11);
		f.getContentPane().add(telTextField);

		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);

		// ������� �Է�
		JLabel birthLabel = new JLabel("*�������");
		f.getContentPane().add(birthLabel);
		JTextField birthTextField = new JTextField(6);
		f.getContentPane().add(birthTextField);

		birthTextField.setBounds(136, 312, 214, 31);
		birthLabel.setBounds(36, 307, 69, 40);

		// �̸� �Է�
		JLabel nameLabel = new JLabel("�̸�");
		f.getContentPane().add(nameLabel);
		JTextField nameTextField = new JTextField(10);
		f.getContentPane().add(nameTextField);

		nameLabel.setBounds(36, 206, 33, 40);
		nameTextField.setBounds(136, 211, 214, 31);

		// ���ǻ���
		JLabel cautionLabel = new JLabel("*ǥ�õ� �׸��� �ʼ� �׸� �Դϴ�");
		cautionLabel.setForeground(Color.RED);
		cautionLabel.setFont(new Font("����", Font.PLAIN, 11));
		cautionLabel.setBounds(36, 357, 314, 15);
		f.getContentPane().add(cautionLabel);

		// ȸ�� ���� �Ϸ�
		JButton completeBtn = new JButton("����");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if (idTextField.getText().equals("")&&pwTextField.getText().equals("")&&pwTextField2.getText().equals("")
						 &&telTextField.getText().equals("")&&birthTextField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "������ �Է����ּ���");
						
						
//						if(!pwTextField2.getText().equals(pwTextField.getText())) {
//							JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٸ��ϴ�. �ٽ� �Է����ּ���");
//							pwTextField2.setText("");
//						}
				} else {
					String id = idTextField.getText();
					String pw = pwTextField.getText();
					String tel = telTextField.getText();
					String birth = birthTextField.getText();
					String name = nameTextField.getText();

					dto.setId(id);
					dto.setPw(pw);
					dto.setTel(tel);
					dto.setBirth(birth);
					dto.setName(name);

					dao.insert(dto);
					
					JOptionPane.showMessageDialog(null, "ȸ�������� �Ϸ�Ǿ����ϴ�");
					f.dispose();
			   }
			}
		});
		completeBtn.setBounds(193, 402, 97, 23);
		f.getContentPane().add(completeBtn);

		// ������ �ɼ�
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		f.setTitle("ȸ�� ����");

		f.setVisible(true);
	} // memberjoin

	public static void main(String[] args) {
		SignUp signUp = new SignUp();

		signUp.MemberJoin();
		signUp.CardPayment();
	}
} // class
