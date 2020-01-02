package com.example.test3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class TopRecyclerAdapter extends RecyclerView.Adapter<TopRecyclerAdapter.ViewHolder>
{

    private Context mContext;

    private List<TopRecycler> mTopRecyclerList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        if (mContext == null)
            mContext = viewGroup.getContext();
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.top_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);


        holder.cardView.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view)
            {
                int position = holder.getAdapterPosition();
                TopRecycler topRecycler = mTopRecyclerList.get(position);
                Intent intent = new Intent(mContext,FruitActivity.class);
                intent.putExtra(FruitActivity.FRUIT_IMAGE_ID,topRecycler.getImageId());
                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        TopRecycler topRecycler = mTopRecyclerList.get(position);
        holder.textTitle.setText(topRecycler.getTitle());
        holder.textContent.setText(topRecycler.getContent());
        Glide.with(mContext).load(topRecycler.getImageId())
                .into(holder.Image);
    }

    @Override
    public int getItemCount()
    {
        return mTopRecyclerList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        ImageView Image;
        TextView textTitle;
        TextView textContent;

        public ViewHolder(View itemView)
        {
            super(itemView);
            cardView = (CardView) itemView;
            textTitle = itemView.findViewById(R.id.top_recycler_text_title);
            textContent = itemView.findViewById(R.id.top_recycler_text_content);
            Image = itemView.findViewById(R.id.top_recycler_image);
        }
    }

    public TopRecyclerAdapter (List<TopRecycler> topRecyclerList)
    {
        mTopRecyclerList = topRecyclerList;
    }
}
