package com.example.roshani.customtoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
Button btn1;
Button btn2;
LottieAnimationView la;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button1);
        la=findViewById(R.id.anime_view);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=new Toast(MainActivity.this);
                toast.setGravity(Gravity.CENTER,0,-150);
                toast.setDuration(Toast.LENGTH_LONG);
                LayoutInflater inflater=getLayoutInflater();
                View convertView= inflater.inflate(R.layout.toastlayout,null);
                toast.setView(convertView);
                toast.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               la.setAnimation("preloader.json");
               la.loop(true);
               la.playAnimation();
            }
        });

    }
}
