package com.test.montyHall;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MontyHallTests {
	
	@Test
	public void returnZeroWinsForNegativePlayTimes( ) {
		MontyHall montyHall = new MontyHall();
		MontyHallResults expectedMontyHallResults = new MontyHallResults(0,0);
		
		MontyHallResults actualMontyHallResults = montyHall.getWinningChances("-500");
		
		assertEquals(expectedMontyHallResults, actualMontyHallResults);
	}
	
	@Test
	public void returnZeroWinsForZeroPlayTimes( ) {
		MontyHall montyHall = new MontyHall();
		MontyHallResults expectedMontyHallResults = new MontyHallResults(0,0);
		
		MontyHallResults actualMontyHallResults = montyHall.getWinningChances("00");
		
		assertEquals(expectedMontyHallResults, actualMontyHallResults);
	}
	
	@Test
	public void returnZeroWinsForNullPlayTimes( ) {
		MontyHall montyHall = new MontyHall();
		MontyHallResults expectedMontyHallResults = new MontyHallResults(0,0);
		
		MontyHallResults actualMontyHallResults = montyHall.getWinningChances(null);
		
		assertEquals(expectedMontyHallResults, actualMontyHallResults);
	}
	
}
