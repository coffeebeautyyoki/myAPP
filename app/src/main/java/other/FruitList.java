package other;

import java.util.ArrayList;
import java.util.List;

import h_kang.myapp.R;

/**
 * Created by h_kang on 2016/9/6.
 */
public class FruitList extends ArrayList<Fruit> {
    private List<Fruit> fruits = new ArrayList<Fruit>();

    public List<Fruit> getInstance()
    {
        if(fruits==null ||fruits.size()==0) InitFruits();
        return fruits;
    }

    public void InitFruits()
    {
        Fruit  orange = new Fruit("Orange", R.drawable.orange);
        Fruit apple= new Fruit("Apple",R.drawable.apple);
        fruits.add(orange);
        fruits.add(apple);
    }
}
