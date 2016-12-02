import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticTacToe extends JFrame implements ActionListener {
	private String letter = "";
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JPanel panel;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private BorderLayout layout;

	private boolean win = false;

	private int count = 0;

	public ticTacToe() {
		super();
		this.setVisible(true);
		this.setSize(500, 500);

		GridLayout grid = new GridLayout(3, 3);
		layout = new BorderLayout();
		panel = new JPanel();

		this.setLayout(layout);
		// alternate: this.setLayout(new BorderLayout());

		panel.setLayout(grid);
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);

		label1 = new JLabel("Game in progress");
		this.add(panel, layout.CENTER);
		this.add(label1, layout.NORTH);

	}

	public void actionPerformed(ActionEvent event) {
		count = count % 2;
		if (count == 0) {
			letter = "O";

		} else if (count == 1) {
			letter = "X";
		}
		count++;

		if (event.getSource() == button1) {
			button1.setText(letter);
			button1.setEnabled(false);
		} else if (event.getSource() == button2) {
			button2.setText(letter);
			button2.setEnabled(false);
		} else if (event.getSource() == button3) {
			button3.setText(letter);
			button3.setEnabled(false);
		} else if (event.getSource() == button4) {
			button4.setText(letter);
			button4.setEnabled(false);
		} else if (event.getSource() == button5) {
			button5.setText(letter);
			button5.setEnabled(false);
		} else if (event.getSource() == button6) {
			button6.setText(letter);
			button6.setEnabled(false);
		} else if (event.getSource() == button7) {
			button7.setText(letter);
			button7.setEnabled(false);
		} else if (event.getSource() == button8) {
			button8.setText(letter);
			button8.setEnabled(false);
		} else if (event.getSource() == button9) {
			button9.setText(letter);
			button9.setEnabled(false);
		}
		// vertical win
		if (button1.getText() == button2.getText() && button1.getText() == button3.getText()) {
			win = true;
		} else if (button4.getText() == button5.getText() && button4.getText() == button6.getText()) {
			win = true;
		} else if (button7.getText() == button8.getText() && button7.getText() == button9.getText()) {
			win = true;
		} else {

		}
		// horizontal win
		if (button1.getText() == button4.getText() && button1.getText() == button7.getText()) {
			win = true;
		} else if (button2.getText() == button5.getText() && button2.getText() == button8.getText()) {
			win = true;
		} else if (button3.getText() == button6.getText() && button3.getText() == button9.getText()) {
			win = true;
		}
		// diagonal win
		if (button1.getText() == button5.getText() && button1.getText() == button9.getText()) {
			win = true;
		} else if (button2.getText() == button5.getText() && button2.getText() == button8.getText()) {
			win = true;
		} else if (button3.getText() == button5.getText() && button3.getText() == button7.getText()) {
			win = true;
		}
	}

	public static void main(String[] args) {

		ticTacToe window = new ticTacToe();

	}
}
