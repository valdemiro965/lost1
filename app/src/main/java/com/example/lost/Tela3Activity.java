package com.example.alunoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Tela3Activity extends AppCompatActivity {

    protected static final int TIMER_RUNTIME = 10000;

    private ImageView logo;
    private TextView texto;
    protected  boolean mbActive;
    protected ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

    mProgressBar = (ProgressBar) findViewById(R.id.barrinha);

}

    Thread timerThread = new Thread(){

        @Override
        public void run() {

            mbActive = true;
            try {
                int waited  =0;
                while (mbActive && waited < TIMER_RUNTIME){
                    sleep(2000);
                    if (mbActive){
                        waited +=200;
                        //upgradProgress(waited);
                    }
                }

            }catch (InterruptedException e){
                // erro
            }finally {
                onContinue();
            }

        timerThread.start();
        }
    };

    public void upgradProgress(final int timerPassed){
        if (null != mProgressBar){
            final int progress = mProgressBar.getMax() * timerPassed/ TIMER_RUNTIME;
            mProgressBar.setProgress(progress);
        }
    }
    public void onContinue(){

        Intent intent = new Intent(getApplicationContext(),Tela2Activity.class);
        startActivity(intent);

    }
}

