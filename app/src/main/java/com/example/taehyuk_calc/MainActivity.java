package com.example.taehyuk_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){
                    case "":
                        break;
                }
            }
            int getNum(){return num;}
            void setNum(){this.num = num;}
        }
        final EditText num = findViewById(R.id.num);

        Button reset = findViewById(R.id.reset);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multi = findViewById(R.id.multi);
        Button division = findViewById(R.id.division);
        Button equals = findViewById(R.id.equals);
        final TextView result = findViewById(R.id.result);


        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 =Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;
                Calc c = new Calc();
                c.execute();
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("5");
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
