import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableTester {

	public static void main(String[] args) {
		
		// Initialize the object arrays
		Measurable[] accounts = {
			new BankAccount(1300),
			new BankAccount(6500),
			new BankAccount(4562)
		};
		
		Measurable[] countries = {
			new Country("United States", 5220.3),
			new Country("Russia", 642220.6),
			new Country("India", 9652.2)
		};
		
		Measurable[] scores = {
			new Quiz(95),
			new Quiz(89),
			new Quiz(76.9)
		};
		
		// Accept desired metric from user
		Scanner in = new Scanner(System.in);
		System.out.print("Enter metric to use, 1 for max, 2 for min, 3 for avg: ");
		int metric = in.nextInt();
		in.close();
		
		
		// Turn that integer into a string
		String type = null;
		if (metric == 1) {type = "Maximum";
		} else if (metric == 2) {type = "Minimum";
		} else if (metric == 3) {type = "Average";}
		
		
		// Initialize the JFrame and its buttons
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton bal = new JButton("Get "+type+" Balance");
		JButton area = new JButton("Get "+type+" Area");
		JButton score = new JButton("Get "+type+" Score");
		
		panel.add(bal);
		panel.add(area);
		panel.add(score);
		
		frame.add(panel);
		
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		// Set up button listeners
		ActionListener getBal = new ClickListener(accounts, type);
		bal.addActionListener(getBal);
		
		ActionListener getArea = new ClickListener(countries, type);
		area.addActionListener(getArea);
		
		ActionListener getScore = new ClickListener(scores, type);
		score.addActionListener(getScore);
	}

}