package shapeDraw;

import javax.swing.JFrame;

public class DrawDriver 
	{
		static int SIZE = 900;
		
		//DrawDriver is the constructor for the window which uses the static SIZE
		public DrawDriver()
			{
				JFrame application = defaultWindow(SIZE);					
			}

		public String toString()
			{
				return "Draw SimDriver for shape drawing app";
			}
		
		//If the target executable is this file then a DrawDriver will be instantiated
		public static void main(String[] args) 
			{
				DrawDriver application = new DrawDriver();
			}
		
		//Sets up a default window size object and behavior
		public static JFrame defaultWindow(int windowSize)
			{
				JFrame tempFrame = new JFrame(); 
				DrawPanel panel = new DrawPanel(windowSize);						//I am passing in window size so that can be handled dynamically
				tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				tempFrame.add(panel);
				tempFrame.setSize(windowSize, windowSize);
				tempFrame.setResizable(false);
				tempFrame.setVisible(true);
				return tempFrame;
			}

	}
