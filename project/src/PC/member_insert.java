package PC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement.ParseInfo;

public class member_insert {
	// �������
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	//��� �޼ҵ�
	public void insert_member(String id, String name, String pw, String birth, String tel, String time, String seat_num) throws Exception {
//		1. ����̹� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. ����̹� ���� OK.");
		
//		2. DB����(DB��, ID, NAME, PW, BIRTH, TEL, COUNT)
		url = "jdbc:mysql://localhost:3306/pc";
		user ="root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ���� OK..");
		
//		3. SQL ����
		String sql = "insert into member values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		
		//String to date
		String count = time;
		SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
		Date to = transFormat.parse(count);
		
		//String to int
		int num = Integer.parseInt(seat_num);
		
		ps.setString(1,id);
		ps.setString(2,name);
		ps.setString(3,pw);
		ps.setString(4,birth);
		ps.setString(5,tel);
		ps.setString(6,count);
		ps.setInt(7,num);
		System.out.println("3. SQL�� ���� OK...");
		
//4. SQL ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK....");
	}

}
