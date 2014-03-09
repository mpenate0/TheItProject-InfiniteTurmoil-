/* Make sure you comment on your committed changes, listing everything you did in that change.
 * Include file names that you changed and how they affected the functionability of the game
 */

package game;

import static org.lwjgl.opengl.GL11.*;
import java.io.*;
import org.lwjgl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import game.*;
 
public class Game {
	//Declarations
	static Texture background;
	
	//Initialize States
	static enum State {
		INTRO, MAIN_MENU, OPTIONS, GAME;
	}
	
	static State state = State.INTRO;
	
	public static void main(String[] args) {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		//Load the actual textures
		background = loadTexture("logo");
		
		//Initialize OpenGL properties
		new OpenGLRenderer().openGL();
		
		//Render
		while(!Display.isCloseRequested()) {
			glClear(GL_COLOR_BUFFER_BIT); // Clears the screen before adding anything
			
			render();
			new Input().Control(); //Initialize Controls
			
			//Sync
			Display.update();
			Display.sync(30);
			}
		Display.destroy();
		}
	
	//Initialize Textures
	static Texture loadTexture(String key) {
		try {
			return TextureLoader.getTexture("PNG", new FileInputStream(new File("res/" + key + ".png"))); //Allows textures to be loader by just typing in the name
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Gives objects to states
	static void render() {
		switch(state){
		case INTRO:
			glColor3f(1.0f,1.0f,0.5f);
			glRectf(0,0,420,240);
			break;
			
		case MAIN_MENU:
			glColor3f(0.5f,.5f,0.5f);
			glRectf(0,0,420,240);
			background.bind();
			glBegin(GL_QUADS);
				glTexCoord2f(0, 0);
		    	glVertex2f(0,0);
				glTexCoord2f(1, 0);
		    	glVertex2f(1280+770,0);
				glTexCoord2f(1, 1);
		    	glVertex2f(1280+770,770+770);
				glTexCoord2f(0, 1);
		    	glVertex2f(0,770+770);
		    glEnd();
			break;
			
		case OPTIONS:
			glColor3f(0.5f,.5f,0.5f);
			glRectf(255,255,120,140);
		    glEnd();
			break;
			
		case GAME:
			glColor3f(1.0f,1.0f,1.5f);
			glRectf(0,0,420,240);
			break;
			}
		}
}