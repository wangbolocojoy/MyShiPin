package com.dhuilang.wb.myshipin;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;

import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

public class PlayerActivity extends Activity {
    public final static String IMG_TRANSITION = "IMG_TRANSITION";
    public final static String TRANSITION = "TRANSITION";
    private StandardGSYVideoPlayer video_player;
    OrientationUtils orientationUtils;
    private boolean isTransition;
    private Transition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        initView();
        isTransition = getIntent().getBooleanExtra(TRANSITION, false);
        String url = "http://baobab.wdjcdn.com/14564977406580.mp4";
        video_player.setUp(url,false,false);
        video_player.startPlayLogic();


    }


    private void initView() {
        video_player.findViewById(R.id.video_player);
    }
}
