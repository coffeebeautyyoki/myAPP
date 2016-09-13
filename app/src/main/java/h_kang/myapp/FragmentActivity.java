package h_kang.myapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.Button;
import android.app.*;

import h_kang.myapp.fragment.LeftFragment;
import h_kang.myapp.fragment.NewRightFragment;
import h_kang.myapp.fragment.RightFragment;

public class FragmentActivity extends AppCompatActivity implements LeftFragment.OnFragmentInteractionListener,RightFragment.OnFragmentInteractionListener,NewRightFragment.OnFragmentInteractionListener, View.OnClickListener {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        button=(Button)findViewById(R.id.btn_leftfragment);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_leftfragment:
                NewRightFragment rightFragment = new NewRightFragment();
                FragmentManager fragmentManager =getFragmentManager();
                FragmentTransaction transaction= fragmentManager.beginTransaction();
                transaction.replace(R.id.frame_right, rightFragment);
                transaction.commit();
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
