package inheritanceHomework;

public class StudentManager extends UserManager{

	@Override
	public void add() {
		System.out.println("��renci kayd� tamamland�.");
		
	}
	
	@Override
	public void list() {
		System.out.println("��renciler listelendi.");
		
	}
	
	
	
	
}
