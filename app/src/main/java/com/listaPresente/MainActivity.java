package com.listaPresente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttomCreateGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancia
        buttomCreateGift = findViewById(R.id.button_add);

        //Listener
        buttomCreateGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

// An Activity cannot call another activity, you need to ask the Application Android (O.S.) to do it
// Use >>Intent<< to call an activity from another activity

                // Use >>Intent<< to call an activity from another activity
                Intent intent = new Intent(getApplicationContext(),CreateGiftActivity.class);
                //Intent uses 2 parameters: ApplicationContext and class

                startActivity(intent);
            }
        });
    }
}
