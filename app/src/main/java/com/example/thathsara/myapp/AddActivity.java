package com.example.thathsara.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.thathsara.myapp.Database.DatabaseHelper;
import com.example.thathsara.myapp.Database.ToDo;
import com.example.thathsara.myapp.Other.SetDate;
import com.example.thathsara.myapp.Other.SetTime;

public class AddActivity extends AppCompatActivity {


    private TextView date, time;
    private EditText description;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        date = findViewById(R.id.txtViewDate);
        time = findViewById(R.id.txtViewTime);
        description = findViewById(R.id.editTextDescription);

        Button addToDo = findViewById(R.id.btnAddToDo);

        SetTime fromTime = new SetTime(time, this);
        SetDate fromDate = new SetDate(date, this);

        addToDo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String timestamp = date.getText().toString() + "-" + time.getText().toString();
                String strDescription = description.getText().toString();
                ToDo toDo = new ToDo(strDescription,timestamp);

                dbHelper = new DatabaseHelper(AddActivity.this);
                dbHelper.insertToDo(toDo);

                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
