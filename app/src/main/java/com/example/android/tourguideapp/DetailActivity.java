package com.example.android.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img1,web,loc;
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        web=findViewById(R.id.web);
        loc=findViewById(R.id.loc);
        //Fetch the data from Recycler View
        img1=findViewById(R.id.imageView2);
        txt1=findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int Image = bundle.getInt("Image");
            img1.setImageResource(Image);
           String name=bundle.getString("name");
           txt1.setText(name);
           String web=bundle.getString("web");
           String loc=bundle.getString("loc");
        }

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String info =bundle.getString("web");
                Intent i2 = new Intent(Intent.ACTION_WEB_SEARCH);
                i2.putExtra(SearchManager.QUERY, info);
                if (i2.resolveActivity(getPackageManager()) != null) {
                    startActivity(i2);
                }
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse(bundle.getString("loc"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(mapIntent);
                }


            }
        });


    }
}