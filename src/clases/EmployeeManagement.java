package clases;

import java.util.ArrayList;

public class EmployeeManagement{

    // Lista de empleados que serán administrados
    private ArrayList<Employee> employees;
    //Crear un arreglo con determinado numero de elementos 
    //no tendría sentido en este caso ya que no es escalable
    //es decir no podrían crearse infinitos empleados

    // Constructor de la clase
    public EmployeeManagement() {
        // Inicialización de la lista de empleados
        employees = new ArrayList<>();
    }

    /**
     * Método para obtener la lista de empleados
     * @return La lista de empleados
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Método para establecer la lista de empleados
     * @param employees La lista de empleados a establecer
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    
    /**
     * Método para agregar un nuevo empleado a la lista
     * @param name El nombre del empleado
     * @param age La edad del empleado
     */
    public void addEmployee(String name, int age) {
        // Crear un nuevo objeto Employee
        Employee employee = new Employee(name,age);
        // Agregar el empleado a la lista
        employees.add(employee);
    }
    
    /**
     * Método para eliminar un empleado de la lista
     * @param employ El índice del empleado a eliminar
     */
    public void removeEmployee(int employ) {
        // Eliminar el empleado de la lista por su índice
        employees.remove(employ);
    }
    
    /**
     * Método para imprimir la lista de empleados
     */
    public void printEmployeeList() {
        // Iterar sobre la lista de empleados e imprimir sus detalles
        for (Employee employee : employees) {
            System.out.println("Nombre: " + employee.getName() + ", Edad: " + employee.getAge());
        }
    }
}

