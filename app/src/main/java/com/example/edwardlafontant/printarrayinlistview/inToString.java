package com.example.edwardlafontant.printarrayinlistview;

import java.util.ArrayList;

/**
 * Created by edwardlafontant on 10/25/16.
 */

public class inToString extends MainActivity {

    public static ArrayList<String> intToString(int[] l){

        inToString b = new inToString();

        for(int i = 0; i <= l.length-1; i++){

            b.pw((l[i]%100)," ");

        }
        return myIntArray;

    }
}
