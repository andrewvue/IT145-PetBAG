package petBAG;

public class Dog {
	//these are private fields as indicated in the UML with a - 
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue; //double is used so we can get a decimal
	public int dogSpaceNbr; // This is a public field as indicated in the UML document with a +
	public int dogWeight; //The assignment asks for weight
	public boolean grooming; //A boolean is used because we need a true/false  for grooming selection

	//We need to create class constructors for the rest of the program later when we need to call on these for checkIn and checkOut
	
	public Dog() {
		//petType is not set to dog because this will be migrated to the Pet class.
		//we need to set the int and doubles to -1/-1.0 as per zybooks this is best practice and we need to set the booleans to false
		petType = "None";
		petName = "None";
		petAge = -1;
		dogSpace = -1;
		catSpace  = -1;
		daysStay = -1;
		amountDue = -1.0;
		dogSpaceNbr = -1;
		dogWeight = -1;
		grooming = false;
	}
	public Dog(String petType, String petName, int dogSpace) {
		this.petType = petType; //this keyword helps clear up naming conflicts
		this.petName = petName;
		petAge = -1;
		this.dogSpace = dogSpace;
		catSpace = -1;
		daysStay = -1;
		amountDue = -1.0;
		dogSpaceNbr = -1;
		dogWeight = -1;
		grooming = false;
		
	}
	//We need to have setters and getters
	//Setters allow us to have an interface to write class fields
	//Getters allows us to read class fields
	//These two methods allow for private fields to be used in other access to read and write  private fields
	
	public void setPetType(String petType) {
		this.petType = petType;
		return;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
		return;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
		return;
	}
	
	public void setDogSpace(int dogSpace) {
		this.dogSpace = dogSpace;
		return;
	}
	
	public void setCatSpace(int catSpace) {
		this.catSpace = catSpace;
		return;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
		return;
	}
	
	public void setDogWEight(int dogWeight) {
		this.dogWeight = dogWeight;
		return;
	}
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
		return;
	}
	
	public void setdogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
		return;
	}
	
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
		return;
	}
	
	//Getters
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public int getDogSpace() {
		return dogSpace;
	}
	
	public int getCatSpace() {
		return catSpace;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public int getDogWeight() {
		return dogWeight;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public int getDogSpaceNbr() {
		return dogSpaceNbr;
	}
	
	public boolean getGrooming() {
		return grooming;
	}

}
