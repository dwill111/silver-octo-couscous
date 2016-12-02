package food;

public class Churro extends FoodItem{

	public String name;
	public double cost;
	
	public Churro(String name, double cost) {
		super(name);
		this.name = name;
		this.cost = cost;
		
	}

	public int getCost() {
		return (int)Math.round((cost) * 100 );
	}
	
}