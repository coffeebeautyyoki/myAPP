package other;

/**
 * Created by h_kang on 2016/9/6.
 */
public class Fruit {
    private String name;
    private int resourceId;
    public Fruit(String Name, int ResourceID)
    {
        name=Name;
        resourceId =ResourceID;
    }
    public String getName()
    {
        return name;
    }

    public int getResourceId() {
        return resourceId;
    }
}
