package h_kang.myapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityLearn extends AppCompatActivity {

    Button passValueBack = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        //Intent i = getIntent();
        //String data = i.getStringExtra("passstring");
        //Log.d("result",data);

        passValueBack =(Button) findViewById(R.id.btn_passvalueback);
        passValueBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("back","from second activity");
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent();
        i.putExtra("back","from second activity");
        setResult(RESULT_OK,i);
        finish();
    }

    public static void actionStart(Context context, String data1)
    {
        Intent passvalue = new Intent(context,ActivityLearn.class);
        passvalue.putExtra("passstring",data1);
        context.startActivity(passvalue);
    }
}
