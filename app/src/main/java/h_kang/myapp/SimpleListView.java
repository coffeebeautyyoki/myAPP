package h_kang.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListView extends AppCompatActivity {

    String[] fruits = {"Orange","Apple"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        ListView list = (ListView) findViewById(R.id.lv_simplelist);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SimpleListView.this,android.R.layout.simple_list_item_1, fruits);
        list.setAdapter(adapter);
    }
}
