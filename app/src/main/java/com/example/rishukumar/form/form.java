package com.example.rishukumar.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class form extends AppCompatActivity {
    Button open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        open=(Button) findViewById(R.id.button);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstname=(EditText) findViewById(R.id.editText2);
                EditText lastname=(EditText) findViewById(R.id.editText);
                EditText dob=(EditText) findViewById(R.id.editText3);
                EditText college=(EditText) findViewById(R.id.editText4);
                EditText regno=(EditText) findViewById(R.id.editText5);

                if(firstname.getText().toString().trim().equals("")){
                    firstname.setError("First name is required!");
                }
                if(lastname.getText().toString().trim().equals("")){
                    lastname.setError("last name is required!");
                }
                if(dob.getText().toString().trim().equals("")){
                    dob.setError("D.O.B is required!");
                }
                if(college.getText().toString().trim().equals("")){
                    college.setError("College name is required!");
                }
                if(regno.getText().toString().trim().equals("")){
                    regno.setError(" Reg No. is required!");
                }

                else{
                Intent openthanku=new Intent("com.example.rishukumar.form.THANKU");
                startActivity(openthanku);
            }}
        });

    }
}
