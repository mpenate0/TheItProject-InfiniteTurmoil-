package game;

import java.io.IOException;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Texture {
	static int Vector1X = 100;
	static int Vector1Y = 100;
	
	public void Image() throws SlickException, IOException {
		org.newdawn.slick.opengl.Texture texture;
		texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream("res/muchcode.png"));
		Image myImage = new Image("res/muchcode.png");
		myImage.draw(Vector1X,Vector1Y);
	}
}