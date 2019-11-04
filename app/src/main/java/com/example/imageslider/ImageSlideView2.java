package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class ImageSlideView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slide_view2);

        FlipperLayout flipperLayout= (FlipperLayout)findViewById(R.id.Flipper_Image_View);
        int[] Image_View = {R.drawable.img1,R.drawable.img2,R.drawable.img3};
        //If you add Description on Image
        String imageDes[] = {"Image1","Image2","Image3"};
        //forLoop
        for (int i = 0 ; i < Image_View.length; i++)
        {
            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(Image_View[i]);
            flipperView.setDescription(imageDes[i]);
            flipperLayout.addFlipperView(flipperView);
        }
    }
}
