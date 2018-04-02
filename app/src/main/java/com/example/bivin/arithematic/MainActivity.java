package com.example.bivin.arithematic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    Button btnSub;
    Button btnDiv;
    Button btnMul;
    EditText txtnum1;
    EditText txtNum2;
    TextView txtResult;
    double n1,n2,res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnsub);
        btnDiv=findViewById(R.id.btndiv);
        btnMul=findViewById(R.id.btnmul);

        txtnum1=findViewById(R.id.txtnum1);
        txtNum2=findViewById(R.id.txtnum2);
        txtResult=findViewById(R.id.txtresult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(txtnum1.getText())&& TextUtils.isEmpty(txtNum2.getText())){
                    Toast.makeText(getApplicationContext(),"Enter numbers",Toast.LENGTH_LONG).show();
                }
                else{
                    n1 = Double.parseDouble(txtnum1.getText().toString());
                    n2= Double.parseDouble(txtNum2.getText().toString());
                    res=n1+n2;
                    txtResult.setText("Sum="+Double.toString(res));
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(txtnum1.getText())&& TextUtils.isEmpty(txtNum2.getText())){
                    Toast.makeText(getApplicationContext(),"Enter numbers",Toast.LENGTH_LONG).show();
                }
                else{
                    n1 = Double.parseDouble(txtnum1.getText().toString());
                    n2= Double.parseDouble(txtNum2.getText().toString());
                    res=n1-n2;
                    txtResult.setText("Sub="+Double.toString(res));
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(txtnum1.getText())&& TextUtils.isEmpty(txtNum2.getText())){
                    Toast.makeText(getApplicationContext(),"Enter numbers",Toast.LENGTH_LONG).show();
                }
                else{
                    n1 = Double.parseDouble(txtnum1.getText().toString());
                    n2= Double.parseDouble(txtNum2.getText().toString());
                    res=n1/n2;
                    txtResult.setText("div="+Double.toString(res));
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(txtnum1.getText())&& TextUtils.isEmpty(txtNum2.getText())){
                    Toast.makeText(getApplicationContext(),"Enter numbers",Toast.LENGTH_LONG).show();
                }
                else{
                    n1 = Double.parseDouble(txtnum1.getText().toString());
                    n2= Double.parseDouble(txtNum2.getText().toString());
                    res=n1*n2;
                    txtResult.setText("Mul="+Double.toString(res));
                }

            }
        });
    }
}
