package Variables;

public class UserVO {
	private String mem_id;
	private String mem_pw;
	private String birth;
	
	public UserVO() {	
	}
	public UserVO(String mem_id, String mem_pw, String birth) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.birth = birth;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

}
