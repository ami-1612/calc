package com.rwn.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,plus,minus,multi,ac,equal,division;
    TextView text_num;
    int fy,sy;
    char ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac=findViewById(R.id.ac);
        division=findViewById(R.id.division);
        equal=findViewById(R.id.equal);
        multi=findViewById(R.id.multi);
        minus=findViewById(R.id.sub);
        plus=findViewById(R.id.add);
        b1=findViewById(R.id.Button1);
        b2=findViewById(R.id.Button2);
        b3=findViewById(R.id.Button3);
        b4=findViewById(R.id.Button4);
        b5=findViewById(R.id.Button5);
        b6=findViewById(R.id.Button6);
        b7=findViewById(R.id.Button7);
        b8=findViewById(R.id.Button8);
        b9=findViewById(R.id.Button9);
        b0=findViewById(R.id.Button0);
        b00=findViewById(R.id.Button00);

        text_num.setText("");

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_num.setText("");

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ope == '+') {
                    sy = Integer.parseInt(text_num.getText().toString());
                    plus();
                }else if(ope == '-'){
                    sy = Integer.parseInt(text_num.getText().toString());
                    minus();
                }else if(ope == '*'){
                    sy = Integer.parseInt(text_num.getText().toString());
                    multi();
                }else if(ope == '/'){
                    sy = Integer.parseInt(text_num.getText().toString());
                    division();
                }
            }

            private void multi() {
            }

            private void plus() {
            }

            private void division() {
            }

            private void minus() {
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fy = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '+';
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fy = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '-';
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fy = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '*';
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fy = Integer.parseInt(text_num.getText().toString());
                text_num.setText("");
                ope = '/';
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = text_num.getText().toString();
                text_num.setText(num+"00");
            }
        });

    }
    private void add() {
        int sum = fy + sy;
        text_num.setText(sum + "");

    }
    private void Minus() {
        int sum = fy - sy;
        text_num.setText(sum + "");

    }
    private void Multi() {
        int sum = fy * sy;
        text_num.setText(sum + "");

    }
    private void Division() {
        int sum = fy / sy;
        text_num.setText(sum + "");

    }
}