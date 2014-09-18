package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest
{
	@Test
	public void testMakeMove()
	{
		TicTacToe t = new TicTacToe();
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
	}
	
	@Test
    public void winDiagonallyAsX()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.makeMove(0, 1);
		assertEquals("O", t.getLocation(0, 1));
		t.makeMove(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(2, 2);
		assertEquals("X", t.getLocation(2, 2));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winDiagonallyAsO()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(0, 1);
		assertEquals("X", t.getLocation(0, 1));
		t.makeMove(1, 2);
		assertEquals("O", t.getLocation(1, 2));
		t.makeMove(2, 2);
		assertEquals("X", t.getLocation(2, 2));
		t.makeMove(1, 1);
		assertEquals("O", t.getLocation(1, 1));
		t.makeMove(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.makeMove(2, 0);
		assertEquals("O", t.getLocation(2, 0));
        assertEquals("O", t.getWinner());
    }
	
	@Test
    public void winLeftColumnAsX()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.makeMove(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.makeMove(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(0, 0);
		assertEquals("X", t.getLocation(0, 0));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winCenterColumnAsO()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.makeMove(1, 1);
		assertEquals("O", t.getLocation(1, 1));
		t.makeMove(1, 1);
		t.makeMove(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.makeMove(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.makeMove(0, 2);
		assertEquals("X", t.getLocation(0, 2));
		t.makeMove(0, 1);
		assertEquals("O", t.getLocation(0, 1));
        assertEquals("O", t.getWinner());
    }

	@Test
    public void winRightColumnAsX()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 2);
		assertEquals("X", t.getLocation(1, 2));
		t.makeMove(2, 0);
		assertEquals("O", t.getLocation(2, 0));
		t.makeMove(2, 2);
		assertEquals("X", t.getLocation(2, 2));
		t.makeMove(0, 1);
		assertEquals("O", t.getLocation(0, 1));
		t.makeMove(0, 2);
		assertEquals("X", t.getLocation(0, 2));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winMiddleRowAsX()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 0);
		assertEquals("X", t.getLocation(1, 0));
		t.makeMove(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(1, 2);
		assertEquals("X", t.getLocation(1, 2));
        assertEquals("X", t.getWinner());
    }
	
	@Test
    public void winBottomRowAsO()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.makeMove(2, 0);
		assertEquals("O", t.getLocation(2, 0));
		t.makeMove(0, 0);
		assertEquals("X", t.getLocation(0, 0));
		t.makeMove(2, 2);
		assertEquals("O", t.getLocation(2, 2));
		t.makeMove(0, 2);
		assertEquals("X", t.getLocation(0, 2));
		t.makeMove(2, 1);
		assertEquals("O", t.getLocation(2, 1));
        assertEquals("O", t.getWinner());
    }

	@Test
    public void winTopRowAsO()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(2, 1);
		assertEquals("X", t.getLocation(2, 1));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.makeMove(2, 2);
		assertEquals("O", t.getLocation(2, 2));
		t.makeMove(1, 2);
		assertEquals("X", t.getLocation(1, 2));
		t.makeMove(0, 0);
		assertEquals("O", t.getLocation(0, 0));
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.makeMove(0, 1);
		assertEquals("O", t.getLocation(0, 1));
        assertEquals("O", t.getWinner());
    }
	
	@Test
    public void testTieGame()
	{
        TicTacToe t = new TicTacToe();
		t.makeMove(1, 1);
		assertEquals("X", t.getLocation(1, 1));
		t.makeMove(0, 0);
		assertEquals("O", t.getLocation(0, 0));
		t.makeMove(2, 0);
		assertEquals("X", t.getLocation(2, 0));
		t.makeMove(0, 2);
		assertEquals("O", t.getLocation(0, 2));
		t.makeMove(0, 1);
		assertEquals("X", t.getLocation(0, 1));
		t.makeMove(2, 1);
		assertEquals("O", t.getLocation(2, 1));
		t.makeMove(1, 2);
		assertEquals("X", t.getLocation(1, 2));
		t.makeMove(1, 0);
		assertEquals("O", t.getLocation(1, 0));
		t.makeMove(2, 2);
		assertEquals("X", t.getLocation(2, 2));
        assertEquals("TIE", t.getWinner());
    }
}
