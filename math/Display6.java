package ro.adionofrei.math;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Display6 extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display6);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        txt=(TextView)findViewById(R.id.text);
    }
    public void goblack(View v){txt.setText("6");}
    public void gored(View v){txt.setText("12");}
    public void gopurple(View v){txt.setText("18");}
    public void goorange(View v){txt.setText("24");}
    public void gowhite(View v){txt.setText("30");}
    public void gogray(View v){txt.setText("36");}
    public void gogreen(View v){txt.setText("42");}
    public void gopink(View v){txt.setText("48");}
    public void go9(View v) {txt.setText("54");}
    public void go10(View v) {txt.setText("60");}
}