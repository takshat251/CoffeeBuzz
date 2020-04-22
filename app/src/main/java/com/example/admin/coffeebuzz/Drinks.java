package com.example.admin.coffeebuzz;

public class Drinks {//this class is in backend as a database of subtype while type was coded in front end
    private String name;
    private String desc;
    private int imageID;
    public static final Drinks[] drinks = {
            new Drinks("Latte", "this is description for latte", R.drawable.latte),
            new Drinks("Cappuccino", "this is description for cappuccino", R.drawable.cappuccinos),
            new Drinks("Americano", "this is description for americano", R.drawable.americano)

    };
    private Drinks(String name,String desc,int imageID){
        this.name=name;
        this.desc=desc;
        this.imageID=imageID;
    }
    public String getDesc(){
        return desc;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }
    public String toString(){
        return this.name;
    }




}