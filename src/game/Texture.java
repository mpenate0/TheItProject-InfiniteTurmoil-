package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Texture {
	public void Image() {
		try {
			Image testimg = new Image("res/logo.png");
			testimg.draw(0, 0);
		} catch (SlickException e) {
			e.printStackTrace();
		}	
	}
}