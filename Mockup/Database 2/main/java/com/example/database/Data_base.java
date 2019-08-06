package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class Data_base extends SQLiteOpenHelper {
    public static final string DATABASE_NAME= "tracker";
    public static final string Table_NAME= "tracker_table";
    public static final string COL_1= "username";
    public static final string COL_2= "fullname";
    public static final string COL_3= "email";
    public static final string COL_4= "password";
    public static final string COL_5= "input_code";
    public static final string COL_6= "child_code";

    public Data_base(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
