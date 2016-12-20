import java.util.LinkedList;
import java.util.Random;

public class Skills {

	public void Roar(Dragon defendingDragon) {
		double attackFactor = ((defendingDragon.getTotalAttackFactor() * (.1 + Math.random() * ((.3 - .1) + .1))));
		double setAttackFactor = defendingDragon.getCurrentAttackFactor() - attackFactor;
		defendingDragon.setTotalAttackFactor(setAttackFactor);
	}

	public void Flirt(Dragon defendingDragon) {
		double defenseFactor = (defendingDragon.getTotalDefenseFactor() * .1 + Math.random() * ((.30 - .10) + .10));
		double setDefenseFactor = defendingDragon.getCurrentDefenseFactor() - defenseFactor;
		defendingDragon.setTotalDefenseFactor(setDefenseFactor);
	}

	public void DragonDance(Dragon attackingDragon) {
		double attackDragonMana = (attackingDragon.getTotalManaPoints() * (.15 + Math.random() * ((.35 - .15) + .1)));
		int setAttackDragonMana = attackingDragon.getCurrentManaPoints() + (int) attackDragonMana;
		attackingDragon.setTotalManaPoints(setAttackDragonMana);

	}

	public void Bite(Dragon defendingDragon) {
		int defendingDragonHealth = (int) (defendingDragon.getCurrentHealth() - (10 + Math.random() * ((15 - 10) + 1)));
		defendingDragon.setCurrentHealth(defendingDragonHealth);
	}

	public void FireBlast(Dragon attackingDragon, Dragon defendingDragon) {
		double attackDragonManaPoints = attackingDragon.getTotalManaPoints()
				* ((.50 + Math.random() * (.75 - .50) + .10));
		int setAttackDragonManaPoints = (int) attackingDragon.getCurrentManaPoints() - (int) attackDragonManaPoints;
		double defendingDragonHealth = defendingDragon.getCurrentHealth() - ((15 + Math.random() * (25 - 15) + 1));

		if (attackingDragon.getCurrentManaPoints() <= 0) {
			System.out.println("Dragon has no mana, your turn is over");
		} else {
			attackingDragon.setTotalManaPoints(setAttackDragonManaPoints);
			defendingDragon.setCurrentHealth((int) defendingDragonHealth);
		}
	}

	public void HeatWave(Dragon attackingDragon) {
		double attackingDragonAttackFactor = attackingDragon.getTotalAttackFactor()
				* ((int) (.05 + Math.random() * (.35 - .05) + .10));
		double currentAttackingDragonAttackFactor = attackingDragon.getCurrentAttackFactor()
				+ attackingDragonAttackFactor;
		attackingDragon.setTotalAttackFactor(currentAttackingDragonAttackFactor);

		double attackingDragonTotalMana = attackingDragon.getTotalManaPoints()
				* ((.50 + Math.random() * (.50 - .25) + .10));
		int attackingDragonCurrentMana = attackingDragon.getCurrentManaPoints() - (int) attackingDragonTotalMana;
		attackingDragon.setTotalManaPoints(attackingDragonCurrentMana);

		double attackingDragonTotalHealth = attackingDragon.getCurrentHealth()
				* ((.05 + Math.random() * (.10 - .05) + .1));
		int attackingDragonCurrentHealth = attackingDragon.getCurrentHealth() - (int) attackingDragonTotalHealth;
		attackingDragon.setCurrentHealth(attackingDragonCurrentHealth);
	}

	public void CrystalGaze(Dragon attackingDragon, Dragon defendingDragon) {
		int attackingDragonMana = attackingDragon.getTotalManaPoints();
		double defendingDragonMana = defendingDragon.getCurrentManaPoints()
				* ((.05 + Math.random() * (.30 - .05) + .1));
		if (attackingDragon.getCurrentManaPoints() <= 0) {
			System.out.println("Dragon has no mana, your turn is over");
			
		} else {
			defendingDragonMana = defendingDragon.getCurrentManaPoints() - defendingDragonMana;
			defendingDragon.setTotalManaPoints((int) defendingDragonMana);
			attackingDragonMana = attackingDragon.getCurrentManaPoints() + (int) (defendingDragonMana / 2);
			attackingDragon.setTotalManaPoints(attackingDragonMana);
		}

	}

	public void DragonSong(Dragon attackingDragon) {
		double attackingDragonHealth = attackingDragon.getTotalHealth() * ((.05 + Math.random() * (.15 - .05) + .10));
		int currentAttackingDragonHealth = attackingDragon.getCurrentHealth() + (int) attackingDragonHealth;
		attackingDragon.setCurrentHealth(currentAttackingDragonHealth);
	}

	public void Shred(Dragon attackingDragon, Dragon defendingDragon) {
		double defendingDragonTotalHealth = defendingDragon.getCurrentHealth() - ((5 + Math.random() * (10 - 5) + 1));

		defendingDragon.setCurrentHealth((int) defendingDragonTotalHealth);

		double defendingDragonAttackFactor = defendingDragon.getTotalAttackFactor()
				* ((int) (.05 + Math.random() * (.10 - .05) + .1));
		double defendingDragonCurrentAttackFactor = defendingDragon.getCurrentAttackFactor()
				- defendingDragonAttackFactor;
		defendingDragon.setTotalAttackFactor(defendingDragonCurrentAttackFactor);
	}

	public void BloodSacrifice(Dragon attackingDragon, Dragon defendingDragon) {
		double attackingDragonMana = attackingDragon.getTotalManaPoints() * ((.10 + Math.random() * (.20 - .10) + .10));
		int attackingDragonCurrentMana = attackingDragon.getCurrentManaPoints() - (int) attackingDragonMana;
		attackingDragon.setTotalManaPoints(attackingDragonCurrentMana);

		int attackingDragonCurrentHealth = attackingDragon.getCurrentHealth() / 2;
		attackingDragon.setCurrentHealth(attackingDragonCurrentHealth);

		int defendingDragonCurrentHealth = defendingDragon.getCurrentHealth() / 2;
		defendingDragon.setCurrentHealth(defendingDragonCurrentHealth);
	}

	public void Berserk(Dragon attackingDragon, Dragon defendingDragon) {
		int attackingDragonTotalDefenseFactor = (int) attackingDragon.getTotalDefenseFactor() / 2;

		defendingDragon.setTotalDefenseFactor(attackingDragonTotalDefenseFactor);

		double defendingDragonTotalAttackFactor = (defendingDragon.getTotalAttackFactor() * 0.05);

		defendingDragon.setTotalAttackFactor(defendingDragonTotalAttackFactor);

		double defendingDragonTotalDefenseFactor = (defendingDragon.getTotalDefenseFactor() * 0.05);
		defendingDragon.setTotalDefenseFactor(defendingDragonTotalDefenseFactor);
	}

	public static LinkedList<String> createSkillSet() {
		LinkedList<String> list = new LinkedList<String>();
		Random ran = new Random();
		int i = 0;
		while (i < 4) {
			int token = ran.nextInt(11) + 1;
			if (token == 1) {
				if (list.contains("Roar")) {
					continue;
				}
				list.add("Roar");

			} else if (token == 2) {
				if (list.contains("Flirt")) {
					continue;
				}
				list.add("Flirt");

			} else if (token == 3) {
				if (list.contains("Dragon Dance")) {
					continue;
				}
				list.add("Dragon Dance");

			} else if (token == 4) {
				if (list.contains("Bite")) {
					continue;
				}
				list.add("Bite");

			} else if (token == 5) {
				if (list.contains("Fire Blast")) {
					continue;
				}
				list.add("Fire Blast");

			} else if (token == 6) {
				if (list.contains("Heat Wave")) {
					continue;
				}
				list.add("Heat Wave");

			} else if (token == 7) {
				if (list.contains("Crystal Gaze")) {
					continue;
				}
				list.add("Crystal Gaze");

			} else if (token == 8) {
				if (list.contains("Dragon Song")) {
					continue;
				}
				list.add("Dragon Song");

			} else if (token == 9) {
				if (list.contains("Shred")) {
					continue;
				}
				list.add("Shred");

			} else if (token == 10) {
				if (list.contains("Blood Sacrifice")) {
					continue;
				}
				list.add("Blood Sacrifice");

			} else if (token == 11) {
				if (list.contains("Berserk")) {
					continue;
				}
				list.add("Berserk");
			}
			i++;
		}
		return list;
	}

	public void execute(String skill, Dragon attackingDragon, Dragon defendingDragon) {
		if (skill.equals("Roar")) {
			Roar(defendingDragon);
		} else if (skill.equals("Flirt")) {
			Flirt(defendingDragon);
		} else if (skill.equals("Dragon Dance")) {
			DragonDance(attackingDragon);
		} else if (skill.equals("Bite")) {
			Bite(defendingDragon);
		} else if (skill.equals("Fire Blast")) {
			FireBlast(attackingDragon, defendingDragon);
		} else if (skill.equals("Heat Wave")) {
			HeatWave(attackingDragon);
		} else if (skill.equals("Crystal Gaze")) {
			CrystalGaze(attackingDragon, defendingDragon);
		} else if (skill.equals("Dragon Song")) {
			DragonSong(attackingDragon);
		} else if (skill.equals("Shred")) {
			Shred(attackingDragon, defendingDragon);
		} else if (skill.equals("Blood Sacrifice")) {
			BloodSacrifice(attackingDragon, defendingDragon);
		} else if (skill.equals("Berserk")) {
			Berserk(attackingDragon, defendingDragon);
		} else
			System.out.println("There is no such attack, your turn was wasted! ");
	}
}
