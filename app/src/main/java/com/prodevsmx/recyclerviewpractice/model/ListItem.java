package com.prodevsmx.recyclerviewpractice.model;

/**
 * Created by diego on 4/19/2017.
 */

public class ListItem {

    private String name;
    private String description;
    private int imageId;

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getImageId(){
        return imageId;
    }

    public void setNameCard(String nameCard){
        this.name = nameCard;
    }

    public void setDescriptionCard(String descriptionCard){
        this.description = descriptionCard;
    }

    public void setImageCard(int imageCardId){
        this.imageId = imageCardId;
    }
}
