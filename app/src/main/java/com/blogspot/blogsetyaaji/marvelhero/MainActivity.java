package com.blogspot.blogsetyaaji.marvelhero;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMarvel;
    private ArrayList<Marvel> dataMarvel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMarvel = findViewById(R.id.rv_marvel);
        rvMarvel.setHasFixedSize(true);

        dataMarvel.addAll(MarvelData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMarvel.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        AdapterMarvel adapterMarvel = new AdapterMarvel(this);
        adapterMarvel.setListData(dataMarvel);
        rvMarvel.setAdapter(adapterMarvel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_about :
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
