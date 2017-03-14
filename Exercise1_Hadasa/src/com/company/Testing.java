package com.company;

/**
 * Created by hackeru on 3/14/2017.
 */
public class Testing {

    private String name;
    private int count;

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public Testing(String name) {
        this.name = name;
    }
    public String bark(){
        return "waf waf" + name + " " + count;
    }


}
