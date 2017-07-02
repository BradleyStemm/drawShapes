package shapeDraw;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape
	{
		private boolean isFilled;	
		String NAME = "RECTANGLE";
		public Rectangle()
			{
				super();
				this.name = this.NAME;
				setX1(0);
				setX2(0);
				setY1(0);
				setY2(0);
				setColor(Color.BLACK);
				setIsFilled(false);
			}
	
		public Rectangle(int x1, int y1, int x2, int y2, Color color, boolean isFilled )
			{
				super();
				this.name = this.NAME;
				setX1(x1);
				setY1(y1);
				setX2(x2);
				setY2(y2);
				setColor(color);
				setIsFilled(isFilled);		
			}
		
		@Override
		public void draw(Graphics g)
			{
				g.setColor(getColor());
				if (getIsFilled())
					{
						g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
					}
				else
					{
						g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
					}
				
			}
	
		private void setIsFilled(boolean isFilled)
			{
				this.isFilled = isFilled;
			}
		
		public boolean getIsFilled()
			{
				return this.isFilled;
			}
		
		public int getUpperLeftX()
			{
				return Math.min(getX1(), getY1());		
			}
	
		public int getUpperLeftY()
			{	
				return (Math.min(getY1(), getY2()));
			}
	
		public int getWidth()
			{
				return (Math.abs(getX2() - getX1()));
			}
	
		public int getHeight()
			{	
				return (Math.abs(getY2() - getY1()));
			}
		
	}
		
	
