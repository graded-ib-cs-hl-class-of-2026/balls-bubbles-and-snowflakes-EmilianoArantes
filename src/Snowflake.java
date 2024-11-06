

class Snowflake {
    /**
    * Instance variables listed below, used to store the state of the objects in a class  
    */
    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float ySpeed;
    private float xSpeed;
    
    
    /** 
    * Constructors shown below, used to initialize new objects of a class
    */
    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.ySpeed = yspeed; 
        this.xSpeed = xspeed;
    }

    /** 
    * Draw method show below helps the snowflakes be visible and you can tell it provides the shape for our snowflakes
    */
    public void draw() {
        s.line(x+radius,y,x-radius,y);
        s.line(x,y+radius,x,y-radius);
        s.line(x+radius * .707f,y+radius * .707f,x-radius * .707f,y-radius * .707f);
        s.line(x+radius * .707f,y-radius * .707f,x-radius * .707f,y+radius * .707f);
    }

    /** 
    * Move method helps the snowflakes move the way they do on the screen and ensures the ball is draw at a different place than before
    */
       public void move() {
        y += ySpeed;
        x += xSpeed;
        if (y > s.height + radius) {
            y = -radius;
        } 
     if (x < -radius) {
        x = s.width + radius;
        } else if (x > s.width + radius) {
            x = -radius;
        }
    }
}

