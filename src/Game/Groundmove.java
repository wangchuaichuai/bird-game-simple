package Game;

import java.awt.image.BufferedImage;

/**µÿ√Ê¿‡
 * @author wx
 *
 */
public class Groundmove {
	int x;
	int y;
	BufferedImage background2;
	int width;
	int high;
	public Groundmove() {
		// TODO Auto-generated constructor stub
		background2 = Tools.getImg("../img/land.png");
	
	x = 0;
	width = background2.getWidth();
	high = background2.getHeight();
	y = 500-high;
	}
	
	public void move() {
		if(x <= -(width-300)) {
			x = 0;
		}
		x--;
	}
	
	
	
	}
