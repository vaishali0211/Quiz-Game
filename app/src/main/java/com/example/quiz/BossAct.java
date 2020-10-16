package com.example.quiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BossAct extends AppCompatActivity {
    TextView textScreen, textQuestion, textTitle ,textbtn;
  ImageView bigboss;
  Animation smalltobig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);
  smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/fredokaOneRegular.ttf");
        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (TextView) findViewById(R.id.textTitle);
        textbtn = (TextView) findViewById(R.id.textBtn);
        bigboss = (ImageView) findViewById(R.id.bigboss);

        bigboss.startAnimation(smalltobig);
        textQuestion.setTypeface(typeface);
        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);
        textbtn.setTypeface(typeface);

    }
}