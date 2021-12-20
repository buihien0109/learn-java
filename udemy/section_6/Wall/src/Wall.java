public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(0);
        System.out.println("Area = " + wall.getArea());
    }
}
