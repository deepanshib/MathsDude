package com.example.deepanshibansal.mathsdude;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class scientificCalc extends AppCompatActivity {
    Button add,sub,div,mul,one,two,three,four,five,six,seven,eight,nine,zero,equal,clear,decimal,clearall,percent,change,sign,sin,cos,tan,shift;
   Button square,inverse,asin,acos,atan,ashift,cube,log,abs,root,logg,exp;
    EditText edit;
    double value1,value2;
    double ans=0;
    boolean addition,subtraction,division,multiplication,answer;
    boolean mshift=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calc);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        equal=(Button)findViewById(R.id.equal);
        clear=(Button)findViewById(R.id.c);
        clearall=(Button)findViewById(R.id.ac);
        decimal=(Button)findViewById(R.id.decimal);
        edit= (EditText) findViewById(R.id.editText);
        percent= (Button) findViewById(R.id.percent);
        sign= (Button) findViewById(R.id.sign);
        change= (Button) findViewById(R.id.change);
        sin= (Button) findViewById(R.id.sin);
       asin= (Button) findViewById(R.id.asin);
        cos= (Button) findViewById(R.id.cos);
        acos= (Button) findViewById(R.id.acos);
        tan= (Button) findViewById(R.id.tan);
       atan= (Button) findViewById(R.id.atan);
        shift= (Button) findViewById(R.id.shift);
        ashift= (Button) findViewById(R.id.ashift);
        log= (Button) findViewById(R.id.log);
        square= (Button) findViewById(R.id.square);
        inverse= (Button) findViewById(R.id.inverse);
        cube= (Button) findViewById(R.id.cube);
      logg= (Button) findViewById(R.id.log10);
     exp = (Button) findViewById(R.id.exp);
        root= (Button) findViewById(R.id.root);
        abs= (Button) findViewById(R.id.abs);

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
try {
    value1 = Math.sin(Float.parseFloat(edit.getText() + ""));
    edit.setText(value1 + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        asin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

try{
                value1 = Math.asin(Float.parseFloat(edit.getText() + ""));
                edit.setText(value1 + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
try{
                    value1=Math.cos(Float.parseFloat(edit.getText()+""));
                    edit.setText(value1+"");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        acos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
try{
                    value1=Math.acos(Float.parseFloat(edit.getText()+""));
                edit.setText(value1+"");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
try{
                    value1=Math.tan(Float.parseFloat(edit.getText()+""));
                    edit.setText(value1+"");
}
catch (Exception e){
    edit.setText("error");
}

            }
        });
        atan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

try{
   value1=Math.atan(Float.parseFloat(edit.getText()+""));
                edit.setText(value1+"");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        logg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    value1=Math.log10(Float.parseFloat(edit.getText()+""));
                    edit.setText(value1+"");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{
                    value1=Math.exp(Float.parseFloat(edit.getText()+""));
                    edit.setText(value1+"");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        root.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
try{
                value1 = Math.sqrt(Float.parseFloat(edit.getText() + ""));
                edit.setText(value1 + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        square.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
try{
                value1 = Float.parseFloat(edit.getText() + "");
                edit.setText((value1*value1) + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        cube.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                try{value1 = Float.parseFloat(edit.getText() + "");
                edit.setText((value1*value1*value1) + "");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
try{
                value1 = Math.log(Float.parseFloat(edit.getText() + ""));
                edit.setText(value1 + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
try{
                value1 = Math.abs(Float.parseFloat(edit.getText() + ""));
                edit.setText(value1 + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });
        inverse.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
try{
                value1 = Math.sqrt(Float.parseFloat(edit.getText() + ""));
                edit.setText((1/value1) + "");
}
catch (Exception e){
    edit.setText("error");
}
            }
        });

        shift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                mshift=true;
                shift.setVisibility(View.INVISIBLE);
                cos.setVisibility(View.INVISIBLE);
                sin.setVisibility(View.INVISIBLE);
                tan.setVisibility(View.INVISIBLE);
                ashift.setVisibility(View.VISIBLE);
                asin.setVisibility(View.VISIBLE);
                acos.setVisibility(View.VISIBLE);
                atan.setVisibility(View.VISIBLE);
                }
                catch (Exception e){
                    edit.setText("error");
                }

            }
        });
        ashift.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                try{
                mshift=false;
                ashift.setVisibility(View.INVISIBLE);
                acos.setVisibility(View.INVISIBLE);
                asin.setVisibility(View.INVISIBLE);
                atan.setVisibility(View.INVISIBLE);
                shift.setVisibility(View.VISIBLE);
                sin.setVisibility(View.VISIBLE);
                cos.setVisibility(View.VISIBLE);
                tan.setVisibility(View.VISIBLE);
                }
                catch (Exception e){
                    edit.setText("error");
                }

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+"0");

            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                value1=Float.parseFloat(edit.getText()+"");

                edit.setText((value1/100)+"");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });

        clearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("");
                addition=false;
                subtraction=false;
                multiplication=false;
                division=false;
                value1=0;
                value2=0;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ans=Float.parseFloat(edit.getText()+"");
                addition=true;
                edit.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                ans=Float.parseFloat(edit.getText()+"");
                subtraction=true;
                edit.setText(null);
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                ans=Float.parseFloat(edit.getText()+"");
                division=true;
                edit.setText(null);
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                ans=Float.parseFloat(edit.getText()+"");
                multiplication=true;
                edit.setText(null);
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                value2=Float.parseFloat(edit.getText()+"");
                edit.setText(null);
                answer=true;
                if(addition==true){
                    ans=ans+value2;
                    //addition=false;
                }
                else if(subtraction==true){
                    ans=ans-value2;
                    //subtraction=false;
                }
                else if(division==true){
                    ans=ans/value2;
                    //division=false;
                }
                else if(multiplication==true){
                    ans=ans*value2;
                    //multiplication=false;

                }
                edit.setText(ans+"");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setText(edit.getText()+".");
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{edit.setText("-");
                }
                catch (Exception e){
                    edit.setText("error");
                }
            }
        });


    }
    public void simple(View view){
        startActivity(new Intent(this,SimpleClac.class));
    }
}
