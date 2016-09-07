package h_kang.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import other.Fruit;
import other.ViewHolder;

/**
 * Created by h_kang on 2016/9/6.
 */
public class FruitAdapter extends ArrayAdapter<Fruit>
{
    View view;
    ViewHolder viewHolder;
    private int resourceID;
    public FruitAdapter(Context context, int resource, List<Fruit> fruits)
    {
        super(context,resource,fruits);
        resourceID =resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit= getItem(position);
        if(convertView!=null) {view = convertView;viewHolder =(ViewHolder)view.getTag();}
        else {
            view = LayoutInflater.from(getContext()).inflate(resourceID, null);
            viewHolder = new ViewHolder();
            viewHolder.image =(ImageView) view.findViewById(R.id.iv_fruitimage);
            viewHolder.text= (TextView) view.findViewById(R.id.tv_fruitname);
            view.setTag(viewHolder);
        }
        viewHolder.image.setImageResource(fruit.getResourceId());
        viewHolder.text.setText(fruit.getName());
        return view;
    }
}
