package myapps.wycoco.com.ethelon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import myapps.wycoco.com.ethelon.adapters.UnlockablesAdapter;
import myapps.wycoco.com.ethelon.adapters.VolunteersAdapter;
import myapps.wycoco.com.ethelon.controllers.ItemsController;
import myapps.wycoco.com.ethelon.controllers.VolunteersController;

public class UnlockItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_unlock_items);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        ItemsController controller = new ItemsController();
        UnlockablesAdapter adapter = new UnlockablesAdapter(this, R.layout.list_item_unlockables, controller.getItems());
        gridView.setAdapter(adapter);
    }
}
