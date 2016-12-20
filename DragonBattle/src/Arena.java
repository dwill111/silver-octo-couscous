import java.util.*;

public class Arena {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyIn = new Scanner(System.in);
		Dragon dragon = new Dragon();
		Skills skill = new Skills();
		Dragon computerDragon = new Dragon();
		String userName;
		String skillSet;
		int count = 0;

		LinkedList<String> skills;
		skills = Skills.createSkillSet();
		int computerSkillSet;
		Random rand = new Random();
		if (dragon.getType().equals(computerDragon.getType())) {
			dragon.getType();
		}
		System.out.println("Welcome to Dragon Battle! Player, please enter your name: ");
		userName = keyIn.nextLine();
		System.out.println(userName + ", you have been assigned a " + dragon.getType() + " Dragon with HP: "
				+ dragon.getTotalHealth() + "/" + dragon.getTotalHealth() + " and MP: " + dragon.getTotalManaPoints()
				+ "/" + dragon.getTotalManaPoints() + ".\nYour opponent, the computer, has been assigned a "
				+ computerDragon.getType() + " Dragon, with HP: " + computerDragon.getTotalHealth() + "/"
				+ computerDragon.getTotalHealth() + " and MP: " + computerDragon.getTotalManaPoints() + "/"
				+ computerDragon.getTotalManaPoints());

		count = count % 2;
		while (computerDragon.getCurrentHealth() != 0 || dragon.getCurrentHealth() != 0) {

			if (count == 0) {

				System.out.println("\nIt is your turn, " + userName + "! Choose an attack: ");
				System.out.println(dragon.listDragonAbilities());
				Skills.createSkillSet();
				skillSet = keyIn.nextLine();
				System.out.println(" " + dragon.getType() + " used " + "[" + skillSet + "]");
				skill.execute(skillSet, dragon, computerDragon);
				System.out.println(
						"[" + dragon.getType() + "] HP: " + dragon.getCurrentHealth() + "/" + dragon.getTotalHealth()
								+ ", MP: " + dragon.getCurrentManaPoints() + "/" + dragon.getTotalManaPoints());
				System.out.println("[" + computerDragon.getType() + "] HP: " + computerDragon.getCurrentHealth() + "/"
						+ computerDragon.getTotalHealth() + ", MP: " + computerDragon.getCurrentManaPoints() + "/"
						+ computerDragon.getTotalManaPoints());

				if (computerDragon.getCurrentHealth() <= 0) {
					System.out.println("Congratulations " + userName + " you have won the Dragon Battle! ");
					break;
				}

			} else if (count == 1) {
				computerSkillSet = rand.nextInt(4) + 1;
				System.out.println("\nComputer's turn! ");
				System.out.println("Choose an attack: ");
				System.out.println(skills);

				if (computerSkillSet == 1) {
					skills.get(0);
					System.out.println(" " + computerDragon.getType() + " used " + "[" + skills.get(0) + "]");
					skill.execute(skills.getFirst(), computerDragon, dragon);
				} else if (computerSkillSet == 2) {
					skills.get(1);
					System.out.println(" " + computerDragon.getType() + " used " + "[" + skills.get(1) + "]");
					skill.execute(skills.get(1), computerDragon, dragon);
				} else if (computerSkillSet == 3) {
					skills.get(2);
					System.out.println(" " + computerDragon.getType() + " used " + "[" + skills.get(2) + "]");
					skill.execute(skills.get(2), computerDragon, dragon);
				} else {
					skills.get(3);
					System.out.println(" " + computerDragon.getType() + " used " + "[" + skills.getLast() + "]");
					skill.execute(skills.getLast(), computerDragon, dragon);
				}

				System.out.println("[" + computerDragon.getType() + "] HP: " + computerDragon.getCurrentHealth() + "/"
						+ computerDragon.getTotalHealth() + ", MP: " + computerDragon.getCurrentManaPoints() + "/"
						+ computerDragon.getTotalManaPoints());
				System.out.println(
						"[" + dragon.getType() + "] HP: " + dragon.getCurrentHealth() + "/" + dragon.getTotalHealth()
								+ ", MP: " + dragon.getCurrentManaPoints() + "/" + dragon.getTotalManaPoints());
				if (dragon.getCurrentHealth() <= 0) {
					System.out.println("The Computer has won, Better Luck Next Time!");
					break;
				}
			}
			count++;
		}
	}
}
