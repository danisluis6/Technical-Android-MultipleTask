package com.example.enclaveit.multiprocesstech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  String temp = "";
    private ListView listView;
    private List<String> data;
    private String[] tempp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView)this.findViewById(R.id.listView);
        data = new ArrayList<>();
        /**
         * @author: Lorence
         * - Runable: contain content of work, this is paragraph code to do that.
         * - Thread: Include runable and running runable
         * - Example: Test which thread running ....
         */


        /**
         * Example 1: I want to create five thread or small process
         */
        for(int i = 0; i < 1000; i++){
            Thread newThread  = new Thread(new MyRunable());
            newThread.start();
        }

        // Finish Thread and See Result From It.
        tempp = temp.split(",");
        for(int index = 0; index < tempp.length; index++){
            data.add(tempp[index]);
        }
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
    }

    class MyRunable implements  Runnable{

        @Override
        public void run() {
            // To do
            temp += String.valueOf(Thread.currentThread().getName()+" ...start!,");
        }
    }
}
