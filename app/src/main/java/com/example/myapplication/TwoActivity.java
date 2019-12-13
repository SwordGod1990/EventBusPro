package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 发送消息
 */
public class TwoActivity extends AppCompatActivity {
    @BindView(R.id.two_tv)
    TextView twoTv;
    @BindView(R.id.two_btn)
    Button twoBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        ButterKnife.bind(this);

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new FirstEvent("DDDDDDDDDDDDDDDDDDDDDDD"));
            }
        });

    }
}
