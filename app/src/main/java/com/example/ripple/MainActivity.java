package com.example.ripple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnRipple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRipple = findViewById(R.id.btn_ripple);
        btnRipple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setRipple();
            }
        });
    }

    //setBackgroundResource(@DrawableRes int resid):變更背景(Drawable資源)
    private void setRipple() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { //版本樹要大於4.4
            btnRipple.setBackgroundResource(R.drawable.ripple); //更換背景
        } else {
            btnRipple.setBackgroundResource(android.R.drawable.btn_default); //如果版本數沒有小於4.4設定為預設
        }
    }
}

