package h_kang.myapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button activityLearn = null;
    Button toastLearn =null;
    Button passValue =null;
    Button listView =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActivity",getClass().getName());
        Log.d("MainActivityTaskID","taskid"+getTaskId());
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        activityLearn = (Button) findViewById(R.id.btn_Activity);
        toastLearn =(Button) findViewById(R.id.btn_Toast);
        passValue =(Button)findViewById(R.id.btn_passvalue);
        listView =(Button)findViewById(R.id.btn_simpleList);
        toastLearn.setOnClickListener(this);
        activityLearn.setOnClickListener(this);
        passValue.setOnClickListener(this);
        listView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_Toast:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("tel:10086"));
                startActivity(i);
                Toast.makeText(MainActivity.this,"you clicked me",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_Activity:
                //Intent i = new Intent(MainActivity.this,ActivityLearn.class);
                //Intent i = new Intent("h_kang.myapp.ACTION_START");
                //Intent i = new Intent(Intent.ACTION_VIEW);
                //i.setData(Uri.parse("http://www.baidu.com"));
                //startActivity(i);
                Intent s = new Intent(MainActivity.this,ActivityLearn.class);
                startActivityForResult(s,1);
                break;
            case R.id.btn_passvalue:
                ActivityLearn.actionStart(MainActivity.this,"from mainactivity");
                break;
            case R.id.btn_simpleList:
                Intent x = new Intent(MainActivity.this, SimpleListView.class);
                startActivity(x);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode)
        {
            case 1:
                if(resultCode == RESULT_OK)
                {
                    String result = data.getStringExtra("back");
                    Log.d("result:",result);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menu_add:
                Toast.makeText(MainActivity.this, "addMenu is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_update:
                Toast.makeText(MainActivity.this, "updateMenu is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_finish:
                finish();
                break;
        }
        return true;
    }
}
