package game;

import org.lwjgl.input.Mouse;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import game.OpenGLRenderer;

public class Input {
	public void Control() {
		// Key Escape - Exit Game
		if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
		Display.destroy();
		System.exit(0);
		}
		
		// Mouse Input
		System.out.println(Mouse.getX() + ", " + (720 - Mouse.getY()));
	    
		// Key W - Up
		if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
		}
		// Key A - Left
		if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
		}
		// Key S - Down
		if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
		}
		// Key D - Right
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
		}
		
	}
}