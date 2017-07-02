package shapeDraw;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape 
	{
		protected int x1,x2,y1,y2;
		protected Color color;
		String name= "SHAPE";
		public abstract void draw (Graphics g);
		
		protected void setColor(Color color)
			{
				this.color = color;
			}
	
		protected void setX1(int x1)
			{
				if (x1 >= 0)
					this.x1 = x1;	
				else
					this.x1 = 0;
			}
	
		protected void setX2(int x2)
			{
				if (x2 >= 0)
					this.x2 = x2;
				else
					this.x2 = 0;
			}
	
		protected void setY1(int y1)
			{
				if (y1 >= 0)
					this.y1 = y1;
				else
					this.y1 = 0;
			}
	
		protected void setY2(int y2)
			{
				if (y2 >= 0)
					this.y2 = y2;
				else
					this.y2 = 0;
			}
		
		public int getX1()
			{
				return this.x1;
			}

		public int getX2()
			{
				return this.x2;
			}

		public int getY1()
			{
				return this.y1;
			}

		public int getY2()
			{
				return this.y2;
			}
		
		public Color getColor()
			{
				return this.color;
			}
		public void printDetails()
			{
				System.out.printf("Type: %s -- X1: %d, X2: %d, Y1: %d, Y2: %d\n", name, x1,x2,y1,y2);
			}
		
	}
