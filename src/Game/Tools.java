package Game;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



/**π§æﬂ¿‡
 * @author wx
 *
 */
public class Tools {
	public static BufferedImage getImg(String path) {
		BufferedImage background = null;
		try {
			background = ImageIO.read(Tools.class.getResource(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return background;
	}
	
}
