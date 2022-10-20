/* Programmer   : Dwi Prabowo
    NIM         : A11.2021.13761
    Keterangan  : Aplikasi Biodata 1 Oktober 2022
 */
package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cellPhone(View v)
    {
        Uri uri = Uri.parse("tel:08122807525");
        Intent phone = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(phone);
    }

    public void showMap(View v)
    {
        Uri uri = Uri.parse("https://www.google.com/maps/place/Jl.+Sumur+Adem,+Kec.+Genuk,+Kota+Semarang,+Jawa+Tengah+50115/@-6.973875,110.4757294,17z/data=!3m1!4b1!4m5!3m4!1s0x2e708d2b4014b3e1:0x5803bffa1b740e49!8m2!3d-6.973875!4d110.4779181");
        Intent map = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(map);
    }

    public void sendEmail(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"dwiprabowo217@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Mobile Application Learning");

        try {
            startActivity(Intent.createChooser(intent, "Ingin mengirim email?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}