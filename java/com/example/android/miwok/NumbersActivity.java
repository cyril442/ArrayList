package com.example.android.miwok;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
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

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


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

}
