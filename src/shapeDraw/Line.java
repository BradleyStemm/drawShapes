package shapeDraw;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape
	{
		String NAME = "LINE";

		public Line(int x1, int y1, int x2, int y2, Color color )
			{
				super();
				this.name = this.NAME;
				setX1(x1);
				setY1(y1);
				setX2(x2);
				setY2(y2);
				setColor(color);
			}
		
		public Line()
			{
				super();
				this.name = this.NAME;
				setX1(0);
				setX2(0);
				setY1(0);
				setY2(0);
				setColor(Color.BLACK);
			}
		
		@Override
		public void draw(Graphics g)
			{	
				g.setColor(getColor());
				g.drawLine(getX1(), getY1(), getX2(), getY2());	
			}

	}
	
