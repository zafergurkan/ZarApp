package com.example.zafer.zarapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    TextView zarSonuc;
    ImageView zarResim1,zarResim2;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void zarAt(View view){
        System.out.println("Butona tıklandı");

        zarResim1 = (ImageView)findViewById(R.id.imageView);
        zarResim2 = (ImageView)findViewById(R.id.imageView2);

        System.out.println("text view tanımlandı");

        Random random = new Random();
        int Low = 1;
        int High = 7;

        int a =random.nextInt(High-Low)+Low;
        int b =random.nextInt(High-Low)+Low;

        System.out.println(a);
        System.out.println(b);

        zarKontrol(a,b);

       //efekt();


        String variableValue = "zar_"+a;
        String variableValue1 = "zar_"+b;
        zarResim1.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
        zarResim2.setImageResource(getResources().getIdentifier(variableValue1, "drawable", getPackageName()));

    }

    /*private void efekt() {

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 1; i <= 6; i++) {
                    System.out.println("i : "+i);
                    zarResim1 = (ImageView) findViewById(R.id.imageView);
                    zarResim2 = (ImageView) findViewById(R.id.imageView2);
                    String variableValue = "zar_" + i;
                    zarResim1.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
                    zarResim2.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));

                }
            }
        },0, 1000); // 1000 milisaniye  = 1 saniye

    }*/
    public void zarKontrol(int x,int y){
        zarSonuc = (TextView)findViewById(R.id.zarKontrol);
        zarSonuc.setText("");

        String[][] zarKarsilik = new String[7][7];
        System.out.println("Zar string oluştu");

        for(int i = 0; i<=6;i++){
            for (int j=0; j<=6;j++){
                zarKarsilik[i][j] = "Boş";
            }
        }
        zarKarsilik[1][1] = "Hep Yek";
        zarKarsilik[1][2] = "Yek-i dü";
        zarKarsilik[1][3] = "Se Yek";
        zarKarsilik[1][4] = "Cihar-ı Yek";
        zarKarsilik[1][5] = "Penc-i Yek";
        zarKarsilik[1][6] = "Şeş-i Yek";

        zarKarsilik[2][1] = "Yek-i dü";
        zarKarsilik[2][2] = "Dubara";
        zarKarsilik[2][3] = "Seba-i Dü";
        zarKarsilik[2][4] = "Cihar-i Dü";
        zarKarsilik[2][5] = "Penc-i Dü";
        zarKarsilik[2][6] = "Şeş-i Dü";

        zarKarsilik[3][1] = "Se Yek";
        zarKarsilik[3][2] = "Seba-i Dü";
        zarKarsilik[3][3] = "Dü Se";
        zarKarsilik[3][4] = "Cihar-ü Se";
        zarKarsilik[3][5] = "Penc-ü Se";
        zarKarsilik[3][6] = "Şeş-ü Se";

        zarKarsilik[4][1] = "Cihar-ı Yek";
        zarKarsilik[4][2] = "Cihar-i Dü";
        zarKarsilik[4][3] = "Cihar-ü Se";
        zarKarsilik[4][4] = "Dört Cihar";
        zarKarsilik[4][5] = "Beş Dört";
        zarKarsilik[4][6] = "Şeş Cihar";

        zarKarsilik[5][1] = "Penc-i Yek";
        zarKarsilik[5][2] = "Penc-i Dü";
        zarKarsilik[5][3] = "Penc-ü Se";
        zarKarsilik[5][4] = "Beş Dört";
        zarKarsilik[5][5] = "Dü Beş";
        zarKarsilik[5][6] = "Şeş Beş";

        zarKarsilik[6][1] = "Boş";
        zarKarsilik[6][2] = "Şeş-i Dü";
        zarKarsilik[6][3] = "Şeş-ü Se";
        zarKarsilik[6][4] = "Şeş Cihar";
        zarKarsilik[6][5] = "Şeş Beş";
        zarKarsilik[6][6] = "Şeş-i Yek";


        zarSonuc.setText(zarKarsilik[x][y]);
    }
}
