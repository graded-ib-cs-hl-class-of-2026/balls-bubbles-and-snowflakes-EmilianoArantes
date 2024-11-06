
class Bubble {
    /**
    * Instance variables listed below, used to store the state of the objects in a class  
    */
    private float radius;
    private Sketch s;
    private float y;
    private float x;
    private int borderColor;
    private int fillColor;
    private float xSpeed;
    private float ySpeed;
 
    /** 
    * Constructors shown below, used to initialize new objects of a class
    */
    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = 1;
        fillColor = s.color(0, 0, 0);
        borderColor = s.color(255, 255, 255);
    }

    /** 
    * More constructors shown below
    */
    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    /** 
    * Used to help set the color of the bubbles in sketch
    */ 
    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }
    /** 
    * Used to make the bubbles be visible
    */ 
    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }
    /** 
    * Used to make the bubbles move around the screen and ensures the ball is draw at a different place than before
    */
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
