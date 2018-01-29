package com.som.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btnadd,btndiv,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnmul,btnequal,btnsub,btnclr,btn0;
    TextView result;
int first_num,second_num;
    String operator="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnmul=(Button)findViewById(R.id.btnmul);
        btnclr=(Button)findViewById(R.id.btnclr);
        btnequal=(Button)findViewById(R.id.btnequal);
        result=(TextView) findViewById(R.id.result);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    result.setText(result.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"0");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num=Integer.parseInt(result.getText().toString());
                operator="+";
                result.setText("0");
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num=Integer.parseInt(result.getText().toString());
                operator="-";
                result.setText("0");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num=Integer.parseInt(result.getText().toString());
                operator="*";
                result.setText("0");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_num=Integer.parseInt(result.getText().toString());
                operator="/";
                result.setText("0");
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_num=Integer.parseInt(result.getText().toString());
                switch (operator) {
                    case "+":
                        result.setText(Integer.toString( first_num + second_num));
                        break;
                    case "-":
                        result.setText(Integer.toString( first_num - second_num));
                        break;

                    case "*":
                        result.setText(Integer.toString( first_num * second_num));
                        break;
                    case "/":
                        if(second_num!=0) {
                            result.setText(Integer.toString(first_num / second_num));
                        }
                        else
                            result.setText("can't divied with Zero!!!!");
                        break;
                }

            }
        });
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            result.setText("0");
            }
        });





    }
}
