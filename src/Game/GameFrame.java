package Game;

import javax.swing.JFrame;

/**������
 * @author wx
 *
 */
public class GameFrame extends JFrame{
	public GameFrame() {
		setSize(300, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bird's Game");
	}

		public static void main(String[] args) {
			GameFrame frame = new GameFrame();
			GamePanel panel = new GamePanel();
			
			frame.add(panel);
			//�ȹ�������ʾ
//			panel.start();
			frame.setVisible(true);
		}
}
