package inheritanceHomework;

public class StudentManager extends UserManager{

	@Override
	public void add() {
		System.out.println("Öðrenci kaydý tamamlandý.");
		
	}
	
	@Override
	public void list() {
		System.out.println("Öðrenciler listelendi.");
		
	}
	
	
	
	
}
