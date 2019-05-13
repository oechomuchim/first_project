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

		// 회원 정보 삽입
		public void insert(PcDTO dto) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
				String sql = "insert into member values(?,?,?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				ps.setString(3, dto.getBirth());
				ps.setString(4, dto.getTel());
				ps.setString(5, dto.getName());
				ps.setTime(6, dto.getCount());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}