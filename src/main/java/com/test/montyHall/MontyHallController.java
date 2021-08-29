package com.test.montyHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MontyHallController {
	
	@Autowired
	private MontyHall montyHall;
	
	@GetMapping(path = "/getMontyHallWins/{timesToPlay}")
	public MontyHallResults getWinningChances(@PathVariable String timesToPlay) {
		return montyHall.getWinningChances(timesToPlay);
	}

}
