package h_kang.myapp;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by h_kang on 2016/9/6.
 */
public class NewTitleLayout extends RelativeLayout implements View.OnClickListener{
    public Button back;
    public Button edit;
    public NewTitleLayout(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.layout_newtitle,this)  ;
        back =(Button)findViewById(R.id.btn_back);
        edit=(Button)findViewById(R.id.btn_edit);
        back.setOnClickListener(this);
        edit.setOnClickListener(this);
    }

    @Override
    public void onClick(View var1)
    {
        switch (var1.getId()) {
            case R.id.btn_back:
                ((Activity)getContext()).finish();
                break;
            case R.id.btn_edit:
                Toast.makeText(getContext(),"edit", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
