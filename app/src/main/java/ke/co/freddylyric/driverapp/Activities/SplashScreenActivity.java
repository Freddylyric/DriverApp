package ke.co.freddylyric.driverapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ke.co.freddylyric.driverapp.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    Animation topAnimation, bottomAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //ImageView logo = findViewById(R.id.logo);
        TextView title = findViewById(R.id.title);
        TextView slogan = findViewById(R.id.slogan);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

       // logo.setAnimation(topAnimation);
        title.setAnimation(bottomAnimation);
        slogan.setAnimation(bottomAnimation);

        int SPLASH_SCREEN = 4300;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }

        },SPLASH_SCREEN);

    }
}
