package com.example.priya_000.fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager FM=getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();

                Fragment_one F1=new Fragment_one();

            FT.add(R.id.f1, F1);
                FT.addToBackStack("f1");
                FT.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager FM=getFragmentManager();
                FragmentTransaction FT=FM.beginTransaction();

                Fragment_two F2=new Fragment_two();

                FT.add(R.id.f2, F2);
                FT.addToBackStack("f2");
                FT.commit();

            }
        });

    }
}
