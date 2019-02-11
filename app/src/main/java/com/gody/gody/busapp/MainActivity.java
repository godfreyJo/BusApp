package com.gody.gody.busapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textStyles();
        setClickListener();


//        Button btn_login = (Button)findViewById(R.id._btn_login);
//        Button btn_signup = (Button)findViewById(R.id.btn_signup);

    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_user_login:
                Intent myIntent = new Intent(this, com.gody.gody.busapp.user_login.class);
                startActivityForResult(myIntent, 1);
                break;
            case R.id.user_register:
                Intent myIntent2 = new Intent(this, com.gody.gody.busapp.user_register.class);
                startActivityForResult(myIntent2, 2);
                break;
            case R.id.employee_login:
                Intent myIntent3 = new Intent(this, com.gody.gody.busapp.employee_login.class);
                startActivityForResult(myIntent3, 3);


        }
    }
    @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data)
        {
            if (requestCode == 1)
            {
                if(requestCode == Activity.RESULT_OK)
                {
                    Intent home = new Intent(this, com.gody.gody.busapp.user_home.class);
                    String newText = data.getStringExtra("registrationNo");
                    home.putExtra("registrationNo", newText);
                    startActivity(home);
                }
            }
            else if (requestCode == 2)
            {
                if(requestCode == Activity.RESULT_OK)
                {
                    Intent myIntent = new Intent(this, com.gody.gody.busapp.user_login.class);
                    startActivityForResult(myIntent, 1);
                }

            }
            else
            {
                if(requestCode == Activity.RESULT_OK)
                {
                   Intent home = new Intent(this, com.gody.gody.busapp.employee_home.class);
                   String newText = data.getStringExtra("employeeNo");
                   home.putExtra("employeeNo", newText);
                   startActivity(home);

                }

            }



        }

    private void setClickListener()
    {
       findViewById(R.id.home_user_login).setOnClickListener(this);
       findViewById(R.id.user_register).setOnClickListener(this);
       findViewById(R.id.home_user_login).setOnClickListener(this);

    }

    private void textStyles()
    {
//        Get the elements
        TextView welcome_to_textView = (TextView)findViewById(R.id.home_welcome_to);
        TextView sib_textview          = (TextView)findViewById(R.id.home_sib);
        Button user_login_button     = (Button)findViewById(R.id.home_user_login);
        Button user_register_button  = (Button)findViewById(R.id.user_register);
        Button employee_login_button = (Button)findViewById(R.id.employee_login);
//        Find fonts
        Typeface face = Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.tff");
//        Set fonts
        welcome_to_textView.setTypeface(face);
        sib_textview.setTypeface(face);
        user_login_button.setTypeface(face);
        user_register_button.setTypeface(face);
        employee_login_button.setTypeface(face);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
