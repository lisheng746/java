package com.lisheng.designpattern.adapter.main;

import com.lisheng.designpattern.adapter.impl.Mp4Player;
import com.lisheng.designpattern.adapter.impl.VlcPlayer;
import com.lisheng.designpattern.adapter.intf.AdvancedMediaPlayer;
import com.lisheng.designpattern.adapter.intf.MediaPlayer;

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
