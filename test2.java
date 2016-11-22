package test2;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;

public class test2 extends JFrame implements ActionListener {
	private JPanel panel;

	public static void main(String[] args) {
		LinkedList<JButton> list = new LinkedList<JButton>();
		String fileName1 = "file1.txt";
		String fileName2 = "file2.txt";
		String fileName3 = "file3.txt";
		Scanner keyIn = new Scanner(System.in);

		test2 method = new test2();
		JFrame window = new JFrame();
		window.setSize(500, 500);
		window.setVisible(true);

		BorderLayout layout = new BorderLayout();
		JButton button1 = new JButton("Load file");
		JButton exitButton = new JButton("Click to exit");
		
		test2 buttonear = new test2();
		button1.addActionListener(buttonear);
		exitButton.addActionListener(buttonear);

		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(exitButton);
		
		window.add(panel1, layout.NORTH);
		window.add(panel, FlowLayout.CENTER);
		
//		System.out.println("Enter a number: ");
//		int number = keyIn.nextInt();
//
//		System.out.println(method.recursiveInteger(number));
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
		if (buttonText.equals("Load file")) {
			fileChooser.showOpenDialog(panel);
		}
		
		else if(buttonText.equals("Click to exit")){
			System.exit(0);
		}

	}

}
