import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
	private JTextArea area, area1;
	private String word;
	private JButton button;

	public GUI() {
		super();

		this.setSize(500, 500);
		this.setVisible(true);

		FlowLayout layout = new FlowLayout();
		BorderLayout border = new BorderLayout();
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();

		area = new JTextArea("Enter text here ");
		area.setBackground(Color.WHITE);

		area1 = new JTextArea("Translated Text");

		button = new JButton("translations");
		panel.setLayout(layout);
		panel1.setLayout(layout);
		panel.add(area);
		panel1.add(area1);

		this.add(button, border.NORTH);
		this.add(panel, border.NORTH);
		this.add(panel1, border.NORTH);
		this.setLayout(layout);

		button.addActionListener(this);

	}

	public static void main(String[] args) {
		GUI window = new GUI();

	}

	public void actionPerformed(ActionEvent event) {
		String buttonText = event.getActionCommand();
		Scanner keyIn;
		String s = area.getText();
		String word = "";
		if (buttonText.equals("translations")) {
			this.translate(s);
			area1.setText((this.translate(s)));
		}
	}

	public static String translate(String sentence) {
		String result = "";
		Scanner keyIn = new Scanner(sentence);
		sentence = sentence.toLowerCase();
		while (keyIn.hasNext()) {
			result += translateWord(keyIn.next());
			result += " ";
		}
		return result;
	}

	private static String translateWord(String word) {
		String result = "";
		if (vowel(word))
			result = word + "way";
		else
			result = word.substring(1) + word.charAt(0) + "ay";
		return result;
	}

	private static boolean vowel(String word) {
		String vowels = "aeiou";
		char letter = word.charAt(0);
		return (vowels.indexOf(letter) != -1);
	}

}
