package com.example.calcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six ,seven,eight,nine,zero,add,subtract,multiply,divide,mode,cancel,
            dot,equal;
    TextView edittext, ans;
    double input1,input2;
    boolean mAddition, mSubtract, mMultiplication, mDivision , mmode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        mode = (Button) findViewById(R.id.mode);
        dot = (Button) findViewById(R.id.dot);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);

        edittext = (TextView) findViewById(R.id.edittext);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "7");
            }
        });eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "8");
            }
        });nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "9");
            }
        });zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + "0");
            }
        });dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText(edittext.getText() + ".");
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null){
                    edittext.setText("");
                }else {
                    input1 = Float.parseFloat(edittext.getText() + "");
                    mAddition = true;
                    edittext.setText(null);
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null){
                    edittext.setText("");
                }else {
                    input1 = Float.parseFloat(edittext.getText() + "");
                    mSubtract = true;
                    edittext.setText(null);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null){
                    edittext.setText("");
                }else {
                    input1 = Float.parseFloat(edittext.getText() + "");
                    mMultiplication = true;
                    edittext.setText(null);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null){
                    edittext.setText("");
                }else {
                    input1 = Float.parseFloat(edittext.getText() + "");
                    mDivision = true;
                    edittext.setText(null);
                }
            }
        });
        mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edittext == null){
                    edittext.setText("");
                }else {
                    input1 = Float.parseFloat(edittext.getText() + "");
                    mmode = true;
                    edittext.setText(null);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2 = Float.parseFloat(edittext.getText() + "");

                if (mAddition == true){

                    edittext.setText(input1 + input2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    edittext.setText(input1 - input2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    edittext.setText(input1 * input2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    edittext.setText(input1 / input2+"");
                    mDivision=false;
                }
                if (mmode == true){
                    edittext.setText(input1 % input2+"");
                    mDivision=false;
                }
            }
        });

    }
}