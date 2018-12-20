package com.example.kitchenadventures;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class RestaurantFragment extends Fragment {

    private int x;
    private Button buttonRandomize;
    public static final String EXTRA_RESTAURANTID = "restaurantId";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);
        buttonRandomize = rootView.findViewById(R.id.button_restaurant);

        setListeners();
        return rootView;
    }

    private void setListeners() {
        buttonRandomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Restaurant.class);
                intent.putExtra(RestaurantFragment.EXTRA_RESTAURANTID, randomize());
                startActivity(intent);
            }
        });
    }

    private int randomize() {
        x = (int) (Math.random() * 5);
        if(x == 0){
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else if (x == 2){
            return 2;
        }
        else if (x == 3){
            return 3;
        }
        else {
            return 4;
        }
    }
}


