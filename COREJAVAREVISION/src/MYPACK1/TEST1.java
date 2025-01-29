package MYPACK1;
// PLACE FOR SERVER CLASSES
// TWO CLASS PRINCIPLE
// CLIENT-SERVER ARCHITECTURE
// NETFLIX, FACEBOOK, WHATSAPP, INSTA
class CalculatorService {
	private double inputData1;
	private double inputData2;
	private double result;
	//constructor to receive 2 datas
	// alt shift s
	public CalculatorService(double inputData1, double inputData2) {
		super();
		this.inputData1 = inputData1;
		this.inputData2 = inputData2;
	}
	// default input in default constructor
	public CalculatorService() {
		super();
	}
	// one input at a time through setter
	public double getInputData1() {
		return inputData1;
	}
	public void setInputData1(double inputData1) {
		this.inputData1 = inputData1;
	}
	public double getInputData2() {
		return inputData2;
	}
	public void setInputData2(double inputData2) {
		this.inputData2 = inputData2;
	}
	//business methods in service class
	public double add() {
		result=inputData1+inputData2;
		return result;
	}
	public double subtract() {
		result=inputData1-inputData2;
		return result;	 	
	}
	public double multiply(){
		result=inputData1*inputData2;
		return result;
	}
	public double divide() {
		result=inputData1/inputData2;
		return result;
	}
}
// THIS IS A CLIENT CLASS
public class TEST1 {
	public static void main(String[] args) {
		// Instantiation
		CalculatorService ob=new CalculatorService();
		ob.setInputData1(100);
		ob.setInputData2(50);
		System.out.println("Addition:"+ob.add());
		System.out.println("Subtraction:"+ob.subtract());
		System.out.println("Multiplication:"+ob.multiply());
		System.out.println("Division:"+ob.divide());
	}

}
