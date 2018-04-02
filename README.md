# Arithematic_Android
## :heart:*MainActivity.java*
```java
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

```
## :heart:*activity_main.xml*
```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    tools:layout_editor_absoluteY="81dp">

    <Button
        android:id="@+id/btnAdd"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ADD"
        app:layout_constraintBaseline_toBaselineOf="@+id/btndiv"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/btndiv" />

    <Button
        android:id="@+id/btnsub"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="15dp"
        android:text="SUB"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@+id/btnmul"
        app:layout_constraintTop_toBottomOf="@+id/txtnum2" />

    <Button
        android:id="@+id/btndiv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="28dp"
        android:layout_marginLeft="4dp"
        android:layout_marginRight="28dp"
        android:layout_marginStart="4dp"
        android:layout_marginTop="20dp"
        android:text="DIV"
        app:layout_constraintEnd_toStartOf="@+id/btnAdd"
        app:layout_constraintHorizontal_chainStyle="packed"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btnmul" />

    <Button

        android:id="@+id/btnmul"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="28dp"
        android:layout_marginLeft="4dp"
        android:layout_marginRight="28dp"
        android:layout_marginStart="4dp"
        android:layout_marginTop="19dp"
        android:text="MUL"
        app:layout_constraintEnd_toStartOf="@+id/btnsub"
        app:layout_constraintHorizontal_chainStyle="packed"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/txtnum2" />

    <EditText

        android:id="@+id/txtnum1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="13dp"
        android:layout_marginStart="13dp"
        android:layout_marginTop="16dp"
        android:ems="10"
        android:hint="Number1"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="@+id/textView2"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <EditText
        android:id="@+id/txtnum2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:ems="10"
        android:hint="Number2"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="@+id/txtnum1"
        app:layout_constraintTop_toBottomOf="@+id/txtnum1" />

    <TextView
        android:id="@+id/txtresult"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="51dp"
        android:layout_marginLeft="13dp"
        android:layout_marginStart="13dp"
        android:text=""
        android:textSize="30dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toEndOf="@+id/btndiv" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="52dp"
        android:gravity="center_vertical"
        android:text="Arithmetic Operations"
        android:textSize="25dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</android.support.constraint.ConstraintLayout>
```
