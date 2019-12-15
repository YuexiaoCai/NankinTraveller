package com.example.test3;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class SpotAdapter extends RecyclerView.Adapter<SpotAdapter.ViewHolder>
{

    private Context mContext;

    private List<Spot> mSpotList;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        ImageView spotImage;
        ImageView portrait;
        TextView spotName;
        TextView spotPreview;
        TextView author;
        TextView category;

        public ViewHolder(View view)
        {
            super(view);
            cardView = (CardView)view;
            spotImage = view.findViewById(R.id.spot_image);
            portrait = view.findViewById(R.id.portrait);
            spotName = view.findViewById(R.id.spot_name);
            spotPreview = view.findViewById(R.id.spot_Preview);
            author = view.findViewById(R.id.author);
            category = view.findViewById(R.id.category);
        }
    }

    public SpotAdapter(List<Spot> spotList){
        mSpotList = spotList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        if(mContext==null)
            mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.spot_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        /**holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                Spot spot = mSpotList.get(position);
                Intent intent= new Intent(mContext,SpotActivity.class);
                intent.putExtra(SpotActivity.SPOT_NAME, spot.getName());
                intent.putExtra(SpotActivity.SPOT_PREVIEW, spot.getPreview());
                intent.putExtra(SpotActivity.AUTHOR, spot.getAuthor());
                intent.putExtra(SpotActivity.CATEGORY, spot.getCategory());
                intent.putExtra(SpotActivity.SPOT_IMAGE_ID, spot.getImageId());
                mContext.startActivity(intent);
                intent.putExtra(SpotActivity.PORTRAIT_ID, spot.getImageId());
                mContext.startActivity(intent);
            }
        });*/
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position)
    {
        Spot spot= mSpotList.get(position);
        holder.spotName.setText(spot.getName());
        holder.author.setText(spot.getAuthor());
        holder.category.setText(spot.getCategory());
        holder.spotPreview.setText(spot.getPreview());
        Glide.with(mContext).load(spot.getImageId()).into(holder.spotImage);
        Glide.with(mContext).load(spot.getPortraitId()).into(holder.portrait);
    }

    @Override
    public int getItemCount()
    {
        return mSpotList.size();
    }


}
