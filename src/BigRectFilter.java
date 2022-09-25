import java.awt.Rectangle;

public class BigRectFilter implements Filter{

    public BigRectFilter() {
    }
    @Override
    public boolean accept(Object x)
    {
        Rectangle rect = (Rectangle) x;
        double perimeter= rect.height + rect.width;

        if(perimeter >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}