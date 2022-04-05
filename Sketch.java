import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(18, 21, 46);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// White circle for moon
  fill(230, 231, 237);
  ellipse(50, 50, 50, 50);

  // Green rectangle for grass
  fill(85, 130, 60);
  rect(0, 300, 400, 100);

  // Red rectangle for house base
  fill(148, 27, 61);
  rect(100, 200, 150, 150);

  // Grey triangle for roof
  fill(194, 188, 190);
  triangle(175, 100, 250, 200, 100, 200);

  // Blue square for left window
  fill(61, 217, 214);
  rect(120, 220, 40, 40);

  // Blue square for right window
  fill(61, 217, 214);
  rect(190, 220, 40, 40);

  // Brown rectangle for door
  fill(92, 57, 57);
  rect(150, 270, 50, 80);

  // Yellow circle for door handle
  fill(223, 230, 25);
  ellipse(190, 310, 10, 10);

  // Black lines for window frame
  fill(0, 0, 0);
  line(140, 220, 140, 260);

  fill(0, 0, 0);
  line(120, 240, 160, 240);

  fill(0, 0, 0);
  line(210, 220, 210, 260);

  fill(0, 0, 0);
  line(190, 240, 230, 240);
  }
  
  // define other methods down here.
}