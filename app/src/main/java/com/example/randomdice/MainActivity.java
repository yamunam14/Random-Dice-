package com.example.randomdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll=findViewById(R.id.button1);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myroll();
            }
        });
    }
    private void myroll(){
        int rollnum=(int)(Math.random()*6+1);
        TextView resulttext=findViewById(R.id.text1);
        ImageView diceimage=findViewById(R.id.image1);
        switch (rollnum){
            case 1:
                resulttext.setText("One");
                diceimage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                resulttext.setText("Two");
                diceimage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                resulttext.setText("Three");
                diceimage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                resulttext.setText("Four");
                diceimage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                resulttext.setText("Five");
                diceimage.setImageResource(R.drawable.dice_5);
                break;
            default:
            case 6:
                resulttext.setText("Six");
                diceimage.setImageResource(R.drawable.dice_6);
        }
    }
}