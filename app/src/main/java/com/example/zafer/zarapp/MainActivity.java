package com.example.zafer.zarapp;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView zarSonuc;
    ImageView zarResim1,zarResim2;
    Random random = new Random();
    int Low = 1;
    int High = 7;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void zarAt(View view){
        System.out.println("Butona tıklandı");
        efekt();
    }

    private void efekt() {
                new CountDownTimer(1500,150){

                    @Override
                    public void onTick(long millisUntilFinished) {
                            a =random.nextInt(High-Low)+Low;
                            b =random.nextInt(High-Low)+Low;

                            zarResim1 = (ImageView) findViewById(R.id.imageView);
                            zarResim2 = (ImageView) findViewById(R.id.imageView2);

                            String variableValue = "zar_"+a;
                            String variableValue1 = "zar_"+b;

                            zarResim1.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
                            zarResim2.setImageResource(getResources().getIdentifier(variableValue1, "drawable", getPackageName()));

                        }


                    @Override
                    public void onFinish() {
                        System.out.println("text view tanımlandı");

                        zarKontrol(a,b);

                        String variableValue = "zar_"+a;
                        String variableValue1 = "zar_"+b;
                        zarResim1.setImageResource(getResources().getIdentifier(variableValue, "drawable", getPackageName()));
                        zarResim2.setImageResource(getResources().getIdentifier(variableValue1, "drawable", getPackageName()));

                    }
                }.start();

            }

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
