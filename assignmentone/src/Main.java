import com.shams.assignmentone.employees.Developer;
import com.shams.assignmentone.employees.Manager;
import com.shams.assignmentone.utilities.EmployeeUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Manager manager = new Manager();
	        manager.setName("Shams");
	        manager.setEmployeeId(211407);
	        manager.setSalary(150000);
	        manager.setTeamSize(15);

	        // Create Developer instance
	        Developer developer = new Developer();
	        developer.setName("Arzaan");
	        developer.setEmployeeId(211415);
	        developer.setSalary(80000);
	        developer.setProgrammingLanguage("Python");

	        // Use EmployeeUtilities methods
	        EmployeeUtilities.printEmployeeDetails(manager);
	        EmployeeUtilities.printEmployeeDetails(developer);
	    }
}