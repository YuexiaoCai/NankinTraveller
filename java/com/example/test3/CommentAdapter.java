package com.example.test3;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    private Context mContext;

    private List<Comment> mCommentList;

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView author;
        TextView comment_content;

        public ViewHolder(View view)
        {
            super(view);
            cardView = (CardView)view;
            author = view.findViewById(R.id.comment_author);
            comment_content = view.findViewById(R.id.comment_content);
        }
    }

    public CommentAdapter(List<Comment> commentList){
        mCommentList = commentList;
    }

    @Override
    public CommentAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (mContext == null)
            mContext = viewGroup.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.comment_item,viewGroup,false);
        final CommentAdapter.ViewHolder holder=new CommentAdapter.ViewHolder(view);
//        holder.cardView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view)
//            {
//                int position = holder.getAdapterPosition();
//                Comment comment = mCommentList.get(position);
//                Intent intent = new Intent(mContext,ActivityComment.class);
//                intent.putExtra("extra_data", comment.getAuthor());
//                mContext.startActivity(intent);
//            }
//        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Comment comment = mCommentList.get(position);
        holder.author.setText(comment.getAuthor());
        holder.comment_content.setText(comment.getContent());
    }

    @Override
    public int getItemCount() {
        return mCommentList.size();
    }
}
