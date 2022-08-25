package com.listaPresente;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.listaPresente.model.Gift;

public class CreateGiftActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutName;
    private TextInputLayout inputLayoutGift;
    private TextInputLayout inputLayoutDescription;

    private TextInputEditText inputEditTextName;
    private TextInputEditText inputEditTextGift;
    private TextInputEditText inputEditTextDescription;

    private Button buttonCreateGift;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_gift);

        //Instances
        inputLayoutName = findViewById(R.id.InputLayoutName);
        inputLayoutGift = findViewById(R.id.InputLayoutGift);
        inputLayoutDescription = findViewById(R.id.InputLayoutDescription);

        inputEditTextName = findViewById(R.id.InputTextName);
        inputEditTextGift = findViewById(R.id.InputTextGift);
        inputEditTextDescription = findViewById(R.id.InputLayoutDescription);

        buttonCreateGift = findViewById(R.id.button);

        //Listener
        buttonCreateGift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveGift();
            }
        });
    }
    private void saveGift(){
        String name = inputEditTextName.getText().toString();
        String giftName = inputEditTextGift.getText().toString();
        String description = inputEditTextDescription.getText().toString();

        Gift gift = new Gift(name, giftName, description);
    }
}


