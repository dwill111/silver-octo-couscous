package food;

public abstract class FoodItem {

	protected String name;
	
	public FoodItem(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract int getCost();
	
}
