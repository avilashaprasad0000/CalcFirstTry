package com.example.try3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,op1,op2,op3,op4,eq,bd2,clr;
    final char ADD = '+';
    final char SUB = '-';
    final char MUL = '*';
    final char DIV = '/';
    final char EQU = 0;
    char ACTION;


    double num1= Double.NaN;
    //double num1=0.0;
    double num2;

    void fun()
    {
        if(!Double.isNaN(num1)){
            num2=Double.parseDouble(tv2.getText().toString());
            switch (ACTION){
                case ADD:
                    num1=num1+num2;
                    break;
                case SUB:
                    num1=num1-num2;
                    break;
                case MUL:
                    num1=num1*num2;
                    break;
                case DIV:
                    num1=num1/num2;
                    break;
                case EQU:
                    break;
            }


        }
        else{
            num1=Double.parseDouble(tv2.getText().toString());
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.ctv1);
        tv2 = findViewById(R.id.ctv2);
        b1 = findViewById(R.id.cb1);
        b2 = findViewById(R.id.cb2);
        b3 = findViewById(R.id.cb3);
        b4 = findViewById(R.id.cb4);
        b5 = findViewById(R.id.cb5);
        b6 = findViewById(R.id.cb6);
        b7 = findViewById(R.id.cb7);
        b8 = findViewById(R.id.cb8);
        b9 = findViewById(R.id.cb9);
        b0 = findViewById(R.id.cb0);
        op1 = findViewById(R.id.cop1);
        op2 = findViewById(R.id.cop2);
        op3 = findViewById(R.id.cop3);
        op4 = findViewById(R.id.cop4);
        eq = findViewById(R.id.ceq);
        bd2 = findViewById(R.id.cbd2);
        clr = findViewById(R.id.cclr);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"1");
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"2");
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"3");
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"4");
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"5");
            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"6");
            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"7");
            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"8");
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"9");
            }

        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText().toString()+"0");
            }

        });

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                ACTION=ADD;
                tv2.setText(String.valueOf(num1)+"+");
                tv1.setText(null);
            }

        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                ACTION=SUB;
                tv2.setText(String.valueOf(num1)+"-");
                tv1.setText(null);
            }

        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                ACTION=MUL;
                tv2.setText(String.valueOf(num1)+"*");
                tv1.setText(null);
            }

        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                ACTION=DIV;
                tv2.setText(String.valueOf(num1)+"/");
                tv1.setText(null);
            }

        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun();
                ACTION=EQU;
                tv2.setText(tv2.getText().toString()+(num2)+String.valueOf(num1));
                tv1.setText(null);
            }

        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Double.NaN;
                num2= Double.NaN;
                tv1.setText(null);
                tv2.setText(null);
            }

        });

    }
}
