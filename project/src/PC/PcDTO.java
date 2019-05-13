package PC;

import java.sql.Time;

public class PcDTO {
	// FOR SIGNUP!
	String id;
	String pw;
	String birth;
	String tel;
	String name;
	Time count;
	
	public PcDTO() {
		
	}
	
	public PcDTO(String id, String pw, String birth, String tel, String name, Time count) {
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.tel = tel;
		this.name = name;
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public Time getCount() {
		return count;
	}
	
	public void setCount(Time count) {
		this.count = count;
	}
}
