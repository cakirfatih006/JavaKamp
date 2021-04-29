package inheritanceHomework;



public class UserManager {

	public void add(User user) {
		System.out.println("Yeni üye eklendi.");
		
	}
	
	public void addMultiple(User [] users) { // toplu ekleme
		for (User user : users) {
			add(user);
		}
		
	}
	
	public void list(User user) {
		System.out.println("Yeni üye eklendi.");
		
	}
	
}
