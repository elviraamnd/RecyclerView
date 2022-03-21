package com.example.recycleviewelvira;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.sate,R.drawable.pempek,R.drawable.rendang,R.drawable.ketoprak,R.drawable.gudeg,
                    R.drawable.batagor,R.drawable.siomay,R.drawable.rawon,R.drawable.serombotan,R.drawable.bakso};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById (R.id.recyclerView);

        s1 = getResources ().getStringArray(R.array.indonesian_foods);
        s2 = getResources ().getStringArray (R.array.description);

        MyAdapter myAdapter = new MyAdapter( this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}