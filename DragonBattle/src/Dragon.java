import java.util.LinkedList;
import java.util.Random;

public class Dragon {
	private int totalHealth;
	private int currentHealth;

	private double totalAttackFactor;
	private double currentAttackFactor;

	private double totalDefenseFactor;
	private double currentDefenseFactor;

	private int totalMana;
	private int currentMana;

	private String type;
	private LinkedList<String> skills;

	public Dragon() {
		setType();
		this.totalHealth = (int) ((int) 70 + Math.random() * ((100 - 70) + 1));
		setCurrentHealth(this.totalHealth);
		this.totalAttackFactor = 0 + Math.random() * ((2 - 0) + 1);
		setTotalAttackFactor(this.totalAttackFactor);
		this.totalDefenseFactor = 0 + Math.random() * ((0.5 - 0) + 1);
		setTotalDefenseFactor(this.totalDefenseFactor);
		this.totalMana = (int) ((int) 10 + Math.random() * ((20 - 10) + 10));
		setTotalManaPoints(this.totalMana);
		skills = Skills.createSkillSet();

	}

	public String listDragonAbilities() {
		return "[" + type + "]:" + " [" + skills.getFirst() + "] " + "[" + skills.get(1) + "] " + "[" + skills.get(2)
				+ "] " + "[" + skills.getLast() + "]";
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getTotalHealth() {
		return this.totalHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setTotalAttackFactor(double attack) {
		this.currentAttackFactor = attack;
	}

	public double getTotalAttackFactor() {
		return this.totalAttackFactor;
	}

	public double getCurrentAttackFactor() {
		return currentAttackFactor;
	}

	public void setTotalDefenseFactor(double defense) {
		this.currentDefenseFactor = defense;
	}

	public double getTotalDefenseFactor() {
		return this.totalDefenseFactor;
	}

	public double getCurrentDefenseFactor() {
		return currentDefenseFactor;
	}

	public void setTotalManaPoints(int manaPoints) {
		this.currentMana = manaPoints;
	}

	public int getTotalManaPoints() {
		return this.totalMana;
	}

	public int getCurrentManaPoints() {
		return currentMana;
	}

	public void setType() {
		Random rand = new Random();
		int type = rand.nextInt(8) + 1;
		if (type == 1) {
			this.type = "Jade";
		} else if (type == 2) {
			this.type = "Ruby";
		} else if (type == 3) {
			this.type = "Topaz";
		} else if (type == 4) {
			this.type = "Alabaster";
		} else if (type == 5) {
			this.type = "Amethyst";
		} else if (type == 6) {
			this.type = "Coral";
		} else if (type == 7) {
			this.type = "Indigo";
		} else if (type == 8) {
			this.type = "Golden Dragon God";
		}
	}

	public String getType() {
		return this.type;
	}
}
