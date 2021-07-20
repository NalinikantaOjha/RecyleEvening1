package com.example.recycleevening1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    private itemClickListner itemcClickListner;
    private CardView cardView;
    private ImageView imageView;
    private TextView name;
    private TextView bark;
    private TextView category;
    public ArticleViewHolder(@NonNull View itemView,itemClickListner itemcClickListner) {
        super(itemView);
        initView(itemView);
        this.itemcClickListner=itemcClickListner;

    }

    public void setData(Model model) {
        imageView.setImageResource(model.getImage());
        name.setText(model.getName());

        category.setText(model.getCategory());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemcClickListner.onitemClicked(model);

            }
        });

    }

    private void initView(View itemView) {
        imageView=itemView.findViewById(R.id.image1);
        name=itemView.findViewById(R.id.name1);

        category=itemView.findViewById(R.id.catagory);
        cardView=itemView.findViewById(R.id.cardview);
    }


}


