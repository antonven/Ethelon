package myapps.wycoco.com.ethelon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    ImageView loginBtn;
    ImageView signupBtn;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window win = getWindow();
            win.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            win.setStatusBarColor(Color.TRANSPARENT);
        }


        loginBtn = (ImageView) findViewById(R.id.loginBtn);
        signupBtn = (ImageView)findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent i = new Intent(Login.this, LeaderBoard.class);
                        startActivity(i);
                    }
                }
        );

        signupBtn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent in = new Intent(Login.this, UserProfile.class);
                        startActivity(in);
                    }
                }
        );

    }


}
