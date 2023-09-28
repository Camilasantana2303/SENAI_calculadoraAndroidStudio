package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double n1,n2,res;
    EditText edt_n1=(EditText) findViewById(R.id.edt_n1);
    EditText edt_n2=(EditText) findViewById(R.id.edt_n2);

    Button btn_somar=(Button) findViewById(R.id.btn_soma);
    Button btn_menos=(Button) findViewById(R.id.btn_menos);
    Button btn_divisao=(Button) findViewById(R.id.btn_divisao);
    Button btn_vezes=(Button) findViewById(R.id.btn_vezes);

    TextView txtV_res = (TextView) findViewById(R.id.txtV_res);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//       btn_somar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                n1=Double.parseDouble(edt_n1.getText().toString());
//                n2=Double.parseDouble(edt_n2.getText().toString());
//                res=n1+n2;
//
//                txtV_res.setText(String.valueOf(res));
//
//            }
//        });



//        btn_menos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                n1=Double.parseDouble(edt_n1.getText().toString());
//                n2=Double.parseDouble(edt_n2.getText().toString());
//                res=n1-n2;
//
//                txtV_res.setText(String.valueOf(res));
//
//            }
//        });
//
//        btn_divisao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                n1=Double.parseDouble(edt_n1.getText().toString());
//                n2=Double.parseDouble(edt_n2.getText().toString());
//                res=n1/n2;
//
//                txtV_res.setText(String.valueOf(res));
//
//            }
//        });
//
//        btn_vezes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                n1=Double.parseDouble(edt_n1.getText().toString());
//                n2=Double.parseDouble(edt_n2.getText().toString());
//                res=n1*n2;
//
//                txtV_res.setText(String.valueOf(res));
//
//            }
//        });



    }
    public void soma(View view){
        n1=Double.parseDouble(edt_n1.getText().toString());
        n2=Double.parseDouble(edt_n2.getText().toString());
        res=n1+n2;
        txtV_res.setText(String.valueOf(res));
    }

    public void menos(View view){
        n1=Double.parseDouble(edt_n1.getText().toString());
       n2=Double.parseDouble(edt_n2.getText().toString());
       res=n1-n2;
       txtV_res.setText(String.valueOf(res));
    }

    public void divisao(View view){
        n1=Double.parseDouble(edt_n1.getText().toString());
        n2=Double.parseDouble(edt_n2.getText().toString());
        res=n1/n2;
        txtV_res.setText(String.valueOf(res));
    }

    public void vezes(View view){
        n1=Double.parseDouble(edt_n1.getText().toString());
        n2=Double.parseDouble(edt_n2.getText().toString());
        res=n1*n2;
        txtV_res.setText(String.valueOf(res));
    }


}