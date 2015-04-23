package project;

import java.util.Stack;

public class stackRobot {
	static double x = 0;
	static double y = 0;
	static Stack<String> commands = new Stack<String>();

	public static void main(String[] args) {

		commands.push("1.15 N");
		commands.push("0.79 S");
		commands.push("0.25 W");
		commands.push("0.15 W");
		commands.push("1.78 S");
		commands.push("0.95 E");
		commands.push("0.75 E");
		commands.push("1.37 N");
		commands.push("0.75 E");
		commands.push("1.85 W");
		commands.push("1.73 W");
		commands.push("0.72 N");
		commands.push("0.75 E");
		commands.push("0.65 E");
		commands.push("1.09 S");
		commands.push("1.75 W");
		commands.push("1.55 N");
		commands.push("0.73 E");
		commands.push("1.05 W");
		commands.push("0.71 E");
		commands.push("1.45 E");
		commands.push("1.75 N");
		commands.push("1.91 S");
		commands.push("0.45 S");
		commands.push("0.11 E");

		while (!commands.empty()) {
			double move = Double.parseDouble(commands.peek().substring(0, 4));
			
			if (commands.peek().substring(5, 6).equals("N")) {
				x += move;
			} else if (commands.peek().substring(5, 6).equals("S")) {
				x -= move;
			} else if (commands.peek().substring(5, 6).equals("E")) {
				y += move;
			} else if (commands.peek().substring(5, 6).equals("W")) {
				y -= move;
			}
			commands.pop();
		}

		if (commands.empty()) {
			if (x > 0 && y > 0)
				System.out.println("waffle");
			else if (x < 0 && y > 0)
				System.out.println("taco");
			else if (x < 0 && y < 0)
				System.out.println("cupcake");
			else if (x > 0 && y < 0)
				System.out.println("poop");
			else
				System.out.println("You're in the middle! Make up your mind!");
		}
	}
}
