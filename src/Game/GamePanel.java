package Game;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**画板类
 * @author wx
 *
 */
public class GamePanel extends JPanel{
	BufferedImage background;
	Groundmove groundmove;
	Cylinder cylinder1;
	Cylinder cylinder2;
	Bird bird;
	boolean start;
	boolean gameover;
	//Cylinder cylinder2;
	public GamePanel() {
		// TODO Auto-generated constructor stub
		background = Tools.getImg("../img/bg_night.png");
		groundmove = new Groundmove();
		cylinder1 = new Cylinder();
		cylinder2 = new Cylinder();
		bird = new Bird();
		//初始化游戏状态
		start = false;
		gameover = false;
		
		
		//监听器
		MouseAdapter adapter = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				if(start == true) {
					bird.upmove();
				}else {
					
					start = true;
					start();
				}
			}
		};
		this.addMouseListener(adapter);
		
	}
	
	//开始游戏
	public void start() {
		MyThread mt = new MyThread();
		Thread s = new Thread(mt);
		s.start();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(background,0,0,null);
		g.drawImage(cylinder1.background3,cylinder1.x1,cylinder1.y1,cylinder1.width1,cylinder1.high1,null);
		g.drawImage(cylinder1.background4,cylinder1.x2,cylinder1.y2,cylinder1.width2,cylinder1.high2,null);
		
		g.drawImage(cylinder2.background3,cylinder2.x1,cylinder2.y1,cylinder2.width1,cylinder2.high1,null);
		g.drawImage(cylinder2.background4,cylinder2.x2,cylinder2.y2,cylinder2.width2,cylinder2.high2,null);
		
		g.drawImage(bird.img,bird.x,bird.y,null);
		
		g.drawImage(groundmove.background2,groundmove.x,groundmove.y,null);
	}
	
	//分线程
	class MyThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				groundmove.move();
				cylinder1.move(1);
				cylinder2.move(2);
				bird.move();
				boolean bool = bird.hit();
				if(bool == true) {
					gameover = true;
					return;
				}
				try {
					Thread.sleep(10);
					repaint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
