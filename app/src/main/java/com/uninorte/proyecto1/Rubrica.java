package com.uninorte.proyecto1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Rubrica extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener

    {

        private ViewGroup layoutCat;
        private int iCat = 1;

        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rubrica);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        layoutCat = (ViewGroup) findViewById(R.id.contentRub);
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.boton);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    iCat++;
                    add(R.layout.activity_content_rubrica, "Elemento " + iCat, layoutCat);

                }
            });

        }



    void add(int id, String msg, ViewGroup layout) {
        LayoutInflater inflater = LayoutInflater.from(this);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(id, null, false);

        EditText editText = (EditText) linearLayout.findViewById(R.id.editText);
        EditText editText2 = (EditText) linearLayout.findViewById(R.id.editText3);
        Button boton = (Button) linearLayout.findViewById(R.id.button);
        editText.setText(msg);
        layout.addView(linearLayout);
    }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return false;
        }
    }
