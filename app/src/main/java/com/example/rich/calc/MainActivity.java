package com.example.rich.calc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
/*
* Richard E
* File - Mainactivity.java
* Purpose - performs calculations for the calculator application
* Based on - https://www.youtube.com/watch?v=GfgNkQXcOK8
* */


// others
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //global varaibles
    public String operator,total ="";
    public boolean convertNeg = false;
    public double tmpStore,tmpStoreTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //0-9 buttons
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);

        //function buttons
        Button buttonC = (Button)findViewById(R.id.buttonC);
        Button buttonE = (Button)findViewById(R.id.buttonE);
        Button buttonAdd = (Button)findViewById(R.id.buttonAdd);
        Button buttonMin = (Button)findViewById(R.id.buttonMin);
        Button buttonMul = (Button)findViewById(R.id.buttonMul);
        Button buttonDiv = (Button)findViewById(R.id.buttonDiv);
        Button buttonPer = (Button)findViewById(R.id.buttonPercent);
        Button buttonConv = (Button)findViewById(R.id.buttonConvert);
        Button buttonDec = (Button)findViewById(R.id.buttonDecimal);
        Button buttonDel = (Button)findViewById(R.id.buttonDel);
        Button buttonTan = (Button)findViewById(R.id.buttonTan);
        //when button is clicked

        button0.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        button1.setOnClickListener(
            new Button.OnClickListener(){
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("1");
                }
            }
        );

        button2.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("2");
                }
            }
        );
        button3.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("3");
                }
            }
        );
        button4.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("4");
                }
            }
        );
        button5.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("5");
                }
            }
        );
        button6.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("6");
                }
            }
        );
        button7.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("7");
                }
            }
        );
        button8.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("8");
                }
            }
        );
        button9.setOnClickListener(
            new Button.OnClickListener(){
                @Override
                public void onClick(View v) {
                    TextView output = (TextView)findViewById(R.id.editText);
                    output.append("9");
                }
            }
        );
        button9.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );
        buttonDec.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.append(".");
                    }
                }
        );

        //clears text
        buttonC.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        output.setText("");
                        tmpStoreTwo=0;
                        tmpStore=0;
                        operator="";
                    }
                }
        );
        //extra function deletes stuff
        buttonDel.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        String currentOutput = output.getText().toString();
                        output.setText(currentOutput.substring(0,currentOutput.length()-1));
                    }
                }
        );
        //add sign
        buttonAdd.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "+";
                    }
                }
        );
        //minus sign
        buttonMin.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "-";
                    }
                }
        );
        //multiply
        buttonMul.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "*";
                    }
                }
        );
        //division
        buttonDiv.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "/";
                    }
                }
        );
        //percent
        buttonPer.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        operator = "%";
                    }
                }
        );
        buttonConv.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        char isPositive = output.getText().toString().charAt(0);
                        //if its positive
                        if (isPositive != '-'){
                            output.setText("-"+output.getText().toString());
                        }else{
                            output.setText(output.getText().toString().substring(1));
                        }
                    }
                }
        );
        buttonTan.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStore = Double.parseDouble(output.getText().toString());
                        tmpStore = Math.tan(tmpStore);
                        output.setText(Double.toString(tmpStore));

                    }
                }
        );
        //when equal pressed
        buttonE.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tmpStoreTwo = Double.parseDouble(output.getText().toString());

                        //gather operators
                        if (operator == "+"){
                            output.setText(Double.toString(tmpStore+tmpStoreTwo));
                        }
                        else if (operator == "-"){
                            output.setText(Double.toString(tmpStore-tmpStoreTwo));
                        }
                        else if (operator == "*"){
                            output.setText(Double.toString(tmpStore*tmpStoreTwo));
                        }
                        else if (operator == "/"){
                            //checks for divsion error 0
                            if(tmpStoreTwo == 0){
                                output.setText("cant divide by 0!");
                            }
                            else{
                            output.setText(Double.toString(tmpStore/tmpStoreTwo));
                            }
                        }
                        else if (operator == "%"){
                            output.setText(Double.toString(tmpStore%tmpStoreTwo));
                        }
                        //resets operator
                        operator ="";
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
