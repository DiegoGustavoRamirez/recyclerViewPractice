package com.prodevsmx.recyclerviewpractice.model;

import com.prodevsmx.recyclerviewpractice.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 4/19/2017.
 */

public class CardsData {

    private static final String [] nameCards = {"Bicycle Ghost Black", "Bicycle Blue", "Bicycle Blue Monsters",
            "Bicycle Bone", "Bicycle Golden", "Bicycle Knights", "Bicycle Red Stripes"};

    private static final String [] descriptionCards = {"Beautiful cards, the back is unique.", "Typically color blue",
            "Special edition of monsters", "Edition Bone, perfect to give away", "Beautiful design, amazing",
            "Knights on back", "Simple and minimalist"};

    private static final int [] imageCards = {R.drawable.blackghostback, R.drawable.blue, R.drawable.bluemonsters,
            R.drawable.bone, R.drawable.golden, R.drawable.knights, R.drawable.redstripes};

    public static List<ListItem> getListData(){
        List <ListItem> data = new ArrayList<>();

        for(int i=0; i<3; i++){
            for(int j=0; j < nameCards.length && j < descriptionCards.length && j < imageCards.length; j++){
                ListItem item = new ListItem();
                item.setNameCard(nameCards[j]);
                item.setDescriptionCard(descriptionCards[j]);
                item.setImageCard(imageCards[j]);
                data.add(item);
            }
        }
        return data;
    }
}
