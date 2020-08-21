package com.iceihehe.cm.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Room;

import android.os.Bundle;

import com.iceihehe.cm.R;
import com.iceihehe.cm.data.AppDatabase;
import com.iceihehe.cm.models.MonitoredUserModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MonitoredUserModel model = new ViewModelProvider(this).get(MonitoredUserModel.class);
        model.getAll().observe(this, monitoredUsers -> {
            System.out.println("ffff");
        });

    }
}