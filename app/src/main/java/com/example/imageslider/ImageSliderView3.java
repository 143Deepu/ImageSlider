package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class ImageSliderView3 extends AppCompatActivity {

    CarouselView carouselView;
    private int[] Image_view = new  int[]
            {
                    R.drawable.img1,R.drawable.img2,R.drawable.img3
            };

    //If you click the Image Title's coming TO visible Tost message
    private String[] Image_Title = new String[]
            {
                    "Image1","Image2","Image3"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider_view3);

        carouselView = (CarouselView)findViewById(R.id.carouselView);
        carouselView.setPageCount(Image_view.length);

        carouselView.setImageListener(imageListener);
        carouselView.setImageClickListener(imagePosition);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(Image_view[position]);
        }
    };
    ImageClickListener imagePosition = new ImageClickListener() {
        @Override
        public void onClick(int position) {
            Toast.makeText(ImageSliderView3.this,Image_Title[position],Toast.LENGTH_LONG).show();
        }
    };

}
