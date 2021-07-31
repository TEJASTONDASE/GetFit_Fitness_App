package com.example.fitnesstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class activity_level extends AppCompatActivity {
    TextView tv1, tv2;
    Animation img1up,img2up,img3up,tv1up,tv2up;
    ImageView img1, img2, img3;
    View divider;
    LinearLayout linearLayout1,linearLayout2,linearLayout3;
    int beginner= 62000, intermediate = 122000, advance = 182000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);




        //Load Animation
        img1up = AnimationUtils.loadAnimation(this,R.anim.bttwo);
        img2up = AnimationUtils.loadAnimation(this,R.anim.bttfour);
        img3up = AnimationUtils.loadAnimation(this,R.anim.bttfive);
        tv1up = AnimationUtils.loadAnimation(this,R.anim.img1up);
        tv2up = AnimationUtils.loadAnimation(this,R.anim.img1up);



        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
        img3=(ImageView) findViewById(R.id.img3);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        divider =(View) findViewById(R.id.divider);

        linearLayout1 = (LinearLayout) findViewById(R.id.linearLayout1);
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
        linearLayout3 = (LinearLayout) findViewById(R.id.linearLayout3);


        setClickListener(linearLayout1, R.drawable.beginner, beginner);
        setClickListener(linearLayout2, R.drawable.intermediate, intermediate);
        setClickListener(linearLayout3, R.drawable.advance, advance);

        //assign the animation
        tv1.startAnimation(tv1up);
        tv2.startAnimation(tv2up);
        img1.startAnimation(img1up);
        img2.startAnimation(img2up);
        img3.startAnimation(img3up);
        divider.startAnimation(tv1up);




    }

    private void setClickListener(LinearLayout lLayout, final int img, final int time) {
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(activity_level.this, WorkoutAct.class);
                go.putExtra(Constants.TIME, time);
                startActivity(go);


            }
        };
        lLayout.setOnClickListener(clickListener);
    }
}
