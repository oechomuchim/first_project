package PC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import PC.PcDTO;

public class PcDAO {

	String url = "jdbc:mysql://localhost:3306/pc";
	String user = "root";
	String password = "1234";

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	PcDTO dto = null;

//		// ȸ�� ���� ����
//		public void insert(PcDTO dto) {
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//				con = DriverManager.getConnection(url, user, password);
//				String sql = "insert into member values(?,?,?,?,?,?)";
//				ps = con.prepareStatement(sql);
//				ps.setString(1, dto.getId());
//				ps.setString(2, dto.getPw());
//				ps.setString(3, dto.getBirth());
//				ps.setString(4, dto.getTel());
//				ps.setString(5, dto.getName());
//				ps.setTime(6, dto.getCount());
//				ps.executeUpdate();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	
	// ���̵� �ߺ� Ȯ��
	public ArrayList IdCheck() {
		ArrayList list = new ArrayList();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			rs=ps.executeQuery();
			while (rs.next()) {
				dto = new PcDTO();
				ps = con.prepareStatement(sql);
				String id = rs.getString(1);
				dto.setId(id);
				
				list.add(dto);
			}
		}catch(
		Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();

		}finally
		{
			try {
				rs.close(); 
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("�ڿ� ���� �� ���� ���!X/");
			} 
		}
		return list;
	}
	
	// ȸ�� ����
	public void insert(PcDTO dto) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
				String sql = "insert into member (id, pw, name, tel, birth) values(?,?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				ps.setString(3, dto.getName());
				ps.setString(4, dto.getTel());
				ps.setString(5, dto.getBirth());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}