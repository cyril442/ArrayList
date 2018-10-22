package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an ArrayList
        ArrayList<String> words = new ArrayList<String>();


        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // TO PUT AN ARRAY LIST INTO THE ACTIVITY

        // Step 1: Create the ParentView and link it to the XML file by the Id


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // Step 2 : Create a ChildView TextView wordView for the text
        // Step 3 :Set the text of the childView called wordView
        // Step 4 : Put the child View into the Parent View


        for (int index = 0; index < words.size(); index++) {

            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);


        }










        // Verification in the Log of the datas
//        Log.v("NumberActivity", "stored in the index 0 : " + words.get(0));
//        Log.v("NumberActivity", "stored in the index 1 : " + words.get(1));
//        Log.v("NumberActivity", "stored in the index 2 : " + words.get(2));
//        Log.v("NumberActivity", "stored in the index 3 : " + words.get(3));
//        Log.v("NumberActivity", "stored in the index 4 : " + words.get(4));
//        Log.v("NumberActivity", "stored in the index 5 : " + words.get(5));
//        Log.v("NumberActivity", "stored in the index 6 : " + words.get(6));
//        Log.v("NumberActivity", "stored in the index 7 : " + words.get(7));
//        Log.v("NumberActivity", "stored in the index 8 : " + words.get(8));
//        Log.v("NumberActivity", "stored in the index 9 : " + words.get(9));

}}
