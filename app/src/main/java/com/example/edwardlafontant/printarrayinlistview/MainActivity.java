package com.example.edwardlafontant.printarrayinlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import static com.example.edwardlafontant.printarrayinlistview.inToString.intToString;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    public static ArrayList<String> myIntArray = new ArrayList<String>();
    int[] l = {1,2,44,5,6,23,8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.myList);
        inToString s = new inToString();
        Arrays.sort(l);
        s.intToString(l);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                myIntArray);

        lv.setAdapter(arrayAdapter);
    }

    public void pw(int n,String ch)
    {
        String one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};

        String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};

        if(n > 19) {


            myIntArray.add(ten[n/10]+" "+one[n%10]);
        }
        else
        {
            myIntArray.add(one[n]);
        }

    }


}
