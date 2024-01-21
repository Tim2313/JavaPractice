package java_practice;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("Creating point!");
    }

    public Point(int xParam, int yParam) {
//        String massagePattern = "Creating point with: xParam %d yParam %d\n";
//        System.out.printf(massagePattern, xParam, yParam);
        x = xParam;
        y = yParam;
    }

    @Override
    public String toString() {
        String massagePattern = "java_practice.Point{x=%d, y=%d}";
        return String.format(massagePattern, x, y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }
}
