package com.example.cai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesSubjectActivity extends AppCompatActivity {

    private Button btnTakeAQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_subject);

        btnTakeAQuiz = findViewById(R.id.btnMainTakeAQuiz);

        btnTakeAQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CategoriesSubjectActivity.class));
            }
        });
    }
}