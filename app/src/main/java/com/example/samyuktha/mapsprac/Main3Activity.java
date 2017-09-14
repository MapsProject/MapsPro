package com.example.samyuktha.mapsprac;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Main3Activity extends AppCompatActivity {

    List<Datafromhere> hamlist;
    FloatingActionButton fb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent getinc= getIntent();
        hamlist = getinc.getParcelableArrayListExtra("samhello");

        RecyclerView r=(RecyclerView)findViewById(R.id.reco);

        GridLayoutManager gm = new GridLayoutManager(this,2);

        gm.setOrientation(GridLayoutManager.VERTICAL);

        r.setLayoutManager(gm);

        Rec2 adapter= new Rec2(hamlist);

        r.setAdapter(adapter);

        fb2=(FloatingActionButton)findViewById(R.id.fab2);
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iy= new Intent(Main3Activity.this, MainActivity.class);
                startActivity(iy);
            }
        });

    }
}
