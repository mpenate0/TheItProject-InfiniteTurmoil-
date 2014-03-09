package game;

import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.*;
import org.lwjgl.*;
 
public class OpenGLRenderer {
	public void openGL() {
		// Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, 1280, 720, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
	public void Shapes() {
		glClear(GL_COLOR_BUFFER_BIT); // Clears the screen before adding anything
		
		//Render
		glBegin(GL_LINES);
		glVertex2i(100, 100);
		glVertex2i(300, 300);
		glEnd();
	}
}