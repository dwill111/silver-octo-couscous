package food;

public class ChurroSundae extends Churro {
	public String name;
	public double ToppingCost;
	public double cost;
	public double total;

	public ChurroSundae(String name, double cost, double ToppingCost) {
		super(name, cost);
		this.name = name;
		this.cost = cost;
		this.ToppingCost = ToppingCost;
	}
	
	public double getToppingCost() {
		return this.ToppingCost;
	}
	
	public int getCost() {
		return (int)Math.round((cost + ToppingCost) * 100 );
	}

}