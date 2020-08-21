package com.iceihehe.cm.data;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.iceihehe.cm.data.daos.MonitoredUserDao;
import com.iceihehe.cm.data.entities.MonitoredUser;

@Database(entities = {MonitoredUser.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MonitoredUserDao monitoredUserDao();
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = create(context);
                }
            }
        }
        return instance;
    }

    private static AppDatabase create(Context context) {
        Callback callback
                = new Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
            }

            @Override
            public void onOpen(@NonNull SupportSQLiteDatabase db) {
                super.onOpen(db);
            }
        };
        return Room.databaseBuilder(context, AppDatabase.class, "cm.db").createFromAsset("database/init.db").addCallback(callback).build();
    }
}
