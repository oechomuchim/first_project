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
		
		JTextField cardPasswordTextField1 = new JTextField(2);
		cardPasswordTextField1.setBounds(104, 278, 37, 21);
		f.getContentPane().add(cardPasswordTextField1);
		
		JLabel cardPasswordLabel1 = new JLabel("* *");
		cardPasswordLabel1.setBounds(150, 281, 57, 15);
		f.getContentPane().add(cardPasswordLabel1);

		cardPasswordLabel.setBounds(36, 273, 69, 31);

		// 생년월일
		JLabel cardBirthLabel = new JLabel("생년월일");
		f.getContentPane().add(cardBirthLabel);
		
		JTextField cardBirthTextField1 = new JTextField(6);
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
				f.dispose();
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
	
	 //회원가입
	public void MemberJoin() {
		JFrame f = new JFrame();
		JButton signUp = new JButton();
		FlowLayout flow = new FlowLayout();

		PcDAO dao = new PcDAO();
		PcDTO dto = new PcDTO();

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
		JButton idCheckBtn = new JButton("중복확인");
		idCheckBtn.setBounds(361, 69, 97, 23);
		f.getContentPane().add(idCheckBtn);
		
		idCheckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String inputId = idTextField.getText(); // 입력한 아이디를 string값으로 저장
				
				PcDTO dto = dao.selectId(inputId); // dto에 dao로 찾은 db에저장된 아이디값 저장
				String id = dto.getId(); // selectid로 dto에 setid해놓은 id값을 다시 getid로 불러옴 = id는 db에 저장된 id!

			if (inputId.equals(id)) {
				JOptionPane.showMessageDialog(null, "중복입니다 다시 입력해주세요");
				idTextField.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "사용가능한 아이디 입니다:)");
			}
		  }
		});

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

		pwLabel2.setBounds(32, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);

		// 휴대폰 번호 입력
		JLabel telLabel = new JLabel("*휴대폰 번호");
		f.getContentPane().add(telLabel);
		JTextField telTextField = new JTextField(11);
		f.getContentPane().add(telTextField);

		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);

		// 생년월일 입력
		JLabel birthLabel = new JLabel("*생년월일");
		f.getContentPane().add(birthLabel);
		JTextField birthTextField = new JTextField(6);
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
				 if (idTextField.getText().equals("")&&pwTextField.getText().equals("")&&pwTextField2.getText().equals("")
						 &&telTextField.getText().equals("")&&birthTextField.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "정보를 입력해주세요");
						
						
//						if(!pwTextField2.getText().equals(pwTextField.getText())) {
//							JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다. 다시 입력해주세요");
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
					
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다");
					f.dispose();
			   }
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
	}
} // class
