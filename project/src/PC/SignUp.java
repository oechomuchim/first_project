package PC;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class SignUp {
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField telTextField;
	private JTextField birthTextField;
	private JPasswordField pwTextField;
	private JPasswordField pwTextField2;
	private JTextField countTextField;

	/**
	 * @wbp.parser.entryPoint
	 */
	
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
		idTextField = new JTextField(10);
		f.getContentPane().add(idTextField);
		
		idLabel.setBounds(36, 60, 69, 40);
		idTextField.setBounds(136, 65, 214, 31);
		
		// 아이디 중복확인
		JButton idCheckLabel = new JButton("중복확인");
		idCheckLabel.setBounds(361, 69, 97, 23);
		f.getContentPane().add(idCheckLabel);
		

		// 비밀번호 입력
		JLabel pwLabel = new JLabel("*비밀번호");
		pwTextField = new JPasswordField();
		
		f.getContentPane().add(pwLabel);
		f.getContentPane().add(pwTextField);
		
		pwLabel.setBounds(32, 106, 57, 40);
		pwTextField.setBounds(136, 111, 214, 31);
		
		// 비밀번호 재확인 입력
		JLabel pwLabel2 = new JLabel("*비밀번호 재확인");
		pwTextField2 = new JPasswordField();
		
		f.getContentPane().add(pwLabel2);
		f.getContentPane().add(pwTextField2);
		
		if(!pwTextField2.getText().equals(pwTextField.getText())) {  // 비밀번호와 재확인이 다르다면 글자색 변경
			pwTextField2.setForeground(new Color(255, 0, 0));
		} else{
			pwTextField2.setForeground(new Color(0, 0, 0));
		} 
		
		pwLabel2.setBounds(32, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);
		
		
		// 휴대폰 번호 입력
		JLabel telLabel = new JLabel("*휴대폰 번호");
		f.getContentPane().add(telLabel);
		telTextField = new JTextField(10);
		f.getContentPane().add(telTextField);
		
		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);
		
		// 생년월일 입력
		JLabel birthLabel = new JLabel("*생년월일");
		f.getContentPane().add(birthLabel);
		birthTextField = new JTextField(10);
		f.getContentPane().add(birthTextField);
		
		birthTextField.setBounds(136, 312, 214, 31);
		birthLabel.setBounds(36, 307, 69, 40);
		
		// 이름 입력
		JLabel nameLabel = new JLabel("이름");
		f.getContentPane().add(nameLabel);
		nameTextField = new JTextField(10);
		f.getContentPane().add(nameTextField);
		
		nameLabel.setBounds(36, 206, 33, 40);
		nameTextField.setBounds(136, 211, 214, 31);
		
		// 주의사항
		JLabel cautionLabel = new JLabel("*표시된 항목은 필수 항목 입니다");
		cautionLabel.setForeground(Color.RED);
		cautionLabel.setFont(new Font("굴림", Font.PLAIN, 11));
		cautionLabel.setBounds(36, 357, 314, 15);
		f.getContentPane().add(cautionLabel);
		
		// count
		countTextField = new JTextField();
		countTextField.setBounds(362, 317, 116, 21);
		f.getContentPane().add(countTextField);
		
		countTextField.setColumns(10);
		
		// 회원 가입 완료
		JButton completeBtn = new JButton("가입");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					  String id = idTextField.getText();
					  String pw = pwTextField.getText();
					  String tel = telTextField.getText();
					  String birth = birthTextField.getText();
					  String name = nameTextField.getText();
					  //Time count = countTextField.getText();  gettext를 텍스트로 안받고 time클래스로,,, ㅠ
					          
					  dto.setId(id);
					  dto.setPw(pw);
					  dto.setTel(tel);
					  dto.setBirth(birth);
					  dto.setName(name);
					  //dto.setCount(count);
					  
					  dao.insert(dto);
			 }
		});
		completeBtn.setBounds(193, 402, 97, 23);
		f.getContentPane().add(completeBtn);
		
		// 프레임 옵션
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		SignUp signUp = new SignUp();
		
		signUp.MemberJoin();
	}
}
