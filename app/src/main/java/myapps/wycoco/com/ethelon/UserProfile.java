package myapps.wycoco.com.ethelon;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;



public class UserProfile extends AppCompatActivity implements View.OnClickListener {

    ImageView profImage;
    TextView profName;
    TextView profEmail;
    ImageView editProf;
    ImageView profPoints;
    ImageView profPortfolio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_user_profile);

        profImage = (ImageView)findViewById(R.id.volunteerImage);
        profName = (TextView) findViewById(R.id.profName);
        profEmail = (TextView) findViewById(R.id.profEmail);
        profPoints = (ImageView)findViewById(R.id.profPoints);
//        UserProfileController profController = new UserProfileController();
//        ProfilesAdapter adapter = new ProfilesAdapter(this, R.layout.activity_user_profile, profController.getmProfiles());

        profPoints.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, UnlockItems.class);
        startActivity(i);
    }
}
