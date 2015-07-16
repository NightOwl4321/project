package project;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static void main(String[] args) {
		Algorithms al = new Algorithms();
	}

	public static Object findBrokenEgg(List<String> eggs) {
		int crackedNum = 0;
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				crackedNum = i;
				return crackedNum;
			}
		}
		return crackedNum;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int oysterNum = 0;
		for(int i = 0; i < oysters.size(); i++) {
			
			if(oysters.get(i)) {
				oysterNum++;
			}
		}
		return oysterNum;
	}

	public static Object findTallest(List<Double> peeps) {
		Double biggestPeep = 0.0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > biggestPeep) {
				biggestPeep = peeps.get(i);
			}
		}
		return biggestPeep;
	}

	public static Object findLongestWord(List<String> words) {
		int mostLetters = 0;
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > mostLetters) {
				mostLetters = words.get(i).length();
			}
		}
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() == mostLetters) {
				return words.get(i);
			}
		}
		return null;
	}

	public static Object containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

}
