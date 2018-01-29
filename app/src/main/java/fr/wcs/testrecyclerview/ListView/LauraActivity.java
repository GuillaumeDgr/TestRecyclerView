package fr.wcs.testrecyclerview.ListView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import fr.wcs.testrecyclerview.RecyclerView.MainActivity;
import fr.wcs.testrecyclerview.R;

public class LauraActivity extends AppCompatActivity {

    ListView mListView;
    LauraAdapter mLauraAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laura);

        mListView = findViewById(R.id.listView);

        ArrayList<LauraModel> modelArrayList = new ArrayList<>();

        modelArrayList.add(new LauraModel("Laura", "ici", "23"));
        modelArrayList.add(new LauraModel("John", "la", "93"));
        modelArrayList.add(new LauraModel("Francky", "ici ou la", "232"));
        modelArrayList.add(new LauraModel("Bobby", "la bas", "43"));
        modelArrayList.add(new LauraModel("Mamadou", "a mamadouville", "123"));

        mLauraAdapter = new LauraAdapter(this, modelArrayList);
        mListView.setAdapter(mLauraAdapter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauraActivity.this, MainActivity.class));
            }
        });
    }
}
