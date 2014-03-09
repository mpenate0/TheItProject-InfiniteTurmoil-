package game;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.SlickException;
 
public class Game {
	public static void main(String[] args) throws SlickException, IOException {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1 - Doge Update");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		new OpenGLRenderer().openGL();
		
		while(!Display.isCloseRequested()) {
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // Clears the screen before adding anything
			//This is the game update cycle
			new OpenGLRenderer().Shape();
			new Texture().Image();
			new Input().Control();
			
			
			
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
		System.exit(0);
	}
}