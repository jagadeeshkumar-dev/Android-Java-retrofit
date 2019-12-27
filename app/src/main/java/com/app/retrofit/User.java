package com.app.retrofit;

import com.google.gson.annotations.SerializedName;

public class User {


    @SerializedName("id")
    private int Id;

    @SerializedName("name")
    private String Name;

    @SerializedName("stdclass")
    private String Stdclass;


    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getStdclass() {
        return Stdclass;
    }
}
