package com.iceihehe.cm.data.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.iceihehe.cm.data.entities.MonitoredUser;

import java.util.List;


@Dao
public interface MonitoredUserDao {
    @Insert
    void insertAll(MonitoredUser... monitoredUsers);
    @Query("select * from monitored_user")
    List<MonitoredUser> getAll();
}
