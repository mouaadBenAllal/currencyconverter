package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void berekenDollar (View view) {
        EditText berekenField = (EditText) findViewById(R.id.bedragField);
        double dollarAmount = Double.parseDouble(berekenField.getText().toString());
        String euroAmount = Double.toString (dollarAmount * 1.11);
        Toast.makeText(getApplicationContext(),euroAmount.toString() + "  Dollar ", Toast.LENGTH_SHORT).show();
    }

    public void berekenEuro (View view) {
        EditText berekenField = (EditText) findViewById(R.id.bedragField);
        double euroAmount = Double.parseDouble(berekenField.getText().toString());
        String dollarAmount = Double.toString(euroAmount * 0.89);
        Toast.makeText(getApplicationContext(),dollarAmount.toString() + "  Euro ", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
