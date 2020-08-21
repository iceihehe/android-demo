package com.iceihehe.cm.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


@Entity(tableName = "monitored_user", indices = @Index(value = "tel", unique = true))
public class MonitoredUser {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "tel")
    public String tel;

    @ColumnInfo(name = "create_time")
    public int createTime;

}
