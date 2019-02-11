package com.gody.gody.busapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
                Intent myIntent = new Intent(this, user_login.class);
                startActivityForResult(myIntent, 1);
                break;
            case R.id.user_register:
                Intent myIntent2 = new Intent(this, user_register.class);
                startActivityForResult(myIntent2, 2);
                break;
            case R.id.employee_login:
                Intent myIntent3 = new Intent(this, employee_login.class);
                startActivityForResult(myIntent3, 3);


        }
    }
    @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            if (requestCode == 1)
            {
                if(requestCode == Activity.RESULT_OK)
                {
                    Intent home = new Intent(this, user_home.class);
                    String newText = data.getStringExtra("registrationNo");
                    home.putExtra("registrationNo", newText);
                    startActivity(home);
                }
            }
            else if (requestCode == 2)
            {
                if(requestCode == Activity.RESULT_OK)
                {
                    Intent myIntent = new Intent(this, user_login.class);
                    startActivityForResult(myIntent, 1);
                }

            }
            else
            {
                if(requestCode == Activity.RESULT_OK)
                {
                   Intent home = new Intent(this, employee_home.class);
                   String newText = data.getStringExtra("employeeNo");
                   home.putExtra("employeeNo", newText);
                   startActivity(home);

                }

            }
        }

    private void setClickListener()
    {
       findViewById(R.id.home_user_login).setOnClickListener((View.OnClickListener) this);
       findViewById(R.id.user_register).setOnClickListener((View.OnClickListener) this);
       findViewById(R.id.home_user_login).setOnClickListener((View.OnClickListener)this);

    }

    private void textStyles() {
    }
}
