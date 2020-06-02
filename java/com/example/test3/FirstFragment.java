package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment
{
    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container,
                              Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_first,container,
                false);

        Intent detailUserInformation=getActivity().getIntent();
        User user= (User) detailUserInformation.getSerializableExtra("userInformation");
        String userName=user.getName();
        String password=user.getPassword();

        TextView detailUserName = view.findViewById(R.id.detail_username);
        //TextView detailPassword = view.findViewById(R.id.detail_password);

        detailUserName.setText(userName);
        //detailPassword.setText(password);

        Button logoutButton = view.findViewById(R.id.logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), loginActivity.class);
                        view.getContext().startActivity(intent);
                        getActivity().finish();
                    }
                }
        );


            Button manageArticleButton = view.findViewById(R.id.my_article);
            manageArticleButton.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View view) {
                                                           if(MainActivity.userName.equals("Visitor"))
                                                           {
                                                               Toast.makeText(view.getContext(),"请登录后查看", Toast.LENGTH_SHORT).show();
                                                           }
                                                           else{
                                                               Intent intent = new Intent(view.getContext(), ArticleManagement.class);
                                                               view.getContext().startActivity(intent);
                                                           }

                                                       }
                                                   }
            );

            Button collectionButton = view.findViewById(R.id.my_favorite);
            collectionButton.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        if(MainActivity.userName.equals("Visitor"))
                                                        {
                                                            Toast.makeText(view.getContext(),"请登录后查看", Toast.LENGTH_SHORT).show();
                                                        }
                                                        else {
                                                            Intent intent = new Intent(view.getContext(), ArticleCollection.class);
                                                            view.getContext().startActivity(intent);
                                                        }

                                                    }
                                                }
            );


        return view;

    }


}
