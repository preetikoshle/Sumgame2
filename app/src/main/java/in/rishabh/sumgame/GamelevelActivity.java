package in.rishabh.sumgame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class GamelevelActivity extends AppCompatActivity {
    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamelevel);

        layout1 = findViewById(R.id.easy);
        layout2 = findViewById(R.id.medium);
        layout3 = findViewById(R.id.hard);
        getSupportActionBar().hide();

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent("easy");
                clickeffect();
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent("medium");
                clickeffect();
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent("hard");
                clickeffect();
            }
        });


    }


    public void intent(String level) {
        Intent intent = new Intent(getApplicationContext(), GameActivity.class);
        intent.putExtra("level", level);
        startActivity(intent);
    }




    public void clickeffect(){
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cllickeffect);

        mediaPlayer.start();


    }
}
