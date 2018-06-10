package com.example.joy.mypics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click;
        click=findViewById(R.id.button);
        final ImageView Image1=findViewById(R.id.image1);

        final int[] images={ R.drawable.pic1,R.drawable.pic2,
        R.drawable.pic3,
        R.drawable.pic4,
        R.drawable.pic5,
        R.drawable.pic6};
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randompic=new Random();
                 int number=randompic.nextInt(6);
                 Image1.setImageResource(images[number]);
            }
        });
    }
}
