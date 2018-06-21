package com.example.android.tourguideapp;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ScenicViewAdapter extends ArrayAdapter<ScenicView> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public ScenicViewAdapter(Activity context, ArrayList<ScenicView> scenicViews, int colorResourceId) {
        super(context, 0, scenicViews);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.scenicview_adapter_layout,parent,false);
        }
        // Get the {@link ScenicView} object located at this position in the list
        ScenicView currentScene = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_texView);
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_texView);
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textView);
        ImageView imageResource = (ImageView) listItemView.findViewById(R.id.imageResource);
        ImageView expandButton = (ImageView) listItemView.findViewById(R.id.expand_button);
        CardView cardView = (CardView) listItemView.findViewById(R.id.card_view);
        // Get the version name from the current view object and
        // set this text on the name View
        titleTextView.setText(currentScene.getSceneTitle());
        locationTextView.setText(currentScene.getSceneLocation());
        descriptionTextView.setText(currentScene.getSceneDescription());

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        if (currentScene.hasImage()){
            //Set the imageView to the image resource specified in the current Word
            imageResource.setImageResource(currentScene.getSceneResourceId());
            //Make sure the view is visible
            imageResource.setVisibility(View.VISIBLE);
            expandButton.setVisibility(View.VISIBLE);
            titleTextView.setTextSize(14);
            titleTextView.setGravity(View.TEXT_ALIGNMENT_TEXT_START);
            locationTextView.setGravity(View.TEXT_ALIGNMENT_TEXT_START);
            descriptionTextView.setGravity(View.TEXT_ALIGNMENT_TEXT_START);
            cardView.setRadius(20);
            cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
        }else{
            imageResource.setVisibility(View.GONE);
            expandButton.setVisibility(View.GONE);
            titleTextView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            titleTextView.setTextSize(20);
            locationTextView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            descriptionTextView.setGravity(View.TEXT_ALIGNMENT_GRAVITY);
            cardView.setRadius(0);

            //cardView.setCardBackgroundColor(Color.parseColor("#FFE0B2"));
            cardView.setCardBackgroundColor(color);
        }

        //Set the theme color for the list item
       // View cardViewContainer = listItemView.findViewById(R.id.card_view);
        //View playicon = listItemView.findViewById(R.id.play_icon);
        //Find color that the resource ID maps to
        //int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Find the background color of the text container View
        //cardViewContainer.setBackgroundColor(color);
       // playicon.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;


    }
}
