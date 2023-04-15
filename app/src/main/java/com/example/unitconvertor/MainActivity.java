package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1, b2;
        EditText e1, e2;
        final double[] res = new double[1];
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button4);
        e1 = findViewById(R.id.editTextTextPersonName3);
        e2 = findViewById(R.id.editTextTextPersonName4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res[0] = Double.parseDouble(String.valueOf(e1.getText()));
                Double result = res[0] / 1000;
                String r1 = String.valueOf(result);
                //Toast.makeText(MainActivity.this,r1+"kg",Toast.LENGTH_SHORT).show();
                e2.setText(r1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
            res[0] = Double.parseDouble(String.valueOf(e1.getText()));
            Double result = res[0] * 1000;
            String r1 = String.valueOf(result);
            //Toast.makeText(MainActivity.this,r1+"gm",Toast.LENGTH_SHORT).show();
            e2.setText(r1);
        }
    });


    }

}