package inheritanceHomework;

public class Main {

	
public static void main(String[] args) {
	
	User user=new User();
	user.setId(1);
	user.setFirstName("Base");
	user.setLastName("Default");
	user.setIdentity("52494");
	
	Student studentZiya=new Student("Kodder", 2, "Ziya", "Karataş", "5665");
	
	Instructor instructorEngin=new Instructor(3, "Engin", "Demirog", "5354", "MCT,PMP,ITIL  =)");
	
	User [] users= {user,instructorEngin,studentZiya};
	
	for (User user2 : users) {
		System.out.println(user2.getFirstName());
	}
	
	UserManager userManager=new UserManager();
	userManager.addMultiple(users);
	
	StudentManager studentManager=new StudentManager();
	studentManager.add(studentZiya);
	
	InstructorManager instructorManager=new InstructorManager();
	instructorManager.add(instructorEngin);
	
	
	
	
	
	}
}
