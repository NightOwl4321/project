package project;

import java.util.Stack;

public class NOTHanoi {
	static String text = "@@@@fcgvuh@@@@";
	public static void main(String[] args) {
		int length = text.length();
		Stack<String> tower = new Stack<String>();
		Stack<String> tower = new Stack<String>();
		for(int i = 0; i < length; i++) {
			if(!tower.contains(text.substring(i, i+1))) {
				if(tower != "a" || "b" || "c" ||)
				tower.push(text.substring(i, i+1));
			} else if(tower.contains(text.substring(i, i+1)))
				tower.pop(text.substring(i, i+1));
		}
		if(tower.empty())
			System.out.println("balance");
		else
			System.out.println("CRASH!!");
	}
}
