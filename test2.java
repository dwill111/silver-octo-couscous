package test2;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;

public class test2 extends JFrame implements ActionListener {
	private static JPanel panel;
	

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setSize(500, 500);
		window.setVisible(true);

		BorderLayout layout = new BorderLayout();
		JButton button1 = new JButton("Load file");
		JButton exitButton = new JButton("Click to exit");

		test2 buttonear = new test2();
		button1.addActionListener(buttonear);
		exitButton.addActionListener(buttonear);

		panel = new JPanel();
		JPanel panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(exitButton);

		window.add(panel1, layout.NORTH);
		window.add(panel, FlowLayout.CENTER);
	}

	public int recursiveInteger(int n) {
		if (n == 0) {
			return 0;
		}

		else if (n == 1) {
			return 1;
		} else {
			return (n + recursiveInteger(n - 1));
		}

	}

	public void actionPerformed(ActionEvent event) {
		String buttonText = event.getActionCommand();
		JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
	
		LinkedList<JButton> list = new LinkedList<JButton>();

		if (buttonText.equals("Load file")) {
			fileChooser.showOpenDialog(panel);

			Scanner keyIn;
			try {
				keyIn = new Scanner(fileChooser.getSelectedFile());
				while (keyIn.hasNextInt()) {
					int result = recursiveInteger(keyIn.nextInt());
					JButton button = new JButton("" + result);
					list.add(button);
					for (int i = 0; i < list.size(); i++) {
						panel.add(list.get(i));
						if (button.equals(i)) {
							panel.removeAll();
						}

					}
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

		else if (buttonText.equals("Click to exit")) {
			System.exit(0);
		}

	}

}