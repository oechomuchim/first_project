package MemberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class seat {
	// �������
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	int a =0;
	
	//��� �޼ҵ�
	public void seat_delete(String seat_num) throws Exception {
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
		String sql = "delete from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1,seat_num);
		System.out.println("3. SQL�� ���� OK...");
		
//4. SQL ����
		ps.executeUpdate();
		System.out.println("4. SQL ���� OK....");
	}
	
	
	//��� �޼ҵ�
		public void seat_insert(String seat_num, String id, String vacant_seat, String time) throws Exception {
//			1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK.");
//			2. DB����(DB��, ID, NAME, PW, BIRTH, TEL, COUNT)
			url = "jdbc:mysql://localhost:3306/pc";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK..");
//			3. SQL ����
			String sql = "insert into member values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			
			//String to date
			String count = time;
			SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
			Date to = transFormat.parse(count);
			
			ps.setString(1,seat_num);
			ps.setString(2,id);
			ps.setString(3,vacant_seat);
			ps.setString(4,count);
			System.out.println("3. SQL�� ���� OK...");
	//4. SQL ����
			ps.executeUpdate();
			System.out.println("4. SQL ���� OK....");
		}
		
		//��� �޼ҵ�
		public void seat_update(String seat_num, String id, String vacant_seat, String time) throws Exception {
//			1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̹� ���� OK.");
//			2. DB����(DB��, ID, NAME, PW, BIRTH, TEL, COUNT)
			url = "jdbc:mysql://localhost:3306/pc";
			user ="root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ���� OK..");
//			3. SQL ����
			String sql = "Update member set seat=?, vacant_seat=?, count=? where id=?";
			ps = con.prepareStatement(sql);
			
			//String to date
			String count = time;
			SimpleDateFormat transFormat = new SimpleDateFormat("HH:mm:ss");
			Date to = transFormat.parse(count);
			
			//String to boolean(tinyint->int��)

			
			ps.setString(1,seat_num);
			//ps.setString(2,result);
			ps.setString(3,count);
			ps.setString(4,id);
			System.out.println("3. SQL�� ���� OK...");
	//4. SQL ����
			ps.executeUpdate();
			System.out.println("4. SQL ���� OK....");
		}
}
