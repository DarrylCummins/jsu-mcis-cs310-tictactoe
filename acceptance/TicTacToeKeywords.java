import edu.jsu.mcis.*;

public class TicTacToeKeywords {
    private TicTacToe ticTacToe;
    
	public void startNewGame()
	{
		ticTacToe = new TicTacToe();
	}
	
	public void markLocation(int row, int column)
	{
		ticTacToe.move(row, column);
    }
    
    public String getLocation(int row, int col)
	{
		return ticTacToe.getLocation(row, col);
    }
	
	public String getWinner()
	{
		return ticTacToe.getWinner();
	}
}