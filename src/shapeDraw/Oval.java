package shapeDraw;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape
	{
		private boolean isFilled;
		String NAME = "OVAL";

		public Oval(int x1, int y1, int x2, int y2, Color color, boolean isFilled )
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
		
		public Oval()
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
		
		@Override
		public void draw(Graphics g)
			{
		
				g.setColor(getColor());
				if (getIsFilled())
					{
						g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
					}
				else
					{
						g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
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

	

