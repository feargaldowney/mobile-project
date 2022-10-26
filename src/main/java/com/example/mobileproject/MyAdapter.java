package com.example.mobileproject;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String data1[], data2[];
    int images[];
    Context context;
//    }
    public MyAdapter(Context cont, String s1[], String s2[], int img[]){
        context = cont;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.pubs_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.myTxt1.setText(data1[position]);
        holder.myTxt2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView myTxt1, myTxt2;
        ImageView myImage;

        public MyViewHolder(final View itemView) {
            super(itemView);
            myTxt1 = itemView.findViewById(R.id.pub_name_txt);
            myTxt2 = itemView.findViewById(R.id.pub_description_txt);
            myImage = itemView.findViewById(R.id.pubImage);
        }
    }
}
