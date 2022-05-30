package com.example.cai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

public class SetsSubjectActivity extends AppCompatActivity {

    private GridView setsGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets_subject);

        Toolbar toolbar = findViewById(R.id.setsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getIntent().getStringExtra("subj_title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setsGridView = findViewById(R.id.setsGridView);

        setsSubjGridAdapter adapter = new setsSubjGridAdapter(4);
        setsGridView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}