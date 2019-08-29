package com.app.komo.pertaminadmd.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.komo.pertaminadmd.R;

public class HistoriPengantaran extends AppCompatActivity {

    private MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histori_pengantaran);
        String activity_name = "HistoriPengantaran";

        setupNavbar(activity_name);
    }

    public void setupNavbar(final String activity_name) {
        final ConstraintLayout navigation_bar;
        final ImageView navigation_burger;
        final LinearLayout cancel_box;
        final LinearLayout nav_button_1;
        final LinearLayout nav_button_2;
        final LinearLayout nav_button_3;
        final TextView title_text;

        navigation_bar = (ConstraintLayout) findViewById(R.id.navigation_bar);
        navigation_bar.setVisibility(View.GONE);

        navigation_burger = (ImageView) findViewById(R.id.navigation_burger);
        navigation_burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation_bar.setVisibility(View.VISIBLE);
            }
        });

        cancel_box = (LinearLayout) findViewById(R.id.cancel_box);
        cancel_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation_bar.setVisibility(View.GONE);
            }
        });

        nav_button_1 = (LinearLayout)findViewById(R.id.nav_button_1);
        nav_button_2 = (LinearLayout)findViewById(R.id.nav_button_2);
        nav_button_3 = (LinearLayout)findViewById(R.id.nav_button_3);

        nav_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(activity_name.equals("MainActivity")) {
                    navigation_bar.setVisibility(View.GONE);
                } else {
                    Intent navigate = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(navigate);
                }
            }
        });
        nav_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(activity_name.equals("HistoriPengantaran")) {
                    navigation_bar.setVisibility(View.GONE);
                } else {
                    Intent navigate = new Intent(getApplicationContext(), HistoriPengantaran.class);
                    startActivity(navigate);
                }
            }
        });
        nav_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navigate = new Intent(getApplicationContext(), Login.class);
                startActivity(navigate);
            }
        });

        title_text = (TextView) findViewById(R.id.title_text);

        if(activity_name.equals("MainActivity")){
            nav_button_1.setBackgroundColor(Color.parseColor("#C42D32"));
            title_text.setText("");
        } else if (activity_name.equals("HistoriPengantaran")) {
            nav_button_2.setBackgroundColor(Color.parseColor("#C42D32"));
            title_text.setText("Histori Pengantaran");
        }
    }
}
