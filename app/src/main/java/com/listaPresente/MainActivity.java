package com.listaPresente;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.listaPresente.adapter.GiftAdapter;
import com.listaPresente.model.Gift;
import com.listaPresente.repository.GiftRepository;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttomCreateGift;
    private RecyclerView recyclerViewGifts;
    private TextView Text_notFound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Gift> gifts = GiftRepository.getInstance().getAll();

        //Instancia
        buttomCreateGift = findViewById(R.id.button_add);
        recyclerViewGifts = findViewById(R.id.recycler_gifts);
        Text_notFound = findViewById(R.id.Text_notFound);

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

    @Override
    protected void onResume() {
        super.onResume();

        ArrayList<Gift> gifts = GiftRepository.getInstance().getAll();

        if(gifts.size() > 0) {
            Text_notFound.setVisibility(View.INVISIBLE);
        }else{
            Text_notFound.setVisibility(View.VISIBLE);
        }

        recyclerViewGifts.setAdapter(new GiftAdapter());
    }
}
