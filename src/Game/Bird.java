package Game;

import java.awt.image.BufferedImage;
public class Bird {
	BufferedImage img;
	int x;
	int y;
	int width;
	int high;
	double v0;//初速度
	double t;//往上得时间
	double s;//网上得距离
	double g;//重力
	public Bird() {
		img = Tools.getImg("../img/bird0_0.png");
		width = img.getHeight();
		high = img.getWidth();
		x = 100;
		y = 200;
		v0 = 3;
		t = 0.1;
		s = 0;
		g = 5;
	}
	public void move() {
		s = v0*t;
		y = (int) (y-s);
		double v2 = v0-g*t;
		v0 = v2;
	}
	public void upmove() {
		v0 = 15;
	}
	
	public boolean hit() {
		if(y<=0) {
			return true;
		}
		return false;
	}
	
	
}
