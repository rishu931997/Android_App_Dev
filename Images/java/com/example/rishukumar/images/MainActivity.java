package com.example.rishukumar.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    ImageButton prev,next;
    ImageSwitcher imgsw;

    Integer[] images={R.drawable.i1 , R.drawable.i2,R.drawable.i3,R.drawable.i4,R.drawable.i5,R.drawable.i6,R.drawable.i7,R.drawable.i8,R.drawable.i9,R.drawable.i10,R.drawable.i11,R.drawable.i12,R.drawable.i13};
    int i=0;
    Animation in,out,in2,out2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgsw= (ImageSwitcher) findViewById(R.id.image_switcher);
        prev= (ImageButton) findViewById(R.id.b_prev);
        next= (ImageButton) findViewById(R.id.b_next);

        in= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in);
        out=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.out);
        in2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.in2);
        out2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.out2);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageview = new ImageView(getApplicationContext());
                imageview.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageview.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                return  imageview;
            }
        });
        imgsw.setImageResource(images[0]);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsw.setInAnimation(in);
                imgsw.setOutAnimation(out);
                if (i > 0) {
                    i--;
                    imgsw.setImageResource(images[i]);
                }
            }

        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsw.setInAnimation(in2);
                imgsw.setOutAnimation(out2);
                if(i<images.length-1){
                    i++;
                    imgsw.setImageResource(images[i]);
                }
            }
        });
    }
}
