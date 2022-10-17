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
        Uri uri = Uri.parse("geo: -6.973818, 110.476873");
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