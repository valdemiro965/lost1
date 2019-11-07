package com.example.alunoactivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;

public class Tela2Activity extends AppCompatActivity {

    MediaPlayer porta;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private TextView Score, Score1, Score2, Score3, Score4,Score_Tot;

    int figuras[] = {R.drawable.laranja, R.drawable.amarela, R.drawable.vermelha, R.drawable.verde, R.drawable.azul,
            R.drawable.vermelha, R.drawable.laranja, R.drawable.amarela, R.drawable.vermelha, R.drawable.azul,
            R.drawable.verde, R.drawable.laranja, R.drawable.amarela, R.drawable.vermelha, R.drawable.verde,
            R.drawable.azul, R.drawable.vermelha, R.drawable.laranja, R.drawable.amarela, R.drawable.verde,
            R.drawable.azul, R.drawable.verde, R.drawable.amarela, R.drawable.laranja, R.drawable.azul
    };

    int i = 0;
    int ccam = 0;
    int ccvr = 0;
    int ccve = 0;
    int ccaz = 0;
    int ccl = 0;
    int Total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);


        final ImageView image1 = (ImageView) findViewById(R.id.image1);
        final ImageView image2 = (ImageView) findViewById(R.id.image2);
        final ImageView image3 = (ImageView) findViewById(R.id.image3);
        final ImageView image4 = (ImageView) findViewById(R.id.image4);
        final ImageView image5 = (ImageView) findViewById(R.id.image5);

        final TextView Score = (TextView)findViewById(R.id.Score);
        final TextView Score1 = (TextView)findViewById(R.id.Score1);
        final TextView Score2 = (TextView)findViewById(R.id.Score2);
        final TextView Score3 = (TextView)findViewById(R.id.Score3);
        final TextView Score4 = (TextView)findViewById(R.id.Score4);
        final TextView Score_Tot = (TextView)findViewById(R.id.Score_Tot);

        final Button botao1 = (Button) findViewById(R.id.botao1);
        final Button botao2 = (Button) findViewById(R.id.botao2);
        final Button botao3 = (Button) findViewById(R.id.botao3);
        final Button botao4 = (Button) findViewById(R.id.botao4);
        final Button botao5 = (Button) findViewById(R.id.botao5);


        //Fim do botão 1
        //======================//======================//===================//
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setImageResource(figuras[ccaz]);
                i++;
                ccaz++;
                combinarPortas();
                    Score.setText(""+ccaz);
                if (i == figuras.length) {
                    i = 0;
                    ccaz=0;

                }

            }});
                // Inico do botao verde 2

                botao2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        image2.setImageResource(figuras[i]);
                        i++;
                        ccve++;
                        Score1.setText(""+ccve);
                       combinarPortas();
                        if (i == figuras.length) {
                            i = 0;
                            ccve=0;
                        }

                    }
                });
                //Fim do botão 2
                //======================//======================//===================//
                // Inico do botao 3
                botao3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        image3.setImageResource(figuras[ccam]);
                        i++;
                        ccam++;
                        combinarPortas();
                        Score2.setText(""+ccam);
                        if (i == figuras.length) {
                            i = 0;
                            ccam =0;

                        }

                    }

                });
                //Fim do botão 3
                //======================//======================//===================//
                // Inico do botao 4
                botao4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        image4.setImageResource(figuras[ccl]);
                        i++;
                        ccl++;
                        combinarPortas();
                        Score3.setText(""+ccl);
                        if (i == figuras.length) {
                            i = 0;
                           ccl=0;
                        }

                    }
                });
                //Fim do botão 4
                //======================//======================//===================//

        // Inico do botao 5

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image5.setImageResource(figuras[ccvr]);
                i++;
                ccvr++;
                combinarPortas();
                    Score4.setText(""+ccvr);
                if (i==figuras.length){
                    i=0;
                    ccvr=0;

                }
            }
        });

    }
public void combinarPortas(){

    if (ccaz==5 && ccve==13 && ccam==5 && ccl==21 && ccvr==16){
        Toast.makeText(Tela2Activity.this, "Azul Ok",Toast.LENGTH_SHORT).show();
        Total++;
    }else if (ccaz==4 && ccve==11 && ccam==11 && ccl==4 && ccvr==4){
        Toast.makeText(Tela2Activity.this, "Verde Ok",Toast.LENGTH_SHORT).show();
        Total++;
    }else    if (ccve==5&& ccaz==2&&ccvr==2&&ccl==2){
        Toast.makeText(Tela2Activity.this,"AmareloOk",Toast.LENGTH_SHORT).show();
        Total++;
    }else if (ccaz==1 && ccve==5 && ccam==7 && ccl==18 && ccvr==7){
        Toast.makeText(Tela2Activity.this, "Laranja Ok",Toast.LENGTH_SHORT).show();
        Total++;
    }else if (ccaz==9&&ccve==3&&ccam==6&&ccl==14&&ccvr==3){
        Toast.makeText(Tela2Activity.this, "Vermelho Ok", Toast.LENGTH_SHORT).show();
        Total++;
    }else {
        Toast.makeText(Tela2Activity.this, "Vermelho Ok", Toast.LENGTH_SHORT).show();
    }if (Total==5){

        image1.setImageResource(R.drawable.comb1);
        image1.setImageResource(R.drawable.comb2);
        image1.setImageResource(R.drawable.comb3);
        image1.setImageResource(R.drawable.comb4);
        image1.setImageResource(R.drawable.comb5);
        Score_Tot.setText(""+ccaz+ccve+ccam+ccl+ccvr);

        Toast.makeText(Tela2Activity.this, "Portas Combinadas", Toast.LENGTH_SHORT).show();
    }

}

}














