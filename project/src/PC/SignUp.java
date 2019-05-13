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
		
		// ȸ������
		JLabel signUpLabel = new JLabel("ȸ�� ����");
		signUpLabel.setFont(new Font("����", Font.PLAIN, 18));
		signUpLabel.setBounds(199, 10, 125, 31);
		f.getContentPane().add(signUpLabel);
		
		// ���̵� �Է�
		JLabel idLabel = new JLabel("*���̵�");
		f.getContentPane().add(idLabel);
		idTextField = new JTextField(10);
		f.getContentPane().add(idTextField);
		
		idLabel.setBounds(36, 60, 69, 40);
		idTextField.setBounds(136, 65, 214, 31);
		
		// ���̵� �ߺ�Ȯ��
		JButton idCheckLabel = new JButton("�ߺ�Ȯ��");
		idCheckLabel.setBounds(361, 69, 97, 23);
		f.getContentPane().add(idCheckLabel);
		

		// ��й�ȣ �Է�
		JLabel pwLabel = new JLabel("*��й�ȣ");
		pwTextField = new JPasswordField();
		
		f.getContentPane().add(pwLabel);
		f.getContentPane().add(pwTextField);
		
		pwLabel.setBounds(32, 106, 57, 40);
		pwTextField.setBounds(136, 111, 214, 31);
		
		// ��й�ȣ ��Ȯ�� �Է�
		JLabel pwLabel2 = new JLabel("*��й�ȣ ��Ȯ��");
		pwTextField2 = new JPasswordField();
		
		f.getContentPane().add(pwLabel2);
		f.getContentPane().add(pwTextField2);
		
		if(!pwTextField2.getText().equals(pwTextField.getText())) {  // ��й�ȣ�� ��Ȯ���� �ٸ��ٸ� ���ڻ� ����
			pwTextField2.setForeground(new Color(255, 0, 0));
		} else{
			pwTextField2.setForeground(new Color(0, 0, 0));
		} 
		
		pwLabel2.setBounds(32, 156, 105, 40);
		pwTextField2.setBounds(136, 161, 214, 31);
		
		
		// �޴��� ��ȣ �Է�
		JLabel telLabel = new JLabel("*�޴��� ��ȣ");
		f.getContentPane().add(telLabel);
		telTextField = new JTextField(10);
		f.getContentPane().add(telTextField);
		
		telTextField.setBounds(136, 261, 214, 31);
		telLabel.setBounds(36, 256, 93, 40);
		
		// ������� �Է�
		JLabel birthLabel = new JLabel("*�������");
		f.getContentPane().add(birthLabel);
		birthTextField = new JTextField(10);
		f.getContentPane().add(birthTextField);
		
		birthTextField.setBounds(136, 312, 214, 31);
		birthLabel.setBounds(36, 307, 69, 40);
		
		// �̸� �Է�
		JLabel nameLabel = new JLabel("�̸�");
		f.getContentPane().add(nameLabel);
		nameTextField = new JTextField(10);
		f.getContentPane().add(nameTextField);
		
		nameLabel.setBounds(36, 206, 33, 40);
		nameTextField.setBounds(136, 211, 214, 31);
		
		// ���ǻ���
		JLabel cautionLabel = new JLabel("*ǥ�õ� �׸��� �ʼ� �׸� �Դϴ�");
		cautionLabel.setForeground(Color.RED);
		cautionLabel.setFont(new Font("����", Font.PLAIN, 11));
		cautionLabel.setBounds(36, 357, 314, 15);
		f.getContentPane().add(cautionLabel);
		
		// count
		countTextField = new JTextField();
		countTextField.setBounds(362, 317, 116, 21);
		f.getContentPane().add(countTextField);
		
		countTextField.setColumns(10);
		
		// ȸ�� ���� �Ϸ�
		JButton completeBtn = new JButton("����");
		completeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					  String id = idTextField.getText();
					  String pw = pwTextField.getText();
					  String tel = telTextField.getText();
					  String birth = birthTextField.getText();
					  String name = nameTextField.getText();
					  //Time count = countTextField.getText();  gettext�� �ؽ�Ʈ�� �ȹް� timeŬ������,,, ��
					          
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
		
		// ������ �ɼ�
		f.setSize(506, 484);
		f.getContentPane().setLayout(null);
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		SignUp signUp = new SignUp();
		
		signUp.MemberJoin();
	}
}
