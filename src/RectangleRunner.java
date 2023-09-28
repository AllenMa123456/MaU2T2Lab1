public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150, 200);
        Rectangle rect2 = new Rectangle(125);
        Rectangle rect3 = new Rectangle();

        rect1.setWidth(75);
        rect2.setWidth(75);
        rect2.setLength(75);
        rect3.setWidth(75);

        int rect1Area = rect1.calculateArea();
        int rect2Area = rect2.calculateArea();
        int rect3Area = rect3.calculateArea();
        int seedArea = rect1Area + rect2Area + rect3Area;

        System.out.println("These three plots requires " + seedArea + " square feet of seed.");


    }
}
