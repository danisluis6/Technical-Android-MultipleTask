package com.example.enclaveit.multipletask;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initicomponents
        img1 = (ImageView)this.findViewById(R.id.img1);
        img2 = (ImageView)this.findViewById(R.id.img2);
        img3 = (ImageView)this.findViewById(R.id.img3);
        img4 = (ImageView)this.findViewById(R.id.img4);

        // Load Task 1
        new Task1().execute("http://img.f28.kinhdoanh.vnecdn.net/2017/02/09/pnj4-500-9047-1486609630_180x108.jpg");
        new Task2().execute("http://img.f30.vnecdn.net/2017/02/09/ret7-1162-1486608933_180x108.jpg");
        new Task3().execute("http://img.f32.vnecdn.net/2017/02/09/0347261486116382-1486601870_180x108.jpg");
        new Task4().execute("http://img.f29.vnecdn.net/2017/02/09/tomhumnhi-1486611589_180x108.jpg");
    }

    //  Task 1
    class Task1 extends AsyncTask<String,Void,Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img1.setImageBitmap(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            /**
             * @author: Excecute get images from the internet.
             * Writting method or function to get image(SEARCH STAKEOVERFLOW)
             */
            try{
                String link = strings[0];
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(link).getContent());
                return bitmap;
            }catch (Exception ex){
                Log.d("Error",ex.getMessage().toString());
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }

    // Task 2
    //  Task 2
    class Task2 extends AsyncTask<String,Void,Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img2.setImageBitmap(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            /**
             * @author: Excecute get images from the internet.
             * Writting method or function to get image(SEARCH STAKEOVERFLOW)
             */
            try{
                String link = strings[0];
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(link).getContent());
                return bitmap;
            }catch (Exception ex){
                Log.d("Error",ex.getMessage().toString());
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }

    // Task 3
    //  Task 3
    class Task3 extends AsyncTask<String,Void,Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img3.setImageBitmap(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            /**
             * @author: Excecute get images from the internet.
             * Writting method or function to get image(SEARCH STAKEOVERFLOW)
             */
            try{
                String link = strings[0];
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(link).getContent());
                return bitmap;
            }catch (Exception ex){
                Log.d("Error",ex.getMessage().toString());
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }

    // Task 2
    //  Task 2
    class Task4 extends AsyncTask<String,Void,Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            img4.setImageBitmap(bitmap);
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            /**
             * @author: Excecute get images from the internet.
             * Writting method or function to get image(SEARCH STAKEOVERFLOW)
             */
            try{
                String link = strings[0];
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(link).getContent());
                return bitmap;
            }catch (Exception ex){
                Log.d("Error",ex.getMessage().toString());
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }
}
