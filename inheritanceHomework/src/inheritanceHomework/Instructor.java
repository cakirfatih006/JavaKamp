package inheritanceHomework;

public class Instructor extends User{

	private String certificatesOwned;

	public Instructor(int id, String firstName, String lastName, String identity,String certificatesOwned) {
		super();
		this.certificatesOwned = certificatesOwned;
	}

	public Instructor() {
		
	}

	public String getCertificatesOwned() {
		return certificatesOwned;
	}

	public void setCertificatesOwned(String certificatesOwned) {
		this.certificatesOwned = certificatesOwned;
	}
	
	
	
	
}
