
/*
 * @since 09.02.1

 * @author Zavarynskyi Nazarii
 */
package laba1;

public class EDeclaration {

	private  String nameOfPerson;
	private  String typeOfDeclaration;
	private int numberOfHouses = 0;
	private int numberOfCars = 0;
	private int earnings = 0;
	static int numberOfRealty = 0;


	static int sum;
	
	/*
	 * constructor with 4 parameters
	 */
	EDeclaration(String nameOfPerson , int numberOfHouses, int numberOfCars, int earnings) {

		this.numberOfHouses = numberOfHouses;
		this.numberOfCars = numberOfCars;
		this.earnings = earnings;
	}

	/*
	 * constructor with 2 parametrs
	 */
	EDeclaration(String nameOfPerson, String typeOfDeclaration) {
		this.nameOfPerson = nameOfPerson;
		this.typeOfDeclaration = typeOfDeclaration;
	}

	/*
	 * default constructor
	 */
	EDeclaration() {
	}

	static void staticPrintSum() {
		System.out.println("Number of realty : " + numberOfRealty); // printing number of realty
	}

	public int printSum() {
		return sum = numberOfCars + numberOfHouses; // calculating number of realty
	}


	/*
	 * returning info
	 */
	@Override
	public String toString() {
		return  "Name : " + nameOfPerson + "\n" +
				"Type of declaration : " + typeOfDeclaration + "\n" +
				"Houses : " + numberOfHouses + "\n" +
				"Cars : " + numberOfCars + "\n" +
				"Earnings : " + earnings + "\n" +
				"___________________________________________" + "\n";
	}

	public void resetValues(int numberOfHouses, int numberOfCars) { // changing values
		this.numberOfHouses = numberOfHouses;
		this.numberOfCars = numberOfCars;

	}

	public void setNumberOfHouses(int numberOfHouses) { // setting number of houses
		this.numberOfHouses = numberOfHouses;
	}

	public void setNumberOfCars(int numberOfCars) { // setting number of cars
		this.numberOfCars = numberOfCars;
	}

	public void setEarnings(int earnings) { // setting earnings
		this.earnings = earnings;
	}

	public void setNameOfPerson(String nameOfPerson) { //setting name of person
		this.nameOfPerson = nameOfPerson;
	}

	public void setTypeOfDeclaration(String typeOfDeclaration) { // setting type of declaration
		this.typeOfDeclaration = typeOfDeclaration;
	}

	public static void main(String[] args) {
		EDeclaration edecl1 = new EDeclaration();
		edecl1.setNameOfPerson(" Petro Poroshenko");
		edecl1.setTypeOfDeclaration(" every-year declaration");
		edecl1.setNumberOfHouses(2);
		edecl1.setNumberOfCars(3);
		edecl1.setEarnings(120000);
		edecl1.resetValues(1, 2);
		System.out.println(edecl1.toString());

		EDeclaration edecl2 = new EDeclaration("",2,10, 70000);
		edecl2.setNameOfPerson(" Viktor Yushenko");
		edecl2.setTypeOfDeclaration(" every-month declaration");
		System.out.println(edecl2.toString());

		EDeclaration edecl3 = new EDeclaration("",5, 11, 150000);
		edecl3.setNameOfPerson(" Viktor Yanukovych");
		edecl3.setTypeOfDeclaration(" every-year declaration");
		edecl1.resetValues(6, 4);
		System.out.println(edecl3.toString());

		System.out.print("Realty = " );
		System.out.println(edecl1.printSum() + edecl2.printSum() + edecl3.printSum());

	}

}

