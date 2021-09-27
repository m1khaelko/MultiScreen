package com.mrz.multiscreen;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ListActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] countries = {"Аргентина", "Бразилия", "Чили", "Колумбия", "Уругвай"};
    ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
    AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener();


    public void onItemClick() {
        {
            switch (position) {
                case 0:
                    Intent intent = new Intent(MainActivity.this, Argentina.class);
                    startActivity(intent);
                    break;
                case 1:
                     intent = new Intent(MainActivity.this, Brasilia.class);
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(MainActivity.this, Chili.class);
                    startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(MainActivity.this, Columbia.class);
                    startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(MainActivity.this, Uruguay.class);
                    startActivity(intent);
                    break;
            }
        }
        @Override
        public void onItemClick (AdapterView<?>parent, View view,int position, long id)
        {
            Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            getListView();
        }
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState;){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.argentina);
            setContentView(R.layout.brasilia);
            setContentView(R.layout.chili);
            setContentView(R.layout.columbia);
            setContentView(R.layout.urugvai);
        }

        Intent intent = new Intent(MainActivity.this, Argentina.class);
        startActivity(intent);
        setListAdapter(mAdapter);
        Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
        getListView();
    }
}
