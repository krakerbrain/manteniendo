package manteniendo;
import clases.EmployeeManagement;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		EmployeeManagement employeeManagement = new EmployeeManagement();
		 employeeManagement.addEmployee("John",30);
		 employeeManagement.addEmployee("Alice",25);
		 employeeManagement.addEmployee("Mario",45);
		 employeeManagement.printEmployeeList();
		 System.out.println("Despues de eliminar");
		 employeeManagement.removeEmployee(1);
		 employeeManagement.printEmployeeList();
	}

}
