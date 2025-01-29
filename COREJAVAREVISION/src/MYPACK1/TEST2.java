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

public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
