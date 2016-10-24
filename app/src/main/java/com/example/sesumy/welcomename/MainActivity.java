package com.example.sesumy.welcomename;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    Button login;
    EditText kullaniciAd;
    EditText sifre;
    String ad;
    String sif;
    String AdSoyad="Sümeyye SEVİNÇ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        login = (Button) findViewById (R.id.login);
        kullaniciAd = (EditText) findViewById (R.id.kullaniciAdi1);
        sifre = (EditText) findViewById (R.id.sifre1);

        ad = String.valueOf (kullaniciAd.getText());
        sif = String.valueOf (sifre.getText ());

        System.out.println(sif);
        System.out.println(ad);

        login.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                if (kullaniciAd.getText().toString().equals("Sesumy") && sifre.getText().toString().equals("123456")) {
                        Intent intent = new Intent (MainActivity.this, Main2Activity.class);
                        intent.putExtra ("AdSoyad", AdSoyad);
                        startActivity (intent);

                    }
                }

        });
    }

}
