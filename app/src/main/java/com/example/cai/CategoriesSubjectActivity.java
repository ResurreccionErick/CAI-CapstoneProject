package com.example.cai;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class CategoriesSubjectActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_subject);
        Toolbar toolbar = findViewById(R.id.subjToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Subject");


        recyclerView = findViewById(R.id.subjRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<CategoriesSubjectModel> list = new ArrayList<>();
        list.add(new CategoriesSubjectModel("", "Numeracy"));
        list.add(new CategoriesSubjectModel("", "Language Literacy"));
        list.add(new CategoriesSubjectModel("", "Filipino"));
        list.add(new CategoriesSubjectModel("", "Reading"));


        CategoriesSubjectAdapter adapter = new CategoriesSubjectAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getGroupId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}