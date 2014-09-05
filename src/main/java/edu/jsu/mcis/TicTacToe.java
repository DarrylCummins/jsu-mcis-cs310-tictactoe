package edu.jsu.mcis;


public class TicTacToe {
    private boolean xTurn;
	private String winner;
	private String arr[][];
	private static final int ZERO = 0;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	
    public TicTacToe()
	{
		xTurn = true;
		arr = new String[THREE][THREE];
		setArrayToBlanks();
	}
	
	public void setArrayToBlanks()
	{
		for(int i = ZERO; i < THREE; i++)
		{
			for(int j = ZERO; j < THREE; j++)
			{
				arr[i][j] = " ";
			}
		}
	}
	
	public void move (int row, int column)
	{
		if (arr[row][column] == " ")
		{
			if (xTurn == true)
			{
				arr[row][column] = "X";
			}
			else
			{
				arr[row][column] = "O";
			}
			xTurn = !xTurn;
		}
		checkWinner();
		
	}
	
	public void checkWinner()
	{
		if (arr[ZERO][TWO] != " " && arr[ZERO][ZERO].equals(arr[ZERO][ONE]) && arr[ZERO][ONE].equals(arr[ZERO][TWO])) // top row win
		{
			winner = arr[ZERO][TWO];
		}
		else if (arr[ONE][ONE] != " " && arr[ONE][ZERO].equals(arr[ONE][ONE]) && arr[ONE][ONE].equals(arr[ONE][TWO])) // mid row win
		{
			winner = arr[ONE][ONE];
		}
		else if (arr[TWO][ONE] != " " && arr[TWO][ZERO].equals(arr[TWO][ONE]) && arr[TWO][ONE].equals(arr[TWO][TWO])) // bot row win
		{
			winner = arr[TWO][ONE];
		}
		else if (arr[ONE][ZERO] != " " && arr[ZERO][ZERO].equals(arr[ONE][ZERO]) && arr[ONE][ZERO].equals(arr[TWO][ZERO])) // left col win
		{
			winner = arr[ONE][ZERO];
		}
		else if (arr[ZERO][ONE] != " " && arr[ZERO][ONE].equals(arr[ONE][ONE]) && arr[ONE][ONE].equals(arr[TWO][ONE])) // center col win
		{
			winner = arr[ZERO][ONE];
		}
		else if (arr[ONE][TWO] != " " && arr[ZERO][TWO].equals(arr[ONE][TWO]) && arr[ONE][TWO].equals(arr[TWO][TWO])) // right col win
		{
			winner = arr[ONE][TWO];
		}
		else if (arr[ZERO][ZERO] != " " && arr[ZERO][ZERO].equals(arr[ONE][ONE]) && arr[ONE][ONE].equals(arr[TWO][TWO])) // dia "\" win
		{
			winner = arr[ZERO][ZERO];
		}
		else if (arr[TWO][ZERO] != " " && arr[ZERO][TWO].equals(arr[ONE][ONE]) && arr[ONE][ONE].equals(arr[TWO][ZERO])) // dia "/" win
		{
			winner = arr[TWO][ZERO];
		}
		else
		{
			winner = "TIE";
		}
	}
	
	public String getLocation (int row, int column)
	{
		return arr[row][column];
	}
	
	public String getWinner()
	{
		return winner;
	}
	// Haha!!! You can't actually play this game of Tic-Tac-Toe...
	// The computer can, but you cannot.  :p 
}