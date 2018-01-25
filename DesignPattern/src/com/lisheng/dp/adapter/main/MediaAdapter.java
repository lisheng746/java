package com.lisheng.dp.adapter.main;

import com.lisheng.dp.adapter.impl.Mp4Player;
import com.lisheng.dp.adapter.impl.VlcPlayer;
import com.lisheng.dp.adapter.intf.AdvancedMediaPlayer;
import com.lisheng.dp.adapter.intf.MediaPlayer;

/**
 * Created by lisheng on 2018/1/24.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
