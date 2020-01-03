package com.monesz.implicitintentsvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    Button btnCall, btnCallFriend, btnWeb, btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = findViewById(R.id.btnCall);
        btnCallFriend = findViewById(R.id.btnCallFriend);
        btnWeb = findViewById(R.id.btnWeb);
        btnMap = findViewById(R.id.btnMap);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });
        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:07550261789"));
                startActivity(intent);

            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.hu"));
                startActivity(intent);

            }
        });
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q= 15 Wescott Way, Uxbridge"));
                startActivity(intent);

            }
        });
    }
}
