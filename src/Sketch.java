import processing.core.PApplet;

public class Sketch extends PApplet {

    /** 
     * The referance and help store all the ball, bubble, and snowflake instance variables
     */
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;

    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;

    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. 
     * Helps determine all specific attributes of each instance variable, determening thier specific behaviour.
     */
    public void setup() {

        ball1 = new Ball(this);

        ball2 = new Ball(this, 30, 225, 255, 5, 3);
        ball2.setColors(color(255, 255, 0), color(0, 0, 0));

        ball3 = new Ball(this, 50, 300, 300, 7, 4);
        ball3.setColors(color(0, 255, 0), color(0, 0, 0));

        ball4 = new Ball(this, 10, 150, 150, 3, 2);
        ball4.setColors(color(255, 0, 255), color(0, 0, 0));

        bubble1 = new Bubble(this, 50, 200, 250, 1, 5);
        bubble1.setColors(color(255, 100), 0);

        bubble2 = new Bubble(this, 10, 20, 25, -2, 7);
        bubble2.setColors(color(255, 100), 0);

        bubble3 = new Bubble(this, 25, 100, 150, -3, 4);
        bubble3.setColors(color(255, 100), 0);

        bubble4 = new Bubble(this, 35, 10, 20, 3, 3);
        bubble4.setColors(color(255, 100), 0);

        snowflake1 = new Snowflake(this, 30, 200, 50, -3, 2);

        snowflake2 = new Snowflake(this, 15, 400, 200, -2, 1);

        snowflake3 = new Snowflake(this, 20, 100, 150, 2, 1);

        snowflake4 = new Snowflake(this, 10, 300, 100, 1, 3);

        
      
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(100, 200, 300);

        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.draw();
        ball3.move();
        ball4.draw();
        ball4.move();

        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.draw();
        bubble3.move();
        bubble4.draw();
        bubble4.move();

        snowflake1.draw();
        snowflake1.move();
        snowflake2.draw();
        snowflake2.move();
        snowflake3.draw();
        snowflake3.move();
        snowflake4.draw();
        snowflake4.move();


    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
