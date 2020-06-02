package com.example.test3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LeftRecyclerAdapter extends RecyclerView.Adapter<LeftRecyclerAdapter.ViewHolder>
{
    private List<LeftRecycler> mLeftRecyclerList;

    private ViewHolder last = null;

    private View v = null;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        View leftRecycylerView;

        public ViewHolder (View view)
        {
            super(view);
            leftRecycylerView = view;
            name = view.findViewById(R.id.left_item_name);
        }
    }

    public LeftRecyclerAdapter(List<LeftRecycler> LeftRecyclerList)
    {
        mLeftRecyclerList = LeftRecyclerList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.left_item,parent,false);
        if (v == null)
            v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_second,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        LeftRecycler leftRecycler = mLeftRecyclerList.get(position);
        holder.name.setText(leftRecycler.getName());
        holder.leftRecycylerView.setOnClickListener(view ->
        {
            if (last != null)
                last.name.setTextColor(0xff999999);
            holder.name.setTextColor(0xff0066ff);
            last = holder;

            RecyclerView recyclerView = v.findViewById(R.id.fragment_2_recycler_right);

            recyclerView.scrollToPosition(16);
        });
    }


    @Override
    public int getItemCount()
    {
        return mLeftRecyclerList.size();
    }


}
