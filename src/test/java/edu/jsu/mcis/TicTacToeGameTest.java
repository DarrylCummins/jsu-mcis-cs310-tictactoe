package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeGameTest
{
	@Test
	public void testMakeMarkAtCenter() {
		TicTacToeGame game = new TicTacToeGame();
		String label = game.makeMark(1,1);
		assertEquals("X", label);
	}
	
	@Test
	public void testMakeMarksOverExisting() {
		TicTacToeGame game = new TicTacToeGame();
		String label1 = game.makeMark(1,1);
		assertEquals("X", label1);
		String label2 = game.makeMark(1,1);
		assertEquals("X", label2);
		String label3 = game.makeMark(2,2);
		assertEquals("O", label3);
	}
	
}
