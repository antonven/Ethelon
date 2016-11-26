package myapps.wycoco.com.ethelon;


import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import myapps.wycoco.com.ethelon.adapters.VolunteersAdapter;
import myapps.wycoco.com.ethelon.controllers.VolunteersController;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeaderboardFragment extends Fragment {
    ConstraintLayout constraintLayout;

    @SuppressWarnings("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.id.fragment_leaderboard, container, false);
        constraintLayout = (ConstraintLayout)rootView.findViewById(R.id.activity_leader_board);
        ListView lv = (ListView)rootView.findViewById(R.id.listView);
        VolunteersController vc = new VolunteersController();
        VolunteersAdapter va = new VolunteersAdapter(rootView.getContext(), R.layout.list_item_volunteers, vc.getVolunteers());
        lv.setAdapter(va);
        // Inflate the layout for this fragment
        return rootView;
    }

}
