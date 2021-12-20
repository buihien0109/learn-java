public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y){
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point otherPoint){
        return Math.sqrt((x - otherPoint.x) * (x - otherPoint.x) + (y - otherPoint.y) * (y - otherPoint.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("Distance 1 = " + first.distance(second));
        System.out.println("Distance 2 = " + first.distance(3,1));
        System.out.println("Distance 3 = " + first.distance());
    }
}
