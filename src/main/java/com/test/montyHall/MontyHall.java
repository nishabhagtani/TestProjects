package com.test.montyHall;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MontyHall {
	
	private Random random = new Random();
	
	public MontyHallResults getWinningChances(String timesToPlay) {
		
		int changeBoxWins = 0;
		int originalBoxWins = 0;
		
		System.out.println("timesToPlay = "+timesToPlay);
		
		if (timesToPlay != null && !timesToPlay.equals("null")) {
			int playTimes = Integer.parseInt(timesToPlay);
			for (int i=1; i <= playTimes; i++) {
				int moneyBox = random.nextInt(3); //randomly pick money box
				int selectedBox = random.nextInt(3); //randomly pick box by player
				
				//to opens box which doesn't contains money and is not selected box
				int emptyBox = getEmptyBox(moneyBox, selectedBox, random.nextInt(3));
				
				//if you go with selected box
				if (selectedBox == moneyBox) {
					originalBoxWins++;
				}
				
				//if you change box to win 
				int changeBox = 3 - (selectedBox + emptyBox);
				if (changeBox == moneyBox) {
					changeBoxWins++;
				}	
			}	
		}
		System.out.println("ChangeBoxWins =" + changeBoxWins);
		System.out.println("OriginalBoxWins =" + originalBoxWins);
		
		MontyHallResults montyHallResults = new MontyHallResults(changeBoxWins, originalBoxWins);
		return montyHallResults;
	}
	
	private int getEmptyBox(int moneyBox, int selectedBox, int emptyBox) {
		if (moneyBox == emptyBox || selectedBox == emptyBox) {
			return getEmptyBox(moneyBox, selectedBox, random.nextInt(3));
		} 
		return emptyBox;
	}
	

}
