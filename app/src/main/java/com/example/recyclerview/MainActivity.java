package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.recyclerview.AdapterClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lngRV;
    private EditText addEdt;
    private Button addBtn;
    private ArrayList<String> lngList;
    private AdapterClass adapterClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lngRV = findViewById(R.id.idRVItems);
        addEdt = findViewById(R.id.idEdtAdd);
        addBtn = findViewById(R.id.idBtnAdd);
        lngList = new ArrayList<>();

        // Initialize the adapter
        adapterClass = new AdapterClass(lngList, this);

        // Set the RecyclerView's layout manager
        lngRV.setLayoutManager(new LinearLayoutManager(this));

        // Set the adapter to the RecyclerView
        lngRV.setAdapter(adapterClass);

        lngList.add("C++");
        lngList.add("H++");

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem(addEdt.getText().toString());
            }

            private void addItem(String string) {
                if (!string.isEmpty()) {
                    lngList.add(string);
                    adapterClass.notifyDataSetChanged();
                }
            }
        });
    }
}
