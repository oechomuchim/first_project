package PC;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.awt.event.ActionEvent;

public class SignUp {
	/**
	 * @wbp.parser.entryPoint
	 */
	
	// 현금 결제
	public void CashPayment() {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();
		PcMain pc = new PcMain();

		JLabel cashPaymentLabel = new JLabel("현금 결제");
		cashPaymentLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		cashPaymentLabel.setBounds(155, 10, 125, 31);
		f.getContentPane().add(cashPaymentLabel);

		// 선택 금액
		JLabel selectCashLabel = new JLabel(Integer.toString(pc.price));
		f.getContentPane().add(selectCashLabel);
		
		//PcMain pcMain = new PcMain();

		selectCashLabel.setBounds(36, 60, 69, 40);

		// 투입 금액
		JLabel insertCashLabel = new JLabel("투입 금액");
		f.getContentPane().add(insertCashLabel);
		
		String[] cashType = { "1000", "2000", "3000", "4000", "5000", "10000", "20000" };
		JComboBox comboBox = new JComboBox(cashType);
		f.getContentPane().add(comboBox);
		
		String a = null;
		int b = 0;
		
		for (int i = 0; i < cashType.length; i++) {
			a = cashType[i];
			b = Integer.parseInt(a);
		}
		

		comboBox.setBounds(117, 127, 103, 21);
		insertCashLabel.setBounds(36, 126, 69, 23);

		// 거스름돈
		JLabel cashChangeLabel = new JLabel("유효 기간");
		f.getContentPane().add(cashChangeLabel);

		//int result = b-
				
		cashChangeLabel.setBounds(36, 179, 69, 31);

		// 결제 완료
		JButton completeBtn = new JButton("결제");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다");
			}
		});
		completeBtn.setBounds(149, 248, 97, 23);
		f.getContentPane().add(completeBtn);

		// 프레임 옵션
		f.setTitle("카드 결제");
		f.setSize(421, 331);
		f.getContentPane().setLayout(null);
		
		f.setVisible(true);
	}
	
	
	// 카드 결제
	public void CardPayment() {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();

		JLabel signUpLabel = new JLabel("카드 결제");
		signUpLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		signUpLabel.setBounds(199, 10, 125, 31);
		f.getContentPane().add(signUpLabel);

		// 카드종류
		JLabel idLabel = new JLabel("카드 종류");
		f.getContentPane().add(idLabel);

		String[] cardType = { "신한은행", "우리은행", "국민은행", "기업은행", "농협은행", "케이뱅크", "카카오뱅크" };
		JComboBox comboBox = new JComboBox(cardType);
		f.getContentPane().add(comboBox);

		comboBox.setBounds(104, 70, 103, 21);
		idLabel.setBounds(36, 60, 69, 40);

		// 카드번호
		JLabel cardNumberLabel = new JLabel("카드 번호");
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

		// 유효기간
		JLabel cardDueDateLabel = new JLabel("유효 기간");
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

		// 비밀번호 앞 두자리
		JLabel cardPasswordLabel = new JLabel("비밀번호");
		f.getContentPane().add(cardPasswordLabel);
		
		JTextField cardPasswordTextField1 = new JTextField(10);
		cardPasswordTextField1.setBounds(104, 278, 37, 21);
		f.getContentPane().add(cardPasswordTextField1);
		
		JLabel cardPasswordLabel1 = new JLabel("* *");
		cardPasswordLabel1.setBounds(150, 281, 57, 15);
		f.getContentPane().add(cardPasswordLabel1);

		cardPasswordLabel.setBounds(36, 273, 69, 31);

		// 생년월일
		JLabel cardBirthLabel = new JLabel("생년월일");
		f.getContentPane().add(cardBirthLabel);
		
		JTextField cardBirthTextField1 = new JTextField(10);
		cardBirthTextField1.setBounds(104, 333, 57, 21);
		f.getContentPane().add(cardBirthTextField1);
		
		JLabel cardBirthLabel1 = new JLabel("(6자리)");
		cardBirthLabel1.setBounds(169, 336, 57, 15);
		f.getContentPane().add(cardBirthLabel1);

		cardBirthLabel.setBounds(36, 318, 69, 50);
		
		// 결제 완료
		JButton completeBtn = new JButton("결제");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "결제가 완료되었습니다");
			}
		});
		completeBtn.setBounds(193, 402, 97, 23);
		f.getContentPane().add(completeBtn);
		

		// 프레임 옵션
		f.setTitle("카드 결제");
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		
		f.setVisible(true);
	}
	
	
	// 회원가입
	public void MemberJoin() {
		JFrame f = new JFrame();
		JButton signUp = new JButton();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();

		// 회원가입
		JLabel signUpLabel = new JLabel("회원 가입");
		signUpLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		signUpLabel.setBounds(199, 10, 125, 31);
		f.getContentPane().add(signUpLabel);

		// 아이디 입력
		JLabel idLabel = new JLabel("*아이디");
		f.getContentPane().add(idLabel);
		JTextField idTextField = new JTextField(10);
		f.getContentPane().add(idTextField);

		idLabel.setBounds(36, 60, 69, 40);
		idTextField.setBounds(136, 65, 214, 31);

		// 아이디 중복확인
		JButton idCheckLabel = new JButton("중복확인");
		idCheckLabel.setBounds(361, 69, 97, 23);
		f.getContentPane().add(idCheckLabel);

		if (dao.IdCheck().equals(idTextField.getText())) {
			System.out.println("중복!");
			idTextField.setText("");
		}

		// 비밀번호 입력
		JLabel pwLabel = new JLabel("*비밀번호");
		JTextField pwTextField = new JPasswordField();

		f.getContentPane().add(pwLabel);
		f.getContentPane().add(pwTextField);

		pwLabel.setBounds(32, 106, 57, 40);
		pwTextField.setBounds(136, 111, 214, 31);

		// 비밀번호 재확인 입력
		JLabel pwLabel2 = new JLabel("*비밀번호 재확인");
		JTextField pwTextField2 = new JPasswordField();

		f.getContentPane().add(pwLabel2);
		f.getContentPane().add(pwTextField2);

		if (!pwTextField2.getText().equals(pwTextField.getText())) { // 비밀번호와 재확인이 다르다면 글자색 변경
			pwTextField2.setForeground(new Color(255, 0, 0));
		} else {
			pwTextField2.setForeground(new Color(0, 0, 0));
		}

		pwLabel2.setBounds(32, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);

		// 휴대폰 번호 입력
		JLabel telLabel = new JLabel("*휴대폰 번호");
		f.getContentPane().add(telLabel);
		JTextField telTextField = new JTextField(10);
		f.getContentPane().add(telTextField);

		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);

		// 생년월일 입력
		JLabel birthLabel = new JLabel("*생년월일");
		f.getContentPane().add(birthLabel);
		JTextField birthTextField = new JTextField(10);
		f.getContentPane().add(birthTextField);

		birthTextField.setBounds(136, 312, 214, 31);
		birthLabel.setBounds(36, 307, 69, 40);

		// 이름 입력
		JLabel nameLabel = new JLabel("이름");
		f.getContentPane().add(nameLabel);
		JTextField nameTextField = new JTextField(10);
		f.getContentPane().add(nameTextField);

		nameLabel.setBounds(36, 206, 33, 40);
		nameTextField.setBounds(136, 211, 214, 31);

		// 주의사항
		JLabel cautionLabel = new JLabel("*표시된 항목은 필수 항목 입니다");
		cautionLabel.setForeground(Color.RED);
		cautionLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		cautionLabel.setBounds(36, 357, 314, 15);
		f.getContentPane().add(cautionLabel);

		// 회원 가입 완료
		JButton completeBtn = new JButton("가입");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

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
				
				JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다");
			}
		});
		completeBtn.setBounds(193, 402, 97, 23);
		f.getContentPane().add(completeBtn);

		// 프레임 옵션
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		f.setTitle("회원 가입");

		f.setVisible(true);
	} // memberjoin

	public static void main(String[] args) {
		SignUp signUp = new SignUp();

		signUp.MemberJoin();
		signUp.CardPayment();
		signUp.CashPayment();
	}
} // class
