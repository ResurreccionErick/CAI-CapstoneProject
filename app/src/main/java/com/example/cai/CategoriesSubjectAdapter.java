package com.example.cai;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class CategoriesSubjectAdapter extends RecyclerView.Adapter<CategoriesSubjectAdapter.Viewholder> {

    private List<CategoriesSubjectModel> categoriesSubjectModels;

    public CategoriesSubjectAdapter(List<CategoriesSubjectModel> categoriesSubjectModels) {
        this.categoriesSubjectModels = categoriesSubjectModels;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_subject_item, parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(categoriesSubjectModels.get(position).getImageUrl(),
                categoriesSubjectModels.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return categoriesSubjectModels.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        private CircleImageView imageViewCategory;
        private TextView cat_title;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageViewCategory = itemView.findViewById(R.id.category_subject_imageview);
            cat_title = itemView.findViewById(R.id.category_subject_title);

        }
        private void setData(String url, String title){
            Glide.with(itemView.getContext()).load(url).into(imageViewCategory);
            this.cat_title.setText(title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),SetsSubjectActivity.class);
                    intent.putExtra("subj_title", title);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
    }


