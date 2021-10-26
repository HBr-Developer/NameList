package com.example.namelist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        final EditText editText2 = findViewById(R.id.editText2);
        TextView textViewName = findViewById(R.id.textViewName);
        ListView ListViewName =findViewById(R.id.ListViewName);
        final List<String> data = new ArrayList<>();
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>( this, android.R.layout.simple_expandable_list_item_1 ,data );
        ListViewName.setAdapter(stringArrayAdapter);

        button1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public  void onClick(View v){
                        String name =editText2.getText().toString();
                        data.add(name);
                        stringArrayAdapter.notifyDataSetChanged();
                        editText2.setText("");
                    }
                }
        );


    }
}