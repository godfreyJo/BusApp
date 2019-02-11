package com.gody.gody.busapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class user_login extends AppCompatActivity implements View.OnClickListener {
//    private Database db = new Database(this);

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        textStyles();
        setClickListener();
    }



    @Override
    public void onClick(View v) {
        EditText employeeNoText         = (EditText)findViewById(R.id.employee_login_number);
        EditText passwordText           = (EditText)findViewById(R.id.employee_login_password);

        String employeeNoString         =  employeeNoText.getText().toString();
        String passwordString           =  passwordText.getText().toString();



    }
    private void setClickListener() {
    }

    private void textStyles() {
    }
}
