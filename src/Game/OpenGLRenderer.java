package Game;

import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.*;
import org.lwjgl.*;
 
public class OpenGLRenderer {
	public static void main(String[] args) {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1 - Codename X");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		// Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		
		
		
		// Checks for Close
		while(!Display.isCloseRequested()) {
			//Render
			//Derpy Line
			glBegin(GL_LINES);
				glVertex2i(100, 100);
				glVertex2i(200, 200);
			glEnd();
			
			
			Display.update();
			Display.sync(60);
		}
		
		Display.destroy();
	}
}