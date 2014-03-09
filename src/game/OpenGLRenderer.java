package game;

import static org.lwjgl.opengl.GL11.*;
 
public class OpenGLRenderer {
	public void openGL() {
		// Initialize OpenGL
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, 1280, 720, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
	}

	public static int Dot1X = 100;
	public static int Dot1Y = 100;
	
	public void Shapes() {
		//Render
		glBegin(GL_TRIANGLES);
			glVertex2i(Dot1X, Dot1Y);
			glVertex2i(200, 200);
			glVertex2i(150, 300);
			if (Dot1X < 0) {
				Dot1X = 1;
			} if (Dot1Y < 0) {
				Dot1Y = 1;
			}
			
		glEnd();
		
	}
}