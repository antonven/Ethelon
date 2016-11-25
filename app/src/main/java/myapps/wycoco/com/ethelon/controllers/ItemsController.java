package myapps.wycoco.com.ethelon.controllers;

import java.util.ArrayList;
import java.util.List;

import myapps.wycoco.com.ethelon.R;
import myapps.wycoco.com.ethelon.models.UnlockableItems;
import myapps.wycoco.com.ethelon.models.Volunteers;

/**
 * Created by dell on 11/26/2016.
 */

public class ItemsController {

    private List<UnlockableItems> mItems;

    public ItemsController(){
        mItems = new ArrayList<>();
    }

    public List<UnlockableItems> getItems(){

        mItems = new ArrayList<>();
        mItems.add(new UnlockableItems(R.drawable.notebook, "Notebook", "5 points"));


        return mItems;
    }
}
