package game;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
 
public class Game {
	public static void main(String[] args) {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
		
		// Checks for Close
		}
		while(!Display.isCloseRequested()) {
			Display.update();
			Display.sync(60);
			
			
		// Checks for Close
		}
		Display.destroy();
		System.exit(0);
	}
}