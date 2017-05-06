package com.example.ymgymg.liftscyle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    int position;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.textView);
        System.out.println("onCreate");
	System.out.println("gui change second");
        player=MediaPlayer.create(this,R.raw.bb);
        player.start();
        if (savedInstanceState!=null){
            tv.setText(""+savedInstanceState.get("gui"));
        }
    }

	
	

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause");
        //启动second时暂停play
        if (player.isPlaying()){
            player.pause();
            position=player.getCurrentPosition();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume");
        player.seekTo(position);
        player.start();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy");
        if (player!=null){
            player.stop();
            player=null;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("gui","yeye");
    }

    public void click(View view){
        Intent intent=new Intent(MainActivity.this,Second.class);
        startActivity(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop");

    }



    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart");

    }



    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart");

    }
}
