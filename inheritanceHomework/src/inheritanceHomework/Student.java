package inheritanceHomework;

public class Student extends User{

	private String nickName;

	public Student(String nickName, int id, String firstName, String lastName, String identity) {
		super();
		this.nickName = nickName;
	}
	
	public Student() {
		
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	

}
