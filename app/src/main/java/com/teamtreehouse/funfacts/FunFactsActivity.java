package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private ToastShow mToastShow = new ToastShow();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        //Declare our View variable and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factText);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout viewBackground =  (RelativeLayout) findViewById(R.id.viewBackground);
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toast = mToastShow.getToast();
                if (toast != "") {
                    Toast.makeText(FunFactsActivity.this,toast, Toast.LENGTH_LONG).show();
                }
                String fact = mFactBook.getFact();
                // Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                viewBackground.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(Listener);
//        String toast = mToastShow.getToast();
//        Toast.makeText(this, toast, Toast.LENGTH_LONG).show();
//        Log.d(TAG, "We are logging from the onCreate() method!");

    }

}
