/*Andrew Vue
 * IT 145 Section J4938
 * March 2020
 * PetBAG Assignment
 */

package petBAG;

public class Pet {
	//These are private fields as noted in the UML with the - sign
	 
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue; //Double is used to get a decimal for the cost of stay
	
	/*Class constructors
	 * When any constructor is defined the compiler doesn't implicitly define a default constructor and rely on method, otherwise it will 
	 * have a error. So we need to create a public Pet class so we don't need to call setPetType seperately later.
	 */
	
	public Pet() {
		petType = "None";
		petName = "None";
		petAge = -1;
		dogSpace = -1;
		catSpace = -1;
		amountDue = -1.0;
	}
	
	//Parameterized constructor is set to accept multiple parameters
	public Pet(String petType, String petName, int dogSpace, int catSpace) {
		this.petType = petType;
		this.petName = petName;
		petAge = -1; 			//Default should be set to -1 like the zybook examples
		this.dogSpace = dogSpace;
		this.catSpace = catSpace;
		daysStay = -1;
		amountDue = -1.0;
	}
	/*Using setter void return types because these don't return a value
	 * Using a return statement to follow best practices for more readable code
	 */
	
	public void setPetType(String petType) {
		this.petType = petType; //this keyword is a reference to the object.
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
	
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
		return;
	}
	
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
		return;
	}

/* Getters return type gives us the data type being returned
 * 
 */

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
	
	public double getAmountDue() {
		return amountDue;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
/*The CheckIn CheckOUt getPet createPet and updatePet processes will be added when more information is given

 */
	public void checkIn() {
		//FIX more information needed
	
	}
	
	public void checkOut() {
		//FIX more information needed
	}
	
	public void getPet() {
		//FIX more information needed
	}
	
	public void createPet() {
		//FIX more information needed
	}
	
	public void updatePet() {
		//FIX more information needed
	}
}
