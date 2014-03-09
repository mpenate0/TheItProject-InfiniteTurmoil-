/* Make sure you comment on your committed changes, listing everything you did in that change.
 * Include file names that you changed and how they affected the functionability of the game
 */

package game;

import static org.lwjgl.opengl.GL11.*;

import java.io.*;

import org.lwjgl.*;
import org.lwjgl.input.Mouse;
import org.lwjgl.openal.AL;
import org.lwjgl.opengl.*;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.Image;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.openal.SoundStore;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

import game.*;
 
public class Game {
	
	//Initialize States
	static enum State {
		INTRO, MAIN_MENU, OPTIONS, GAME;
	}
	
	static State state = State.MAIN_MENU;

	public static void main(String[] args) {
		// Initialize Display and set Properties
		try {
			Display.setDisplayMode(new DisplayMode(1280, 720));
			Display.setTitle("Infinite Turmoil - Prealpha v0.0.1");
			Display.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
		
		//Initialize OpenGL properties
		new OpenGLRenderer().openGL();
		
		//Render
		while(!Display.isCloseRequested()) {
			glClear(GL_COLOR_BUFFER_BIT); // Clears the screen before adding anything
			render();
			
			new Input().Control(); //Initialize Controls
			
			//Sync
			Display.update();
			Display.sync(60);
			
			}
		Display.destroy();
		AL.destroy();
		System.exit(0);
		}
	
	//Gives objects to states
	static void render() {
		switch(state){
		case INTRO:
			
			break;
			
		case MAIN_MENU:
			try {
				Music themeMusic = new Music("music/theme_menu.wav");
				//themeMusic.play(1.0f, 1.0f);   Broken: Keeps on looping at beginning
			} catch (SlickException e1) {
				e1.printStackTrace();
			}
			
			try {
				Image menu = new Image("res/menu.png");
				menu.draw(0, 0);
			} catch (SlickException e) {
				e.printStackTrace();
			}
			
			if (Mouse.isButtonDown(0) && Mouse.getX() > 1035 && 720 - Mouse.getY() < 55) {
				Display.destroy();
				System.exit(0);
			}
			break;
			
		case OPTIONS:
			glColor3f(0.5f,.5f,0.5f);
			glRectf(255,255,120,140);
		    glEnd();
			break;
		}
	}
}