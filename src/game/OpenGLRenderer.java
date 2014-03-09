package game;

import static org.lwjgl.opengl.GL11.*;
import java.io.*;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.TextureLoader;

public class OpenGLRenderer {
	public void openGL() {
		// Initialize OpenGL
		glMatrixMode(GL11.GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, 1280, 720, 0, 1, -1);
		glMatrixMode(GL11.GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
	}
}