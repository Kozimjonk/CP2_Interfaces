import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectList= new ArrayList<Rectangle>();
        BigRectFilter BigRectFilter = new BigRectFilter();

        Rectangle bigRect1 = new Rectangle(0,0,15,15); rectList.add(bigRect1);
        Rectangle bigRect2 = new Rectangle(0,0,20,25); rectList.add(bigRect2);
        Rectangle bigRect3 = new Rectangle(0,0,50,30); rectList.add(bigRect3);
        Rectangle bigRect4 = new Rectangle(0,0,5,5); rectList.add(bigRect4);
        Rectangle bigRect5 = new Rectangle(0,0,2,8); rectList.add(bigRect5);

        Rectangle smallRect1 = new Rectangle(0,0,1,1); rectList.add(smallRect1);
        Rectangle smallRect2 = new Rectangle(0,0,4,4); rectList.add(smallRect2);
        Rectangle smallRect3 = new Rectangle(0,0,3,3); rectList.add(smallRect3);
        Rectangle smallRect4 = new Rectangle(0,0,4,5); rectList.add(smallRect4);
        Rectangle smallRect5 = new Rectangle(0,0,1,8); rectList.add(smallRect5);

        System.out.println(Main.collectAll(BigRectFilter, rectList.toArray()));




    }

}