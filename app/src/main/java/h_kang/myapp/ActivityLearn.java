package h_kang.myapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ActivityLearn extends AppCompatActivity implements View.OnClickListener {

    Button passValueBack = null;
    Button progressButton =null;
   public   ProgressBar progress =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        //Intent i = getIntent();
        //String data = i.getStringExtra("passstring");
        //Log.d("result",data);

        passValueBack =(Button) findViewById(R.id.btn_passvalueback);
        progressButton=(Button)findViewById(R.id.btn_progress);
        progress =(ProgressBar)findViewById(R.id.pb_progress);
        progressButton.setOnClickListener(this);

        passValueBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_passvalueback:
                Intent i = new Intent();
                i.putExtra("back","from second activity");
                setResult(RESULT_OK,i);
                finish();
                break;
            case R.id.btn_progress:
                //if(progress.getVisibility()==View.VISIBLE)
                   // progress.setVisibility(View.GONE);
                //else
                    //progress.setVisibility(View.VISIBLE);
                int p = progress.getProgress();
                if(p<100) {
                    p += 10;
                    progress.setProgress(p);
                    ProgressDialog dialog = new ProgressDialog(ActivityLearn.this);
                    dialog.setTitle("Progress进展");
                    dialog.setMessage("Progress:"+p);
                    dialog.setCancelable(true);
                    dialog.show();
                }
                else
                {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(ActivityLearn.this);
                    dialog.setTitle("Progress已完结");
                    dialog.setCancelable(false);
                    dialog.setMessage("Progress已经到100了不能继续了");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                break;
        }
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
