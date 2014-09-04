package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest
{
    
	@Test
    public void winDiagonallyAsX()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.move(0, 1);
		assertEquals("O", t.getLocation(0, 1));
		t.move(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.move(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.move(2, 2);
		assertEquals("X", t.getLocation(2, 2));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winDiagonallyAsO()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.move(1, 1);
		assertEquals("O", t.getLocation(1, 1));
		t.move(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.move(2, 0);
		assertEquals("O", t.getLocation(2, 0));
		t.move(0, 1);
		assertEquals("X", t.getLocation(0, 1));
		t.move(0, 2);
		assertEquals("O", t.getLocation(0, 2));
        assertEquals("O", t.getWinner());
    }
	
	@Test
    public void winVerticallyAsX()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.move(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.move(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.move(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.move(0, 0);
		assertEquals("X", t.getLocation(0, 0));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winVerticallyAsO()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.move(1, 1);
		assertEquals("O", t.getLocation(1, 1));
		t.move(1, 1);
		t.move(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.move(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.move(0, 2);
		assertEquals("X", t.getLocation(0, 2));
		t.move(0, 1);
		assertEquals("O", t.getLocation(0, 1));
        assertEquals("O", t.getWinner());
    }
	
	@Test
    public void winHorizontallyAsX()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.move(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.move(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.move(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.move(1, 2);
		assertEquals("X", t.getLocation(1, 2));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winHorizontallyAsO()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.move(2, 0);
		assertEquals("O", t.getLocation(2, 0));
		t.move(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.move(2, 2);
		assertEquals("O", t.getLocation(2, 2));
		t.move(0, 2);
		assertEquals("X", t.getLocation(0, 2));
		t.move(2, 1);
		assertEquals("O", t.getLocation(2, 1));
        assertEquals("O", t.getWinner());
    }

	@Test
    public void testTieGame()
	{
        TicTacToe t = new TicTacToe();
		t.move(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.move(0, 0);
		assertEquals("O", t.getLocation(0, 0));
		t.move(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.move(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.move(0, 1);
		assertEquals("X", t.getLocation(0, 1));
		t.move(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.move(1, 2);
		assertEquals("X", t.getLocation(1, 2));
		t.move(1, 0);
		assertEquals("O", t.getLocation(1, 0));
		t.move(2, 2);
		assertEquals("X", t.getLocation(2, 2));
        assertEquals("TIE", t.getWinner());
    }
}
