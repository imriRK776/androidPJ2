package com.example.tryappv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view){
        TextView txtViewFname = findViewById(R.id.txtViewFname);
        TextView txtViewLname = findViewById(R.id.txtViewLname);
        TextView txtViewGmail = findViewById(R.id.txtViewGmail);

        EditText edtTextFname = findViewById(R.id.editTxtFname);
        EditText edtTextLname = findViewById(R.id.editTxtLname);
        EditText edtTextGmail = findViewById(R.id.editTxtGmail);

        txtViewFname.setText("First name: " + edtTextFname.getText().toString());
        txtViewLname.setText("Last name: " + edtTextLname.getText().toString());
        txtViewGmail.setText("Gmail: " + edtTextGmail.getText().toString());

    }
}