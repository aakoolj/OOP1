
public class qu2_car {
	
	private int mTyres; //primitive variable
	private int mYear;
	private String mMake;
	private String mModel; //reference
	
	public qu2_car() {
		mTyres = 4;
	}
	
	public qu2_car(String make, String model, int year) {
		if ( (make == "Reliant") || (model == "Robin") ) {
			mTyres = 3;
		}
		else {
			mTyres = 4;
		}
		mMake = make;
		mModel = model;
	}
	
	public int getTyres() {
		return (mTyres);
	}
	public int getYear() {
		return (mYear);
	}
	public String getModel() {
		return (mModel);
	}
	public String getMake() {
		return (mMake);
	}
	
	public void print(qu2_car Car) {
		System.out.println("Car information as follows: ");
		System.out.println("Make: "+Car.getMake());
		// we want .getMake() so it access specific information about car
		// (putting just mMake will not give the required output if we have multiple
		// cars?)
		System.out.println("Model: "+Car.getModel());
		System.out.println("Number of Tyres: "+Car.getTyres());
		System.out.println("Year: "+Car.getYear());
	}
	
}
