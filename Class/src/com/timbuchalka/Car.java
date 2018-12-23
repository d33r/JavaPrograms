package com.timbuchalka;

public class Car {

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "Unknow";
        }
    }

    public String getModel(){
        return this.model;
    }



}
