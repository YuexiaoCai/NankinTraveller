package com.example.test3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RightRecyclerAdapter extends RecyclerView.Adapter<RightRecyclerAdapter.ViewHolder>
{
    private Context mContext;
    private List<RightRecycler> mRightRecyclerList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i)
    {
        if (mContext == null)
            mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.right_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        holder.rightRecyclerImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int position = holder.getAdapterPosition();
                RightRecycler rightRecycler = mRightRecyclerList.get(position);
                Intent intent = new Intent(mContext,FruitActivity.class);
                intent.putExtra(FruitActivity.FRUIT_IMAGE_ID,rightRecycler.getImageId());
                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        RightRecycler rightRecycler = mRightRecyclerList.get(position);
        Glide.with(mContext).load(rightRecycler.getImageId()).into(holder.rightRecyclerImage);
        holder.rightRecyclerText.setText(rightRecycler.getName());
    }

    @Override
    public int getItemCount()
    {
        return mRightRecyclerList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView rightRecyclerImage;
        TextView rightRecyclerText;

        public ViewHolder(View itemView)
        {
            super(itemView);
            rightRecyclerImage = itemView.findViewById(R.id.right_item_image);
            rightRecyclerText = itemView.findViewById(R.id.right_item_name);
        }
    }

    public RightRecyclerAdapter (List<RightRecycler> rightRecyclerList)
    {
        mRightRecyclerList = rightRecyclerList;
    }
}
