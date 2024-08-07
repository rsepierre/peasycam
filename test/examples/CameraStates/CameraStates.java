package examples.CameraStates;

import newpeasy.*;
import processing.core.PApplet;

public class CameraStates extends PApplet {

	//
	// '1' save current camera-state
	// '2' apply saved camera-state
	//

	PeasyCam cam;

	public void settings() {
		size(800, 600, P3D);
	}

	public void setup() {
		cam = new PeasyCam(this, 400);
		state = cam.getState();
	}

	public void draw() {
		rotateX(-.5f);
		rotateY(-.5f);
		lights();
		scale(10);
		strokeWeight(1 / 10f);
		background(0);
		fill(220, 255, 0);
		box(30);
		pushMatrix();
		translate(0, 0, 20);
		fill(0, 96, 255);
		box(5);
		popMatrix();
	}

	CameraState state;

	public void keyReleased() {
		if (key == '1')
			state = cam.getState();
		if (key == '2')
			cam.setState(state, 1000);
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { CameraStates.class.getName() });
	}

}