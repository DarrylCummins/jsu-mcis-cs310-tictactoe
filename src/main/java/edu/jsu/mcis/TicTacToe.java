package edu.jsu.mcis;


public class TicTacToe {
    boolean xTurn;
	String winner;
	String arr[][];
	
    public TicTacToe()
	{
		xTurn = true;
		arr = new String[3][3];
		setArrayToBlanks();
	}
	
	public void setArrayToBlanks()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
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
		if (arr[0][2] != " " && arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2])) // top row win
		{
			winner = arr[0][2];
		}
		else if (arr[1][1] != " " && arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2])) // mid row win
		{
			winner = arr[1][1];
		}
		else if (arr[2][1] != " " && arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2])) // bot row win
		{
			winner = arr[2][1];
		}
		else if (arr[1][0] != " " && arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0])) // left col win
		{
			winner = arr[1][0];
		}
		else if (arr[0][1] != " " && arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1])) // center col win
		{
			winner = arr[0][1];
		}
		else if (arr[1][2] != " " && arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2])) // right col win
		{
			winner = arr[1][2];
		}
		else if (arr[0][0] != " " && arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])) // dia "\" win
		{
			winner = arr[0][0];
		}
		else if (arr[2][0] != " " && arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])) // dia "/" win
		{
			winner = arr[2][0];
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


// eparham@jsu.edu



