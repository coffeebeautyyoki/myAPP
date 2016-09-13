package h_kang.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import h_kang.myapp.other.Fruit;
import h_kang.myapp.other.FruitList;

public class SimpleListView extends AppCompatActivity {
    List<Fruit> fruitList;
    String[] fruits = {"Orange","Apple"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        ListView list = (ListView) findViewById(R.id.lv_simplelist);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(SimpleListView.this,android.R.layout.simple_list_item_1, fruits);
        FruitList fruits = new FruitList();
        fruitList = fruits.getInstance();
        FruitAdapter adapter = new FruitAdapter(SimpleListView.this, R.layout.fruit_item, fruitList);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit f = fruitList.get(i);
                Toast.makeText(SimpleListView.this,f.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
