

class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
    private Sketch s;
    private float radius;
    private float x;
    private float y;
    private float ySpeed;
    private float xSpeed;
    
    

    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.ySpeed = yspeed; 
        this.xSpeed = xspeed;
    }

    public void draw() {
        s.line(x+radius,y,x-radius,y);
        s.line(x,y+radius,x,y-radius);
        s.line(x+radius * .707f,y+radius * .707f,x-radius * .707f,y-radius * .707f);
        s.line(x+radius * .707f,y-radius * .707f,x-radius * .707f,y+radius * .707f);
    }

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

