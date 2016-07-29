package com.example.admin.eventdriven;

/**
 * Created by admin on 7/28/2016.
 */
public class MagicEvent {

    private String text;

    public MagicEvent(){

    }

    public MagicEvent(String string){
        text = string;
    }

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
}
