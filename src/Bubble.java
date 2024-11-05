/** THE ENTIRE CLASS IS INSIDE A COMMENT RIGHT NOW. TO ENABLE THE CLASS, DELETE THIS LINE AND THE LAST ONE. */

class Bubble {

    //MISSING MANY INSTANCE VARIABLES

    //MISSING CONSTRUCTORS
    private float radius;
    private Sketch s;
    private float y;
    private float x;
    private int borderColor;
    private int fillColor;
    private float xSpeed;
    private float ySpeed;


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


    // accessors for the radius, diameter, x, and y values 
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
    public void setColors(int fill, int border) {
        borderColor = border;
        fillColor = fill;
    }


    public void draw() {
        s.stroke(borderColor);
        s.fill(fillColor);
        s.circle(x, y, radius*2);
    }

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
