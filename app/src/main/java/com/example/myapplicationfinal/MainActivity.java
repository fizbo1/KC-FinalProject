package com.example.myapplicationfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> studentArrayList = new ArrayList<>();
    int currentstestudent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView2 = findViewById(R.id.imageView2);
        TextView textView2= findViewById(R.id.textView2);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);



        Student student1 = new Student("fahad","17",R.drawable.ic_launcher_background);
        Student student2 = new Student("saad","19",R.drawable.ic_launcher_foreground);
        Student student3 = new Student("hamad","12",R.drawable.ic_round_account_circle_24);

        studentArrayList.add(student1); //0
        studentArrayList.add(student2); //1
        studentArrayList.add(student3); //2

        imageView2.setImageResource(studentArrayList.get(currentstestudent).getStudentPhoto());
        textView2.setText(studentArrayList.get(currentstestudent).getStudentname());
        textView.setText(String.valueOf(studentArrayList.get(currentstestudent).getStudentAge()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currentstestudent++;

                if(currentstestudent == studentArrayList.size()){
                    currentstestudent = 0;
                }


                imageView2.setImageResource(studentArrayList.get(currentstestudent).getStudentPhoto());
                textView2.setText(studentArrayList.get(currentstestudent).getStudentname());
                textView.setText(String.valueOf(studentArrayList.get(currentstestudent).getStudentAge()));




            }
        });



    }
}