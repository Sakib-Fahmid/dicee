package com.example.dice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton ;
        rollButton=(Button)findViewById(R.id.rollButton);

        final ImageView leftDice=(ImageView)findViewById(R.id.imageLeftDice);
        final ImageView rightDice=(ImageView)findViewById(R.id.imageRightDice);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View v){

                                              Random randomNumberGenerator = new Random();
                                              int randomNumberLeftDice=randomNumberGenerator.nextInt(6);
                                              int randomNumberRightDice=randomNumberGenerator.nextInt(6);
                                              //Log.d("Dicee","Left Random number is :"+randomNumber);
                                              leftDice.setImageResource(diceArray[randomNumberLeftDice]);
                                              rightDice.setImageResource(diceArray[randomNumberRightDice]);
                                          }
                                      }
        );
    }
}