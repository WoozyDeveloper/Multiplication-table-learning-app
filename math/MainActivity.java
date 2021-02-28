package ro.adionofrei.math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v) {
        if (v.getId() == R.id.button1) {
            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(MainActivity.this, Displayb1.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button3) {
            Intent i = new Intent(MainActivity.this, Display2.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button4) {
            Intent i = new Intent(MainActivity.this, Display3.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button5) {
            Intent i = new Intent(MainActivity.this, Display4.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button6) {
            Intent i = new Intent(MainActivity.this, Display5.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button7) {
            Intent i = new Intent(MainActivity.this, Display6.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button8) {
            Intent i = new Intent(MainActivity.this, Display7.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button9) {
            Intent i = new Intent(MainActivity.this, Display8.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button10) {
            Intent i = new Intent(MainActivity.this, Display9.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button11) {
            Intent i = new Intent(MainActivity.this, Display10.class);
            startActivity(i);
        }
    }
}
