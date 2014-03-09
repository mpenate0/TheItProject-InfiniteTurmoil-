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
		
		// Key W - Up
		if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
			new Texture().Vector1Y--;
		}
		// Key A - Left
		if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
			new Texture().Vector1X--;
		}
		// Key S - Down
		if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
			new Texture().Vector1Y++;
		}
		// Key D - Right
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
			new Texture().Vector1X++;
		}
		
	}
}