package MYPACK1;
//inheritance - 
// HASA-relationship
//parent-child relationship
class person {
	private String AadharId;
	private String name;
	private int age;
	//constructor to receive 3 inputs
	public person(String aadharId, String name, int age) {
		super();
		AadharId = aadharId;
		this.name = name;
		this.age = age;
	}
	public person() {
		super();
	}
	//alt shift s to generate getter setter
	public String getAadharId() {
		return AadharId;
	}
	public void setAadharId(String aadharId) {
		AadharId = aadharId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Employee extends person {
	private String empId;
	private String designation;
	private double salary;
	//alt shift s to generate two constructors 
	// and getter setter
	public Employee(String aadharId, String name, int age, String empId, String designation, double salary) {
		super(aadharId, name, age);
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee(String aadharId, String name, int age) {
		super(aadharId, name, age);
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
