
package com.sportsedge.pro;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int dp(float value) {
        return (int) (value * getResources()
            .getDisplayMetrics().density);
    }

    private TextView makeText(String text, int size) {
        TextView view = new TextView(this);
        view.setText(text);
        view.setTextSize(size);
        view.setTextColor(Color.WHITE);
        view.setPadding(dp(16), dp(12), dp(16), dp(12));
        return view;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout screen = new LinearLayout(this);
        screen.setOrientation(LinearLayout.VERTICAL);
        screen.setPadding(dp(12), dp(20), dp(12), dp(12));
        screen.setBackgroundColor(Color.rgb(12, 18, 32));

        TextView title = makeText("SPORTS EDGE PRO", 26);
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.rgb(0, 220, 160));
        screen.addView(title);

        TextView subtitle = makeText(
            "Sports analysis and match centre", 15);
        subtitle.setGravity(Gravity.CENTER);
        screen.addView(subtitle);

        screen.addView(makeText("FOOTBALL", 20));
        screen.addView(makeText(
            "Fixtures • Results • Match analysis", 15));

        screen.addView(makeText("BASKETBALL", 20));
        screen.addView(makeText(
            "Games • Scores • Team statistics", 15));

        screen.addView(makeText("LIVE DATA", 20));
        screen.addView(makeText(
            "Your sports data connection will be added next.", 14));

        screen.addView(makeText("PREDICTIONS", 20));
        screen.addView(makeText(
            "Pre-match insights and statistical analysis", 14));

        setContentView(screen);
    }
          }
          
