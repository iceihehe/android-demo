package com.iceihehe.cm.models;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.iceihehe.cm.data.entities.MonitoredUser;

import java.util.List;

public class MonitoredUserModel extends ViewModel {
    private MutableLiveData<List<MonitoredUser>> monitoredUsers;
    public LiveData<List<MonitoredUser>> getAll() {
        if (monitoredUsers == null) {
            monitoredUsers = new MutableLiveData<>();
            loadMonitoredUsers();
        }
        return monitoredUsers;
    }
    private void loadMonitoredUsers() {
        System.out.println("........");
    }
}
