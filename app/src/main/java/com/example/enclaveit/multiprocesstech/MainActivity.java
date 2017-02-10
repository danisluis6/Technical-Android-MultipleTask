package com.example.enclaveit.multiprocesstech;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView number1;
    private TextView number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * @author: Lorence
         * - Runable: contain content of work, this is paragraph code to do that.
         * - Thread: Include runable and running runable
         * - Example: Test which thread running ....
         */
        number1 = (TextView)this.findViewById(R.id.number1);
        number2 = (TextView)this.findViewById(R.id.number2);

        /**
         * Example 1: I want to create five thread or small process
         */

        Thread one  = new Thread(new NumberOne());
        Thread two  = new Thread(new NumberTwo());

        one.start();
        two.start();
    }

    class NumberOne implements  Runnable{

        @Override
        public void run() {
            // To do
            int temp = Integer.parseInt(number1.getText().toString())+1;
            number1.setText(String.valueOf(temp));
        }
    }

    class NumberTwo implements  Runnable{

        @Override
        public void run() {
            // To do
            int temp = Integer.parseInt(number2.getText().toString())+2;
            number2.setText(String.valueOf(temp));
        }
    }

}

// This is a problem for weekend. I hope you have a experience about process problems.