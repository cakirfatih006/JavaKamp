package inheritanceHomework;

public class InstructorManager extends UserManager{

	@Override
	public void add() {
		System.out.println("Eðitmen kaydý tamamlandý.");
		
	}
	
	@Override
	public void list() {
		System.out.println("Eðitmenler listelendi.");
		
	}
	
}
