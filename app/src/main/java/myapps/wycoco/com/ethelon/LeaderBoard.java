package myapps.wycoco.com.ethelon;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import myapps.wycoco.com.ethelon.adapters.VolunteersAdapter;
import myapps.wycoco.com.ethelon.controllers.VolunteersController;
import myapps.wycoco.com.ethelon.models.Volunteers;


public class LeaderBoard extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_leader_board);


        ListView listView = (ListView)findViewById(R.id.listView);
        VolunteersController controller = new VolunteersController();
        VolunteersAdapter adapter = new VolunteersAdapter(this, R.layout.list_item_volunteers, controller.getVolunteers());
        listView.setAdapter(adapter);


    }


}
