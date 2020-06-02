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

public class ViewRecyclerAdapter extends RecyclerView.Adapter<ViewRecyclerAdapter.ViewHolder>
{
    private Context mContext;

    private List<ViewRecycler> mViewRecyclerList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
    {
        if (mContext == null)
            mContext = viewGroup.getContext();
        View view = LayoutInflater.from(mContext).
                inflate(R.layout.view_item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        holder.viewImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int position = holder.getAdapterPosition();
                ViewRecycler viewRecycler = mViewRecyclerList.get(position);
                Intent intent = new Intent(mContext,FruitActivity.class);
                intent.putExtra(FruitActivity.FRUIT_IMAGE_ID,viewRecycler.getImageId());
                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position)
    {
        ViewRecycler viewRecycler = mViewRecyclerList.get(position);
        viewHolder.viewText.setText(viewRecycler.getName());
        Glide.with(mContext).load(viewRecycler.getImageId()).into(viewHolder.viewImage);
    }

    @Override
    public int getItemCount()
    {
        return mViewRecyclerList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView viewImage;
        TextView viewText;

        public ViewHolder(View itemView)
        {
            super(itemView);
            viewImage = itemView.findViewById(R.id.fragment_3_2_recycler_image);
            viewText = itemView.findViewById(R.id.fragment_3_2_recycler_text);
        }
    }

    public ViewRecyclerAdapter (List<ViewRecycler> viewRecyclerList)
    {
        mViewRecyclerList = viewRecyclerList;
    }
}
