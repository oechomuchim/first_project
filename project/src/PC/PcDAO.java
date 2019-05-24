package PC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;

import PC.PcDTO;

public class PcDAO {

	String url = "jdbc:mysql://localhost:3306/pc";
	String user = "root";
	String password = "1234";

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	PcDTO dto = null;

//		// 회원 정보 삽입
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
	
	// 아이디 중복 확인
	public PcDTO IdCheck(PcDTO inputId) {
		PcDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from member where id=?";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				ps = con.prepareStatement(sql);
				String id = rs.getString(1);
				dto.setId(id);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close(); 
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 방생!X/");
			} 
		}
		return dto;
	}
	
	// 회원 가입
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
	
	// 아이디 검색
	public PcDTO selectId(String inputId) {
		PcDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(url, user, password); 
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId); 
			rs = ps.executeQuery();
			
			if (rs.next()) { 
				dto = new PcDTO();
				String id = rs.getString(1);  
				
				dto.setId(id);
			} else {
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생!X/");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		} finally {
			try {
				rs.close();   
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 방생!X/");
			} // catch
		} // try - catch - finally
		return dto;
	}
	
}