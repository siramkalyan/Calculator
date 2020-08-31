package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bequal,bdot,bclear;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        badd=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        b5=findViewById(R.id.button6);
        b6=findViewById(R.id.button7);
        bsub=findViewById(R.id.button8);
        b7=findViewById(R.id.button9);
        b8=findViewById(R.id.button10);
        b9=findViewById(R.id.button11);
        bmul=findViewById(R.id.button12);
        bdot=findViewById(R.id.button13);
        b0=findViewById(R.id.button14);
        bequal=findViewById(R.id.button15);
        bclear=findViewById(R.id.button17);
        bdiv=findViewById(R.id.button16);
        t1=findViewById(R.id.text);
        t2=findViewById(R.id.text2);
        t3=findViewById(R.id.text3);
        if (savedInstanceState!=null && savedInstanceState.containsKey("key_value")){
            ArrayList<String>s=savedInstanceState.getStringArrayList("key_value");
            t1.setText(s.get(0));
            t2.setText(s.get(1));
            t3.setText(s.get(2));

        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t2.getText().equals(""))
                {
                    t1.setText(t1.getText().toString()+"1");
                }
                else{
                    t3.setText(t3.getText().toString()+"1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "2");
                } else {
                    t3.setText(t3.getText().toString() + "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "3");
                } else {
                    t3.setText(t3.getText().toString() + "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "4");
                } else {
                    t3.setText(t3.getText().toString() + "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "5");
                } else {
                    t3.setText(t3.getText().toString() + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "6");
                } else {
                    t3.setText(t3.getText().toString() + "6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "7");
                } else {
                    t3.setText(t3.getText().toString() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "8");
                } else {
                    t3.setText(t3.getText().toString() + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "9");
                } else {
                    t3.setText(t3.getText().toString() + "9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    t1.setText(t1.getText().toString() + "0");
                } else {
                    if(t2.getText().equals("/"))
                    {
                        Drawable dr = getResources().getDrawable(R.drawable.ic_baseline_error_24);
                        //add an error icon to yur drawable files
                        dr.setBounds(0, 0, dr.getIntrinsicWidth(), dr.getIntrinsicHeight());

                        t3.setCompoundDrawables(null,null,dr,null);

                    }
                    else {
                        t3.setText(t3.getText().toString() + "0");
                    }
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t3.getText().equals(""))
                {
                    t2.setText("+");
                }
                else{
                    dofunction();
                    t2.setText("+");
                    t3.setText("");
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t3.getText().equals(""))
                {
                    t2.setText("-");
                }
                else{
                    dofunction();
                    t2.setText("-");
                    t3.setText("");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t3.getText().equals(""))
                {
                    t2.setText("*");
                }
                else{
                    dofunction();
                    t2.setText("*");
                    t3.setText("");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t3.getText().equals(""))
                {
                    t2.setText("/");

                }
                else{
                    dofunction();
                    t2.setText("/");
                    t3.setText("");
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dofunction();
                t2.setText("");
                t3.setText("");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t2.getText().equals("")) {
                    if(t1.getText().toString().equals(""))
                    {
                        t1.setText("0"+".");
                    }
                    else {
                        t1.setText(t1.getText().toString() + ".");
                    }
                } else {
                    if(t3.getText().toString().equals(""))
                    {
                        t3.setText("0"+".");
                    }
                    else {
                        t3.setText(t3.getText().toString() + ".");
                    }
                }
            }
        });
    }
    public void dofunction()
    {
        if(t2.getText().equals("+"))
        {
            t1.setText(String.valueOf(Float.parseFloat(t1.getText()+"")+Float.parseFloat(t3.getText()+"")));
        }
        else if(t2.getText().equals("-"))
        {
            t1.setText(String.valueOf(Float.parseFloat(t1.getText()+"")-Float.parseFloat(t3.getText()+"")));
        }
        else if(t2.getText().equals("*"))
        {
            t1.setText(String.valueOf(Float.parseFloat(t1.getText()+"")*Float.parseFloat(t3.getText()+"")));
        }
        else{
            t1.setText(String.valueOf(Float.parseFloat(t1.getText()+"")/Float.parseFloat(t3.getText()+"")));
        }
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        ArrayList<String>s=new ArrayList();
        s.add(t1.getText().toString());
        s.add(t2.getText().toString());
        s.add(t3.getText().toString());
       outState.putStringArrayList("key_value",s);


    }
}