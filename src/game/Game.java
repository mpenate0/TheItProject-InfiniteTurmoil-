/*
 * Everyone has to let me know if you committed any changes to the GitHub Repository.
 * This is to ensure that we don't overwrite other changes.
 */

package game;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
 
public class Game {
	public static void main(String[] args) {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1 - Doge Update");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		//Initialize OpenGL properties
		new OpenGLRenderer().openGL();
		
		//Render
		while(!Display.isCloseRequested()) {
			glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); // Clears the screen before adding anything
			
			new OpenGLRenderer().Shape();
			new Texture().Image();
			new Input().Control();
			
			//Sync
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
	}
}