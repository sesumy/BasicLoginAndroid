package com.example.sesumy.welcomename;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);
        TextView isim=(TextView) findViewById (R.id.kullaniciAdi2);

        Bundle gelenIsim=getIntent ().getExtras ();
        isim.setText (gelenIsim.getString("AdSoyad"));

        TextView tv = (TextView) findViewById(R.id.tarihSaat2);

        String dt;
        Date cal = (Date) Calendar.getInstance().getTime();
        dt = cal.toLocaleString();
        tv.setText(dt.toString());

    }
}
