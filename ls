[1mdiff --git a/app/src/main/java/com/example/ymgymg/liftscyle/MainActivity.java b/app/src/main/java/com/example/ymgymg/liftscyle/MainActivity.java[m
[1mindex 37bffc4..11e9078 100644[m
[1m--- a/app/src/main/java/com/example/ymgymg/liftscyle/MainActivity.java[m
[1m+++ b/app/src/main/java/com/example/ymgymg/liftscyle/MainActivity.java[m
[36m@@ -1,4 +1,4 @@[m
[31m-package com.example.ymgymg.liftscyle;[m
[32m+[m[32m﻿package com.example.ymgymg.liftscyle;[m
 [m
 import android.content.Intent;[m
 import android.media.MediaPlayer;[m
[36m@@ -20,6 +20,7 @@[m [mpublic class MainActivity extends AppCompatActivity {[m
         setContentView(R.layout.activity_main);[m
         tv= (TextView) findViewById(R.id.textView);[m
         System.out.println("onCreate");[m
[32m+[m	[32mSystem.out.println("gui change");[m
         player=MediaPlayer.create(this,R.raw.bb);[m
         player.start();[m
         if (savedInstanceState!=null){[m
[36m@@ -27,6 +28,9 @@[m [mpublic class MainActivity extends AppCompatActivity {[m
         }[m
     }[m
 [m
[32m+[m[41m	[m
[32m+[m[41m	[m
[32m+[m
     @Override[m
     protected void onPause() {[m
         super.onPause();[m
