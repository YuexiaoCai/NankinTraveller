package com.example.test3;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public class SpotOpenHelper extends SQLiteOpenHelper {
    private SQLiteDatabase spotdb;

    public SpotOpenHelper(Context context) {
        super(context, "spot_db", null, 1);
        spotdb = getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS spot(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "spotID INTEGER," +
                "spotScore FLOAT," +
                "userName TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS spot");
        //onCreate(db);
    }

    public void add(Integer spotID,Float spotScore,String userName){
        spotdb.execSQL("INSERT INTO spot (spotID,spotScore,userName) VALUES(?,?,?)",new Object[]{spotID,spotScore,userName});
    }
    public void delete(){ }
    public void update(Float spotScore){
        spotdb.execSQL("UPDATE spot SET spotScore = ?",new Object[]{spotScore});
    }


    public ArrayList<SpotData> getAllData(){

        ArrayList<SpotData> list = new ArrayList<SpotData>();
        Cursor cursor = spotdb.query("spot",null,null,null,null,null,"spotID DESC");
        while(cursor.moveToNext()){
            Integer spotID = cursor.getInt(cursor.getColumnIndex("spotID"));
            Float spotScore = cursor.getFloat(cursor.getColumnIndex("spotScore"));
            String userName = cursor.getString(cursor.getColumnIndex("userName"));
            list.add(new SpotData(spotID,spotScore,userName));
        }
        return list;
    }
}
