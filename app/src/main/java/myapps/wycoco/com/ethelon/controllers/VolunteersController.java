package myapps.wycoco.com.ethelon.controllers;

import myapps.wycoco.com.ethelon.R;
import myapps.wycoco.com.ethelon.models.Volunteers;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 11/19/2016.
 */

public class VolunteersController {

    private List<Volunteers> mVolunteers;

    public VolunteersController(){
        mVolunteers = new ArrayList<>();
    }

    public List<Volunteers> getVolunteers(){

        mVolunteers = new ArrayList<>();
        mVolunteers.add(new Volunteers("Anton Ven Wycoco", "1000 points", R.drawable.numbertwo, R.drawable.e, R.drawable.anton));
        mVolunteers.add(new Volunteers("Rowan Atkinson", "800 points", R.drawable.numberthree, R.drawable.ee, R.drawable.meme));
        mVolunteers.add(new Volunteers("Charles Cruz", "729 points", R.drawable.numberfour, R.drawable.ee, R.drawable.second));
        mVolunteers.add(new Volunteers("Kristian Francisco", "700 points", R.drawable.numberfive, R.drawable.ee, R.drawable.leader));
        mVolunteers.add(new Volunteers("Kobe Relativo", "600 points", R.drawable.numberfive, R.drawable.ee, R.drawable.meme));
        mVolunteers.add(new Volunteers("Mark Antonino", "500 points", R.drawable.e, R.drawable.ee, R.drawable.meme));

        return mVolunteers;
    }
}
