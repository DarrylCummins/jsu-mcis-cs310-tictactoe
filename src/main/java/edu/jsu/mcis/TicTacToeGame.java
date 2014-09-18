package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGame extends JPanel implements MouseListener
{
	private TicTacToe ttt;
	private static final int THREE = 3;
	private JPanel myPanel, gameGrid;
	private JLabel[][] myLabels;
	
	public TicTacToeGame()
	{
		ttt = new TicTacToe();
		makeGrid();
		
	}
	
	public void makeGrid()
	{
		gameGrid = this;
		myPanel = new JPanel();
		myPanel.setLayout(new GridLayout(THREE, THREE));
		myLabels = new JLabel[THREE][THREE];
		int panelSize = 40;
		for(int i = 0; i < THREE; i++)
		{
			for(int j = 0; j < THREE; j++)
			{
				myLabels[i][j] = new JLabel(" ? ");
				myLabels[i][j].setName("Location" + i + j);
				myLabels[i][j].setPreferredSize(new Dimension(panelSize, panelSize));
				myLabels[i][j].addMouseListener(this);
				myPanel.add(myLabels[i][j]);
			}
		}
		gameGrid.add(myPanel);
	}

	public void mouseClicked(MouseEvent m)
	{}
	public void mousePressed(MouseEvent m)
	{}
	public void mouseReleased(MouseEvent m)
	{
		if(m.getModifiers() == InputEvent.BUTTON1_MASK)
		{
			for(int i = 0; i < THREE; i++)
			{
				for(int j = 0; j < THREE; j++)
				{
					if(m.getSource() == myLabels[i][j])
					{
						String mark = makeMark(i, j);
						myLabels[i][j].setText(mark);
					}
				}
			}
			if(ttt.getWinner() != "NONE")
			{
				displayResult();
			}
		}
	}
	public void mouseEntered(MouseEvent m)
	{}
	public void mouseExited(MouseEvent m)
	{}
	
	public String makeMark(int row, int col)
	{
		ttt.makeMove(row, col);
		return ttt.getLocation(row, col);
	}
	
	public void displayResult()
	{
		(new Thread(new Runnable(){
		public void run(){JOptionPane 	myPane = new JOptionPane();
										myPane.showMessageDialog(null, 
										"The winner is " + ttt.getWinner(),"Game Over", 0);
										}	}	)	).start();
	}
	
	public static void main(String[] args)
	{
		TicTacToeGame myGame = new TicTacToeGame();
		JFrame myJFrame = new JFrame("Tic Tac Toe");
		myJFrame.add(myGame);
		myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myJFrame.pack();
		myJFrame.setLocationRelativeTo(null);
		myJFrame.setVisible(true);
	}
}