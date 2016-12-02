package food;

public class Taco extends FoodItem {
	   
    public int amount;
    public double price;
    public String name;
    public double cost;

    
    public Taco(String name, int amount, double price) {
        super(name);
        this.name = name;
        this.amount = amount;
        this.price = price;
        
    }

    public String getName(){
        return this.name;
    }
   
    public int getCost(){
        return (int)Math.round((this.amount * this.price) * 100);
    }
   
    public double getPricePerTaco(){
        return this.price;
    }
   
    public int getAmount(){
        return this.amount;
    }
}