package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SceneryFragment extends android.support.v4.app.Fragment   {

    //Initialize the array of Scenic Views;

    //public static   ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();
    public static   ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();
    private ArrayOfScenicViews arrayOfScenicViews;
    private int selectedResourceId;

    public SceneryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sceniclist_layout, container,false);

        //Using intent to get data
        // Intent intent = getActivity().getIntent();
        //Bundle scenicListReceived = intent.getExtras();
        // ArrayList<ScenicView> scenicViews = (ArrayList<ScenicView>) scenicListReceived.getSerializable("scenicList");

        //Get ArrayList from fragment manager
        //ArrayList<ScenicView> scenicViews = (ArrayList<ScenicView>) getArguments().getSerializable("scenicList");

        //Get Arraylist thru Placeholder
        //Bundle bundle = getArguments();
        //Serializable scenicViews = (ArrayList<ScenicView>) bundle.getSerializable("scenicList");

        // Get the array of scenic views from ArrayOfScenicView class
        //ArrayOfScenicViews arrayOfScenicViews = new ArrayOfScenicViews;
        //arrayOfScenicViews = new ArrayOfScenicViews(getActivity());
        // scenicViews = arrayOfScenicViews.getScenicViews();


        final ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();

        scenicViews.add(new ScenicView("San Francisco, California", "The City by the Bay", "City", "San Francisco, in northern California, is a hilly city on the tip of a peninsula surrounded by the Pacific Ocean and San Francisco Bay. It's known for its year-round fog, iconic Golden Gate Bridge, cable cars and colorful Victorian houses. The Financial District's Transamerica Pyramid is its most distinctive skyscraper. In the bay sits Alcatraz Island, site of the notorious former prison."));
        scenicViews.add(new ScenicView("View of the City Hall", "SanFrancico, California", "City", "The City Hall and nearby buildings", R.drawable.sfcity_1 ));
        scenicViews.add(new ScenicView("City by the Bay", "A Popular Tourist Destination", "City", "San Francisco is known for its cool summers, fog, steep rolling hills, eclectic mix of architecture and landmarks, including the Golden Gate Bridge, cable cars, the former Alcatraz Federal Penitentiary, Fisherman's Wharf, and its Chinatown district. San Francisco is also the headquarters of five major banking institutions and various other companies such as Levi Strauss & Co., Gap Inc., Fitbit, Salesforce.com, Dropbox, Reddit, Square, Inc., Dolby, Airbnb, Weebly, Pacific Gas and Electric Company, Yelp, Pinterest, Twitter, Uber, Lyft, Mozilla, Wikimedia Foundation, Craigslist, and Weather Underground. It is home to a number of educational and cultural institutions, such as the University of San Francisco (USF), University of California, San Francisco (UCSF), San Francisco State University (SFSU), the De Young Museum, the San Francisco Museum of Modern Art, and the California Academy of Sciences.-Wikipedia" ));
        scenicViews.add(new ScenicView("View the City taken from the Bay", "San Francisco, California", "City", "View of the City from the bay", R.drawable.sfcity_2 ));
        scenicViews.add(new ScenicView("Golden Gate City", "San Francisco, California", "City", "San Francisco has several nicknames, including \"The City by the Bay\", \"Golden Gate City\", \"Frisco\", \"SF\", \"San Fran\", and \"Fog City\", as well as older ones like \"The City that Knows How\", \"Baghdad by the Bay\", \"The Paris of the West\", or, as locals call it, \"The City\". As of 2017, San Francisco is ranked high on world liveability rankings. - Wikipedia"));
        scenicViews.add(new ScenicView("Inside the City", "San Francisco, California", "City", "Glass covered bulidings within the City", R.drawable.sfcity_3));
        scenicViews.add(new ScenicView("Scene Along the Bay", "San Francisco, California", "City", "The bridge", R.drawable.sfcity_4));
        scenicViews.add(new ScenicView("TransAmerica", "San Francisco, California", "City", "TransAmerica view from afar", R.drawable.sfcity_5 ));
        scenicViews.add(new ScenicView("Another View of the City", "San Francisco, California", "City", "The City viewed near Fisherman's Wharf", R. drawable.sfcity_6 ));
        scenicViews.add(new ScenicView("San Francisco along the Bay", "San Francisco, California", "City", "The City viewd from Pier 39", R. drawable.sfcity_7 ));
        scenicViews.add(new ScenicView("The City by the Bay", "San Francisco, California", "City", "The Golden Gate", R. drawable.sfcity_2 ));



        ScenicViewAdapter scenicViewAdapter = new ScenicViewAdapter(getActivity(), (ArrayList<ScenicView>) scenicViews, R.color.sceneType_scenery);

        ListView listView=(ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(scenicViewAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "List item clicked", Toast.LENGTH_SHORT).show();

                ScenicView scenicView = scenicViews.get(position);

                selectedResourceId = scenicView.getSceneResourceId();

                Intent intent = new Intent(getActivity(), ExpandedViewActivity.class);
                intent.putExtra("mSelectedResourceId", selectedResourceId);

                if (scenicView.hasImage()){
                    startActivity(intent);
                }else{
                    return;
                }

            }
        });

        return rootView;
    }
}
