package inheritanceHomework;

public class InstructorManager extends UserManager{

	@Override
	public void add() {
		System.out.println("E�itmen kayd� tamamland�.");
		
	}
	
	@Override
	public void list() {
		System.out.println("E�itmenler listelendi.");
		
	}
	
}
