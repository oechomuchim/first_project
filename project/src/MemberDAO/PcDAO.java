package MemberDAO;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

public class PcDAO {
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField telTextField;
	private JTextField birthTextField;
	private JPasswordField pwTextField;
	private JPasswordField pwTextField2;
//	public void NonMember() {
//		
//	}
//	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void MemberJoin() {
		JFrame f = new JFrame();
		JButton signUp = new JButton();
		FlowLayout flow = new FlowLayout();
		
		// 아이디 입력
		JLabel idLabel = new JLabel("아이디");
		f.getContentPane().add(idLabel);
		idTextField = new JTextField(10);
		f.getContentPane().add(idTextField);
		
		idLabel.setBounds(36, 60, 69, 40);
		idTextField.setBounds(136, 65, 214, 31);
		
		// 비밀번호 입력
		JLabel pwLabel = new JLabel("비밀번호");
		pwTextField = new JPasswordField();
		
		f.getContentPane().add(pwLabel);
		f.getContentPane().add(pwTextField);
		
		pwLabel.setBounds(32, 106, 57, 40);
		pwTextField.setBounds(136, 111, 214, 31);
		
		// 비밀번호 재확인 입력
		JLabel pwLabel2 = new JLabel("비밀번호 재확인");
		pwTextField2 = new JPasswordField();
		
		f.getContentPane().add(pwLabel2);
		f.getContentPane().add(pwTextField2);
		
		if(!pwTextField2.getText().equals(pwTextField.getText())) {  // 비밀번호와 재확인이 다르다면 글자색 변경
			pwTextField2.setForeground(new Color(255, 0, 0));
		} else{
			pwTextField2.setForeground(new Color(0, 0, 0));
		} 
		
		pwLabel2.setBounds(36, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);
		
		// 이름 입력
		JLabel nameLabel = new JLabel("이름");
		f.getContentPane().add(nameLabel);
		nameTextField = new JTextField(10);
		f.getContentPane().add(nameTextField);
		
		nameLabel.setBounds(36, 206, 33, 40);
		nameTextField.setBounds(136, 211, 214, 31);
		
		// 휴대폰 번호 입력
		JLabel telLabel = new JLabel("휴대폰 번호");
		f.getContentPane().add(telLabel);
		telTextField = new JTextField(10);
		f.getContentPane().add(telTextField);
		
		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);
		
		// 생년월일 입력
		JLabel birthLabel = new JLabel("생년월일");
		f.getContentPane().add(birthLabel);
		birthTextField = new JTextField(10);
		f.getContentPane().add(birthTextField);
		
		birthTextField.setBounds(136, 312, 214, 31);
		birthLabel.setBounds(36, 307, 69, 40);
		
		
		// 프레임 옵션
		f.setSize(408, 450);
		f.getContentPane().setLayout(null);
		
		
		f.setVisible(true);
	}
}
