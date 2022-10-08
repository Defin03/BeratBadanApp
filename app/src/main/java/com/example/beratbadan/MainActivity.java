package com.example.beratbadan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edbb,edTinggi,edimt,edket;
    Button bthitung;
    Double vbb,vTinggi,vimt;
    String vket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edbb =(EditText)findViewById(R.id.edbb);
        edTinggi =(EditText)findViewById(R.id.edTinggi);
        edimt =(EditText)findViewById(R.id.edimt);
        edket =(EditText)findViewById(R.id.edket);
        bthitung =(Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view) {
        vbb = Double.parseDouble(edbb.getText().toString());
        vTinggi = Double.parseDouble(edTinggi.getText().toString());

        vimt =vbb / ((vTinggi/100)*(vTinggi/100));

        if (vimt <18.5){
            vket = "Berat Badan Kurang";
        }
        else if (vimt >=18.5 && vimt < 25){
            vket = "Berat Badan Ideal";
        }

        else if (vimt >=25 && vimt < 30){
            vket = "Berat Badan berlebih";
        }
        else {
            vket = "Sangat Gemuk, Anda Harus Diet";
        }
        edimt.setText(""+vimt);
        edket.setText(""+vket);

    }
}