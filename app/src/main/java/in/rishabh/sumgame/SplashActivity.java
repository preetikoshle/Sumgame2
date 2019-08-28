package in.rishabh.sumgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();


        Handler handle = new Handler();
     handle.postDelayed(new Runnable() {
         @Override
         public void run() {
             finish();
             Intent intent =new Intent(getApplicationContext(),StartpageActivity.class);
             startActivity(intent);
         }
     },3000);

    }
}
