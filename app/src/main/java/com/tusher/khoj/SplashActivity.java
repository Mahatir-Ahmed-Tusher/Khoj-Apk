/**
 * Khoj Android App
 * Built by Mahatir Ahmed Tusher
 * Website: https://www.khoj-bd.com/
 */

package com.tusher.khoj;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TextView splashText = findViewById(R.id.splash_text);
        TextView splashSubtitle = findViewById(R.id.splash_subtitle);
        
        // Built by Mahatir Ahmed Tusher: Applying custom font
        try {
            Typeface typeface = ResourcesCompat.getFont(this, R.font.tirobangla_regular);
            if (typeface != null) {
                splashText.setTypeface(typeface, Typeface.BOLD);
                splashSubtitle.setTypeface(typeface, Typeface.NORMAL);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        LinearLayout logoContainer = findViewById(R.id.logo_container);
        Animation mainAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        logoContainer.startAnimation(mainAnimation);

        // Built by Mahatir Ahmed Tusher: Smooth fade-in animation for subtitle
        splashSubtitle.animate()
                .alpha(1f)
                .setDuration(1500)
                .setStartDelay(800)
                .start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        }, 3500); // 3.5 seconds to allow full animation play
    }
}