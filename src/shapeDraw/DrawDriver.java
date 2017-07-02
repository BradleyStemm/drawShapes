package shapeDraw;

import javax.swing.JFrame;

public class DrawDriver 
	{

		public DrawDriver()
			{
				int SIZE = Integer.parseInt("900");
				DrawPanel panel = new DrawPanel(SIZE);
				JFrame application = new JFrame();
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				application.add(panel);
				application.setSize(SIZE,SIZE);
				application.setVisible(true);
				application.setResizable(false);
				
			}
	
		public String toString()
			{
				return "Draw SimDriver for shape drawing app";
			}
		
		public static void main(String[] args) 
			{
				int SIZE = Integer.parseInt("900");
				DrawPanel panel = new DrawPanel(SIZE);
				JFrame application = new JFrame();
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				application.add(panel);
				application.setSize(SIZE,SIZE);
				application.setVisible(true);
				application.setResizable(false);
				
			}

	}
