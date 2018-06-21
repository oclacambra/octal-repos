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
public class DinersFragment extends Fragment {


    //Initialize the array of Scenic Views;

    //public static   ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();
    public static   ArrayList<ScenicView> scenicViews = new ArrayList<ScenicView>();
    private ArrayOfScenicViews arrayOfScenicViews;
    private int selectedResourceId;

    public DinersFragment() {
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

        scenicViews.add(new ScenicView("Bubba Gump Shrimp Co", "39 Piers Box M-211, San Francisco CA 94133", "Diners", "Family-friendly chain for seafood & American fare served in a fishing-boat-themed setting." ));
        scenicViews.add(new ScenicView("Wipeout Bar & Grill", "Pier 39, A-02, San Francisco CA 94133", "Diners", "Surfboard art & global eats like burgers & burritos lend this waterfront spot a surf-shack vibe" ));
        scenicViews.add(new ScenicView("Swiss Louis Italian & Seafood", "2 Pier 39, San Francisco CA 94133", "Diners", "Waterfront establishment serving pastas, pizzas & fish specialties at Pier 39 since 1936" ));
        scenicViews.add(new ScenicView("Pier Market", "Pier 39, San Francisco CA 94133", "Diners", "Waterfront seafood restaurant & market offering fresh fish, pation seating & bay views at Pier 39." ));
        scenicViews.add(new ScenicView("Eagle Cafe", "Pier 39, Space A-201, San Francisco CA 94133", "Diners", "Waterside eatery serving seafood & American classics to Fishermans Wharf visitors since 1928." ));
        scenicViews.add(new ScenicView("Chica", "120 Green St, North Beach/Telegraph Hill", "Diners", "Mexican American" ));
        scenicViews.add(new ScenicView("Hard Rock Cafe", "256 Pier 39, San Francisco CA 94133", "Diners", "Pock n Roll - themed chain with high-energy vide serving burgers & American classics." ));
        scenicViews.add(new ScenicView("The Hook", "Pier 39, San Francisco CA 94133", "Diners", "Fish n Chips, crab cakes & chowder in a bread bowl are among the seafood classics on the menu." ));
        scenicViews.add(new ScenicView("Scoma's Restaurant", "1965 Al Scoma Way, San Francisco CA 94133", "Diners", "Spacious waterfront restaurant serving seafood pulled straight off the boat" ));
        scenicViews.add(new ScenicView("Fog Harbor Fish House", "Pier 39, Ste A-202, North Beach/Telegraph Hill", "Diners", "Seafood, Bars"));
        scenicViews.add(new ScenicView("Coqueta", "The Embarcader, Pier 5, Embarcadero", "Diners", "Spanish, Tapas/Small Plates"));
        scenicViews.add(new ScenicView("The Bear & Monarch", "222 Sansome St, Finacial District", "Diners", "American(New)"));
        scenicViews.add(new ScenicView("Barbacco", "220 California St, Financial District", "Diners", "Italian, Bars" ));
        scenicViews.add(new ScenicView("Kokkari Estiatorio", "200 Jackson St, Finacial Dristrict", "Diners", "Greek, Mediterranean" ));
        scenicViews.add(new ScenicView("The House", "1230 Grant Ave, North Beach/Telegraph Hill", "Diners", "Asian Fusion" ));
        scenicViews.add(new ScenicView("International Smoke", "301 Mission St, Financial District", "Diners", "Barbeque, Smokehouse, bars" ));
        scenicViews.add(new ScenicView("La Mar Cebicheria Peruana", "Pier 1 1/2 The Embarcadero, Embarcadero", "Diners", "Latin American, Seafood, Peruvian" ));
        scenicViews.add(new ScenicView("Hog Island Oyster Co", "a Ferry Bldg, Shopp 11, Embarcadero", "Diners", "Seafood, Seafood Market, Live/Raw Food" ));
        scenicViews.add(new ScenicView("Wayfare Tavern", "558 Sacramento St, Financial District", "Diners", "American (Traditional)"));
        scenicViews.add(new ScenicView("5A5 Steak Lounge", "224 Jackson St, Finacial District", "Diners", "Steakhouse, Bars"));
        scenicViews.add(new ScenicView("Original Goe's", "601 Union St, North Beach/Telegraph Hill", "Diners", "Italian, Steakhouse"));
        scenicViews.add(new ScenicView("RM 212", "690 Sacramento St, Finacial District", "Diners", "Tapas Bars, Lounges, Asian Fusion" ));
        scenicViews.add(new ScenicView("Tacorea", "809 Bush St, Union Square", "Diners", "Mexican, Korean, Latin American" ));
        scenicViews.add(new ScenicView("Chica", "120 Green St, North Beach/Telegraph Hill", "Diners", "Mexican American" ));
        scenicViews.add(new ScenicView("Crab House at Pier 39", "203 Pier 39, San Francisco , CA", "Diners", "Seafood, Crabs" ));
        scenicViews.add(new ScenicView("Hana Zen", "Pier 39 M209 Beach St, San Francisco, CA", "Diners", "Sushi, yakitori(skewers) & other Japanese specialties plus a full bar & sake cocktails on the pier." ));
        scenicViews.add(new ScenicView("Chica", "120 Green St, North Beach/Telegraph Hill", "Diners", "Mexican American" ));


        ScenicViewAdapter scenicViewAdapter = new ScenicViewAdapter(getActivity(), (ArrayList<ScenicView>) scenicViews, R.color.sceneType_diners);

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
