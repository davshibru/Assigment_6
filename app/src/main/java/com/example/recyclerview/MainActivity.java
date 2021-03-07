package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerStudent = (RecyclerView) findViewById(R.id.recyclerView);

        String[] studentsName = new String[StudentBase.students.length];
        String[] studentsLastName = new String[StudentBase.students.length];
        int[] studentImageId = new int[StudentBase.students.length];

        for (int i = 0; i < StudentBase.students.length; i++){
            studentsName[i] = StudentBase.students[i].getName();
            studentsLastName[i] = StudentBase.students[i].getLasName();
            studentImageId[i] = StudentBase.students[i].getImageResId();
        }

        StudentAdapter adapter = new StudentAdapter(studentsName, studentsLastName, studentImageId);
        recyclerStudent.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerStudent.setLayoutManager(layoutManager);
    }
}