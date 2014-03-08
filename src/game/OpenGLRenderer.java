package game;

import static org.lwjgl.opengl.GL11.*;
 
public class OpenGLRenderer {
	public void openGL() {
		// Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, 640, 480, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}
	
public void Shapes() {
			//Render
			glBegin(GL_LINES);
				glVertex2i(100, 100);
				glVertex2i(200, 200);
			glEnd();
		}
}