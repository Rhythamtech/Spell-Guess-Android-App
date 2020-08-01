package com.spellguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sdsmdg.tastytoast.TastyToast;

public class QuizScr extends AppCompatActivity {
  TextView wrdsp1,wrdsp2,wrdsp3,wrdsp4,ctgry,galpha1,gaplha2,gaplha3,galpha4,backspace;
  SpellWord sp = new SpellWord();
  TextView keyA,keyB,keyC,keyD,keyE,keyF,keyG,keyH,keyI,keyJ,keyK,keyL,keyM,keyN,keyO,keyP,keyQ,keyR,keyS,keyT,keyU,keyV,keyW,keyX,keyY,keyZ;
  String ans="";
  int index,keypress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_scr);
        ctgry=(TextView)findViewById(R.id.category);
        galpha1=(TextView)findViewById(R.id.g1);
        gaplha2=(TextView)findViewById(R.id.g2);
        gaplha3=(TextView)findViewById(R.id.g3);
        galpha4=(TextView)findViewById(R.id.g4);
        wrdsp1=(TextView)findViewById(R.id.wordone);
        wrdsp2=(TextView)findViewById(R.id.wordtwo);
        wrdsp3=(TextView)findViewById(R.id.wordthree);
        wrdsp4=(TextView)findViewById(R.id.wordfour);
        backspace=(TextView)findViewById(R.id.del);
        keypress=0;
        index = getIntent().getExtras().getInt("index");
        ctgry.setText(sp.getcategory(index));
        assignval();
        assignkeys();
        keyclick();
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
            }
        });

    }

    public void assignkeys() {
        keyA=(TextView)findViewById(R.id.A);
        keyB=(TextView)findViewById(R.id.B);
        keyC=(TextView)findViewById(R.id.C);
        keyD=(TextView)findViewById(R.id.D);
        keyE=(TextView)findViewById(R.id.E);
        keyF=(TextView)findViewById(R.id.F);
        keyG=(TextView)findViewById(R.id.G);
        keyH=(TextView)findViewById(R.id.H);
        keyI=(TextView)findViewById(R.id.I);
        keyJ=(TextView)findViewById(R.id.J);
        keyK=(TextView)findViewById(R.id.K);
        keyL=(TextView)findViewById(R.id.L);
        keyM=(TextView)findViewById(R.id.M);
        keyN=(TextView)findViewById(R.id.N);
        keyO=(TextView)findViewById(R.id.O);
        keyP=(TextView)findViewById(R.id.P);
        keyQ=(TextView)findViewById(R.id.Q);
        keyR=(TextView)findViewById(R.id.R);
        keyS=(TextView)findViewById(R.id.S);
        keyT=(TextView)findViewById(R.id.T);
        keyU=(TextView)findViewById(R.id.U);
        keyV=(TextView)findViewById(R.id.V);
        keyW=(TextView)findViewById(R.id.W);
        keyX=(TextView)findViewById(R.id.X);
        keyY=(TextView)findViewById(R.id.Y);
        keyZ=(TextView)findViewById(R.id.Z);
    }

    public void assignval()
    {
        wrdsp1.setText(sp.getspellword1(index));
        wrdsp2.setText(sp.getspellword2(index));
        wrdsp3.setText(sp.getspellword3(index));
        wrdsp4.setText(sp.getspellword4(index));

    }

    public void backspace()
    {
        StringBuilder str = new StringBuilder(ans);
        switch (keypress)
        {
            case 1:
                galpha1.setText("");
                keypress--;
                str.deleteCharAt(keypress);
                break;
            case 2:
                gaplha2.setText("");
                keypress--;
                str.deleteCharAt(keypress);

                break;
            case 3:
                gaplha3.setText("");
                keypress--;
                str.deleteCharAt(keypress);

                break;
            case 4:
                galpha4.setText("");
                keypress--;
                str.deleteCharAt(keypress);

                break;
            default:
                TastyToast.makeText(getApplicationContext(), "Already Empty", TastyToast.LENGTH_LONG, TastyToast.CONFUSING);
                break;

        }
       // THIS IS TEST STATEMENT ctgry.setText(ans);
        ans=str.toString();

    }
    public void assignguess(String ch)
    {
        switch (keypress)
        {
            case 0:
                galpha1.setText(ch);
                ans+=ch;
                keypress++;
                break;
            case 1:
                gaplha2.setText(ch);
                ans+=ch;
                keypress++;
                break;
            case 2:
                gaplha3.setText(ch);
                ans+=ch;
                keypress++;
                break;
            case 3:
                galpha4.setText(ch);
                ans+=ch;
                keypress++;
                answer_check();
                break;
            default:
                TastyToast.makeText(getApplicationContext(), "Guess are Filled", TastyToast.LENGTH_LONG, TastyToast.CONFUSING);
                break;
        }
        // THIS IS TEST STATEMENT  ctgry.setText(ans);
    }
    public void keyclick()
    {
        keyA.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("A");                }            });
        keyB.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("B");                }            });
        keyC.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("C");                }            });
        keyD.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("D");                }            });
        keyE.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("E");                }            });
        keyF.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("F");                }            });
        keyG.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("G");                }            });
        keyH.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("H");                }            });
        keyI.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("I");                }            });
        keyJ.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("J");                }            });
        keyK.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("K");                }            });
        keyL.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("L");                }            });
        keyM.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("M");                }            });
        keyN.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("N");                }            });
        keyO.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("O");                }            });
        keyP.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("P");                }            });
        keyQ.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("Q");                }            });
        keyR.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("R");                }            });
        keyS.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("S");                }            });
        keyT.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("T");                }            });
        keyU.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("U");                }            });
        keyV.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("V");                }            });
        keyW.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("W");                }            });
        keyX.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("X");                }            });
        keyY.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("Y");                }            });
        keyZ.setOnClickListener(new View.OnClickListener() {                @Override                public void onClick(View view) {                     assignguess("Z");                }            });
    }

    public void answer_check()
    {
        if(ans.equals(sp.getans(index)))
        {
            TastyToast.makeText(getApplicationContext(), "You Win !!", TastyToast.LENGTH_LONG, TastyToast.SUCCESS);
        }
        else
        {
            TastyToast.makeText(getApplicationContext(), "You Loose !!", TastyToast.LENGTH_LONG, TastyToast.ERROR);

        }
    }
}