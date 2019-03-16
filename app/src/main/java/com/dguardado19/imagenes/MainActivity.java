package com.dguardado19.imagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button b1, b2,b3,b4,b5,b6,b7,b8,b9;
    private ArrayList<Integer> img = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img.add(R.drawable.uno);
        img.add(R.drawable.dos);
        img.add(R.drawable.tres);
        img.add(R.drawable.cuatro);
        img.add(R.drawable.cinco);
        img.add(R.drawable.seis);
        img.add(R.drawable.siete);
        img.add(R.drawable.ocho);
        img.add(R.drawable.nueve);
        img.add(R.drawable.dies);
        img.add(R.drawable.once);

        b1 = findViewById(R.id.boton1);
        b2 = findViewById(R.id.boton2);
        b3 = findViewById(R.id.boton3);
        b4 = findViewById(R.id.boton4);
        b5 = findViewById(R.id.boton5);
        b6 = findViewById(R.id.boton6);
        b7 = findViewById(R.id.boton7);
        b8 = findViewById(R.id.boton8);
        b9 = findViewById(R.id.boton9);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int foto = v.getId();
        int n= (int)(Math.random()*10);
        switch(foto){
            case R.id.boton1:
                b1.setBackgroundResource(img.get(n));
                break;
            case R.id.boton2:
                b2.setBackgroundResource(img.get(n));
                break;
            case R.id.boton3:
                b3.setBackgroundResource(img.get(n));
                break;
            case R.id.boton4:
                b4.setBackgroundResource(img.get(n));
                break;
            case R.id.boton5:
                b5.setBackgroundResource(img.get(n));
                break;
            case R.id.boton6:
                b6.setBackgroundResource(img.get(n));
                break;
            case R.id.boton7:
                b7.setBackgroundResource(img.get(n));
                break;
            case R.id.boton8:
                b8.setBackgroundResource(img.get(n));
                break;
            case R.id.boton9:
                b9.setBackgroundResource(img.get(n));
                break;
        }
    }
}
