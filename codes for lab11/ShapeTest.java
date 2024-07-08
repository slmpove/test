import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
		/*List<Circle> circleList = new ArrayList<Circle>();
		Shape.setScreenSize(14);
		StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
		for (int i = 1; i < Shape.getScreenSize(); i += 2) {
			circleList.add(new Circle(i, 0, -Shape.getScreenSize()));
		}
		Collections.sort(circleList);
		for (int i = 0; i < circleList.size(); i++) {
			circleList.get(i).customizedColor(ColorScheme.RAINBOW, i);
		}*/
        Shape.setScreenSize(9);
        StdDraw.setScale(-Shape.getScreenSize(), Shape.getScreenSize());
        List<Rectangle> rectanglList = new ArrayList<Rectangle>();
        for (int i = -5; i < 5; i++) {
            rectanglList.add(new Rectangle(i, 2 * i, Math.abs(i), 2 * Math.abs(i)));
        }
        Collections.sort(rectanglList);
        for (int i = 0; i < rectanglList.size(); i++) {
            rectanglList.get(i).customizedColor(ColorScheme.GRAY, i);
            System.out.println(rectanglList.get(i));
        }
    }
}