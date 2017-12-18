package com.example.test.testapp;

import android.support.design.widget.CoordinatorLayout;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.example.test.testapp.objects.Actor;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public static final String ACTOR_ID = "ACTOR_ID";
    private CoordinatorLayout coordinatorLayout;
    private List<Actor> actors = MyBackend.actors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActorListAdapter adapter = new ActorListAdapter(this, R.layout.actor_list_item, actors);
        ListView lv = (ListView) findViewById(R.id.actorListView);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Actor actor = actors.get(position);
                intent.putExtra(ACTOR_ID, actor.getId());
                startActivity(intent);
                System.out.println(position + " : " + id);
            }
        });
    }


}
