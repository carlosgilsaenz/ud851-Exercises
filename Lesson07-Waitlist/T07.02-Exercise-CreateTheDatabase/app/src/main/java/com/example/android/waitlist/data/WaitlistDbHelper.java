package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import com.example.android.waitlist.data.WaitlistContract.WaitlistEntry;

// complete (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "waitlist.db";

    private static final int DATABASE_VERSION = 1;

    final String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE " +
            WaitlistEntry.TABLE_NAME + " (" +
            WaitlistEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            WaitlistEntry.COLUMN_GUEST_NAME + " TEXT NOT NULL," +
            WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER NOT NULL," +
            WaitlistEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
            ");";

    public WaitlistDbHelper(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_WAITLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + SQL_CREATE_WAITLIST_TABLE);
        onCreate(db);
    }

    // complete (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"

    // complete (3) Create a static final int called DATABASE_VERSION and set it to 1

    // complete (4) Create a Constructor that takes a context and calls the parent constructor

    // complete (5) Override the onCreate method

        // complete (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table

        // complete (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE

    // complete (8) Override the onUpgrade method

        // complete (9) Inside, execute a drop table query, and then call onCreate to re-create it

}