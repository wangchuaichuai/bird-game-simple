package Game;

import java.awt.image.BufferedImage;

/**柱体类
 * @author wx
 *
 */
public class Cylinder {
	BufferedImage background3;
	BufferedImage background4;
	int x1;
	int y1;
	int width1;
	int high1;
	int x2;
	int y2;
	int width2;
	int high2;
	int distance;
	public Cylinder() {
		// TODO Auto-generated constructor stub
		background3 = Tools.getImg("../img/pipe_down.png");
		x1 = 200;
		width1 = (int) (background3.getWidth()/(1.5));
		high1 = (int) (background3.getHeight()/(1.5));
		y1 = -40;
		background4 = Tools.getImg("../img/pipe_up.png");
		x2 = 200;
		width2 = (int) (background4.getWidth()/(1.5));
		high2 = (int) (background4.getHeight()/(2));
		y2 = 230;
		distance = 145;
	}
	public void move(int i) {
		// TODO Auto-generated method stub
		//柱子移动

			if(i ==1) {
				if(x1<=-width1) {
					x1=300;
					x2=300;
				}
				x1--;
				x2--;
			}
			if(i == 2){
				if(x2<=-width1) {
					x1=300+distance;
					x2=300+distance;
				}
				x1--;
				x2--;
			}
			
			
		}
	
	
	
	
	
	
	
}
