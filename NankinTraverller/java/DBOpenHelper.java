package com.example.test3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBOpenHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    public DBOpenHelper(Context context){
        super(context,"db_test",null,1);
        db = getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS user(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "password TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS article(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "title TEXT," +
                "type TEXT," +
                "content TEXT," +
                "author TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS comment(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "articleTitle TEXT," +
                "content TEXT," +
                "author TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS likeTable(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "articleTitle TEXT," +
                "author TEXT)");

        db.execSQL("CREATE TABLE IF NOT EXISTS favoriteTable(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "articleTitle TEXT," +
                "author TEXT)");

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        //db.execSQL("DROP TABLE IF EXISTS user");
        //onCreate(db);
    }

    public void add(String name,String password){
        db.execSQL("INSERT INTO user (name,password) VALUES(?,?)",new Object[]{name,password});
    }
    public void delete(String name,String password){
        db.execSQL("DELETE FROM user WHERE name = AND password ="+name+password);
    }
    public void update(String password){
        db.execSQL("UPDATE user SET password = ?",new Object[]{password});
    }

    public void addArticle(String title,String type,String content,String author){
        db.execSQL("INSERT INTO article (title,type,content,author) VALUES(?,?,?,?)",new Object[]{title,type,content,author});
    }

    public void deleteArticle(String title){
        db.execSQL("DELETE FROM article WHERE title = ? ",new Object[]{title});
    }

    public void updateArticle(String title,String type,String content,String oldTitle){
        db.execSQL("UPDATE article SET title = ? AND type = ? AND content = ? WHERE title = ?",new Object[]{title,type,content,oldTitle});
    }

    public void addCommnent(String articleTitle,String content,String author){
        db.execSQL("INSERT INTO comment (articleTitle,content,author) VALUES(?,?,?)",new Object[]{articleTitle,content,author});
    }

    public void addLike(String articleTitle,String author){
        db.execSQL("INSERT INTO likeTable (articleTitle,author) VALUES(?,?)",new Object[]{articleTitle,author});
    }

    public void deleteLike(String articleTitle,String author){
        db.execSQL("DELETE FROM likeTable WHERE articleTitle = ? AND author = ?",new Object[]{articleTitle,author});
    }

    public void addFavorite(String articleTitle,String author){
        db.execSQL("INSERT INTO favoriteTable (articleTitle,author) VALUES(?,?)",new Object[]{articleTitle,author});
    }

    public void deleteFavorite(String articleTitle,String author){
        db.execSQL("DELETE FROM favoriteTable WHERE articleTitle = ? AND author = ?",new Object[]{articleTitle,author});
    }

    public ArrayList<User> getAllData(){
        ArrayList<User> list = new ArrayList<User>();
        Cursor cursor = db.query("user",null,null,null,null,null,"name DESC");
        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String password = cursor.getString(cursor.getColumnIndex("password"));
            list.add(new User(name,password));
        }
        return list;
    }

    public ArrayList<Article> getAllArticle(){
        ArrayList<Article> list = new ArrayList<Article>();
        Cursor cursor = db.query("article",null,null,null,null,null,"title DESC");
        while(cursor.moveToNext()){
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String type = cursor.getString(cursor.getColumnIndex("type"));
            String content = cursor.getString(cursor.getColumnIndex("content"));
            String author = cursor.getString(cursor.getColumnIndex("author"));
            list.add(new Article(title,type,content,author));
        }
        return list;
    }

    public ArrayList<Comment> getAllComment(){
        ArrayList<Comment> list = new ArrayList<Comment>();
        Cursor cursor = db.query("comment",null,null,null,null,null,"articleTitle DESC");
        while(cursor.moveToNext()){
            String articleTitle = cursor.getString(cursor.getColumnIndex("articleTitle"));
            String content = cursor.getString(cursor.getColumnIndex("content"));
            String author = cursor.getString(cursor.getColumnIndex("author"));
            list.add(new Comment(articleTitle,content,author));
        }
        return list;
    }

    public ArrayList<Like> getAllLike(){
        ArrayList<Like> list = new ArrayList<Like>();
        Cursor cursor = db.query("likeTable",null,null,null,null,null,"articleTitle DESC");
        while(cursor.moveToNext()){
            String articleTitle = cursor.getString(cursor.getColumnIndex("articleTitle"));
            String author = cursor.getString(cursor.getColumnIndex("author"));
            list.add(new Like(articleTitle,author));
        }
        return list;
    }

    public ArrayList<Favorite> getAllFavorite(){
        ArrayList<Favorite> list = new ArrayList<Favorite>();
        Cursor cursor = db.query("favoriteTable",null,null,null,null,null,"articleTitle DESC");
        while(cursor.moveToNext()){
            String articleTitle = cursor.getString(cursor.getColumnIndex("articleTitle"));
            String author = cursor.getString(cursor.getColumnIndex("author"));
            list.add(new Favorite(articleTitle,author));
        }
        return list;
    }
}
