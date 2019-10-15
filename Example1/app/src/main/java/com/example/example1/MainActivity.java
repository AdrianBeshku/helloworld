package com.example.example1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public int num1;
    public int num2;
    public boolean plus = false;
    public boolean sub = false;
    public boolean multi = false;
    public boolean divide = false;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);



        final TextView textView = findViewById(R.id.textView3);
        final Button button = findViewById(R.id.Button1);
        final Button button2 = findViewById(R.id.Button2);
        final Button button3 = findViewById(R.id.Button3);
        final Button button4 = findViewById(R.id.Button4);
        final Button button5 = findViewById(R.id.Button5);
        final Button button6 = findViewById(R.id.Button6);
        final Button button7 = findViewById(R.id.Button7);
        final Button button8 = findViewById(R.id.Button8);
        final Button button9 = findViewById(R.id.Button9);
        final Button buttonP = findViewById(R.id.buttonPlus);
        final Button buttonE = findViewById(R.id.buttonEquals);
        final Button buttonS = findViewById(R.id.buttonS);
        final Button buttonX = findViewById(R.id.buttonX);
        final Button buttonD = findViewById(R.id.buttonD);
        final Button buttonClear = findViewById(R.id.buttonClear);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textView.setText(textView.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "4");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(textView.getText() + "9");
            }
        });
        buttonP.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            String one = textView.getText().toString();
            final int first = Integer.parseInt(one);
            num1 = first;
            textView.setText("");
            plus = true;
        }
    });
    buttonD.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            String one = textView.getText().toString();
            final int first = Integer.parseInt(one);
            num1 = first;
            textView.setText("");
            divide = true;
        }
    });
    buttonX.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            String one = textView.getText().toString();
            final int first = Integer.parseInt(one);
            num1 = first;
            textView.setText("");
            multi = true;
        }
    });
        buttonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String one = textView.getText().toString();
                final int first = Integer.parseInt(one);
                num1 = first;
                textView.setText("");
                sub = true;
            }
    });
    buttonClear.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            num1 = 0;
            num2 = 0;
            textView.setText("");
        }
    });
    buttonE.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            if (plus == true) {
                String two = textView.getText().toString();
                final int second = Integer.parseInt(two);
                num2 = second;
                int all = num1 + num2;
                textView.setText("" + all);
                plus = false;
            }
            else if (sub == true)
            {
                String two = textView.getText().toString();
                final int second = Integer.parseInt(two);
                num2 = second;
                int all = num1 - num2;
                textView.setText("" + all);
                sub = false;
            }
            else if (multi == true)
            {
                String two = textView.getText().toString();
                final int second = Integer.parseInt(two);
                num2 = second;
                int all = num1 * num2;
                textView.setText("" + all);
                multi = false;
            }
            else if (divide == true)
            {
                String two = textView.getText().toString();
                final int second = Integer.parseInt(two);
                num2 = second;
                int all = num1 / num2;
                textView.setText("" + all);
                divide = false;
            }
            else
            {
                textView.setText("Error");
            }
        }
    });
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
