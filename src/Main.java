import java.util.ArrayList;
public class Main{

    public static ArrayList<Object> collectAll(Filter filt, Object[] list)
    {
        ArrayList<Object> acceptedList = new ArrayList<Object>();
        for(int a = 0; a < list.length; a++)
        {
            if(filt.accept(list[a]))
            {
                acceptedList.add(list[a]);
            }
        }
        return acceptedList;
    }
}