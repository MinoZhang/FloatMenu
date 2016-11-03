package com.learn.floatmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.start)
    TextView mStart;
    @BindView(R.id.hideStatuBarNaviBar)
    Button mHideStatuBarNaviBar;
    private TextView startService;
    private Button hideService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.start:
                Toast.makeText(this, "开启服务", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hideStatuBarNaviBar:
                break;
            default:
                break;
        }
    }
}
