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
		int SIZE;
		Color backgroundColor = null;
		
		public DrawPanel(int defaultSize)
			{
				this.SIZE = defaultSize;
				backgroundColor = new Color( randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));
				shapes = generateShapeArray();
				setBackground(backgroundColor);
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
		
		public Shape[] generateShapeArray()
			{
				Shape[] shapeSet = new Shape[ 15 + randomNumbers.nextInt(this.SIZE/60)];
				for ( int count = 0; count < shapeSet.length; count++)
					{	  
						shapeSet[count] = generateRandomShape(generateThemedColor());  
					}
				return shapeSet;
			}
		
		public Color generateThemedColor()
			{
				Color randomColor = new Color( randomNumbers.nextInt(256),randomNumbers.nextInt(256),randomNumbers.nextInt(256));
				Color shapeColor = new Color((randomColor.getRed()*13+this.backgroundColor.getRed())/17,
										(randomColor.getGreen()*13+this.backgroundColor.getGreen())/17,
										(randomColor.getBlue()*13+this.backgroundColor.getBlue())/17);
				return shapeColor;
			}
		
		public Shape generateRandomShape(Color themeColor)
			{
				int x1 = randomNumbers.nextInt(SIZE);
				int y1 = randomNumbers.nextInt(SIZE);
				int x2 = randomNumbers.nextInt(SIZE);
				int y2 = randomNumbers.nextInt(SIZE);
				Shape tempShape = null;
				String names[] = {"RECT","OVAL","LINE"};
				randomShapeStructure:
					{
						switch (names[randomNumbers.nextInt(5)%3])
							{
								case "RECT":
									{
										tempShape = new Rectangle(x1, y1,x2,y2,themeColor,randomNumbers.nextBoolean() || randomNumbers.nextBoolean());
										break randomShapeStructure;
									}
						
								case "OVAL":
									{
										tempShape = new Oval(x1, y1,x2,y2,themeColor, randomNumbers.nextBoolean() || randomNumbers.nextBoolean());
										break randomShapeStructure;
									}
								
								case "LINE":
									{
										tempShape=  new Line(x1,y1,x2,y2,themeColor);
										break randomShapeStructure;
									}
							}
					}
				
				return tempShape;
			}
	
	}
