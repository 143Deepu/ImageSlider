package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper V_filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] Image_view = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img1};

        V_filter = findViewById(R.id.View_fliter);

//        //For loop
//        for (int i = 0; i < Image_view.length;i++)
//        {
//                flipperImage(Image_view[1]);
//        }

        //But I Prefer Foreach
        for(int image : Image_view)
        {
            flipperImage(image);
        }
    }

    public  void flipperImage(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        V_filter.addView(imageView);
        V_filter.setFlipInterval(4000);  //4 Sec
        V_filter.setAutoStart(true);


        //animation
        V_filter.setInAnimation(this,android.R.anim.slide_in_left);
        V_filter.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
