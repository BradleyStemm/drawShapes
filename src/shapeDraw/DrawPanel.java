package shapeDraw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
	{
		private static final long serialVersionUID = -5832368116397234021L;
		private Random randomNumbers = new Random();
		private Shape[] shapes;
		int SIZE = 1200;
		Color color = Color.WHITE;
		public DrawPanel(int SIZE)
			{
				this.SIZE = SIZE;
				
				//setBackground(Color.WHITE);// read line 57 below and try 
				shapes = new Shape[ 15 + randomNumbers.nextInt(10)];
				
				for ( int count = 0; count < shapes.length; count++)
					{
						int x1 = randomNumbers.nextInt(SIZE);
						int y1 = randomNumbers.nextInt(SIZE);
						int x2 = randomNumbers.nextInt(SIZE);
						int y2 = randomNumbers.nextInt(SIZE);
						
						Color color = new Color( randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));

						String names[] = {"RECT","OVAL","LINE"};
						randomShapeStructure:
							{
								switch (names[randomNumbers.nextInt(3)])
									{
										case "RECT":
											{
												shapes[count] = new Rectangle(x1, y1,x2,y2,color,randomNumbers.nextBoolean());
												break randomShapeStructure;
											}
									
										case "OVAL":
											{
												shapes[count] = new Oval(x1, y1,x2,y2,color, randomNumbers.nextBoolean());
												break randomShapeStructure;
											}
											
										case "LINE":
											{
												shapes[count] =  new Line(x1,y1,x2,y2,color);
												break randomShapeStructure;
											}
											
									}
								
							}
						//Try uncommenting these and comment out the background set on line 27 to see some additional functionality
						  
						  
						 	color = new Color((color.getRed()+this.color.getRed())/3,
									(color.getGreen()+this.color.getGreen())/3,
									(color.getBlue()+this.color.getBlue())/3);
							this.color = color;
					}
				
				setBackground(this.color);
			}
		
		public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				for(Shape shape : shapes)
						{
							shape.draw(g);
							shape.printDetails();
							
						}
				
			}
	
	}
