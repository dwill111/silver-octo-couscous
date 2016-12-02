package food;

public class RiceAndBeans extends FoodItem {

	public double cost;
	public double weight;
	public double PricePerPound;
	
	public RiceAndBeans(String name, double weight, double PricePerPound) {
		super(name);
		this.name = name;
		this.weight = weight;
		this.PricePerPound = PricePerPound;
	}
	public int getCost(){
        return (int)Math.round((weight * PricePerPound) * 100);
    }
   
    public double getWeight(){
        return this.weight;
    }
   
    public double getPricePerPound(){
        return this.PricePerPound;
    }
}
