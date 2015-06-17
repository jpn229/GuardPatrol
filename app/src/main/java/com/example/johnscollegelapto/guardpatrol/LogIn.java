package com.example.johnscollegelapto.guardpatrol;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;


public class LogIn extends ActionBarActivity {

    private EditText employeeid;
    private EditText password;
    private EditText siteid;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        setupVariables();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void authenticateLogin(View view) {
        if (employeeid.getText().toString().equals("john") &&
                password.getText().toString().equals("john") &&
                siteid.getText().toString().equals("1")) {
            Toast.makeText(getApplicationContext(), "Welcome John!",
                    Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }

        else {
            Toast.makeText(getApplicationContext(), "Wrong EmployeeID/Password/SiteID!",
                    Toast.LENGTH_SHORT).show();

        }
    }

    private void setupVariables() {
        employeeid = (EditText) findViewById(R.id.employeeidInput);
        password = (EditText) findViewById(R.id.passwordInput);
        siteid = (EditText) findViewById(R.id.siteidInput);
        login = (Button) findViewById(R.id.loginBtn);
    }

}
