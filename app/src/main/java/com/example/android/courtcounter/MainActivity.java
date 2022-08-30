package com.example.android.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.courtcounter.R;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void threepointer(View view) {
       scoreA=scoreA+3;
       display(scoreA);
    }
    public void twopointer(View view) {

        scoreA=scoreA+2;
        display(scoreA);

    }

    public void freethrowpoint(View view) {

        scoreA++;
        display(scoreA );

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.basketballA);
        quantityTextView.setText("" + number);
    }
    public void threepointerB(View view) {
        scoreB=scoreB+3;
        displayB(scoreB);
    }
    public void twopointerB(View view) {

        scoreB=scoreB+2;
        displayB(scoreB);

    }
    public void freethrowpointB(View view) {

        scoreB++;
        displayB(scoreB );

    }
    public void resetboth(View view) {
       scoreA=0;
        scoreB=0;
        display(scoreB);
        displayB(scoreB );

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.basketballB);
        quantityTextView.setText("" + number);
    }

}