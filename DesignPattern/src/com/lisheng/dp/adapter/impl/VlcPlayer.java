package com.lisheng.dp.adapter.impl;

import com.lisheng.dp.adapter.intf.AdvancedMediaPlayer;

/**
 * Created by lisheng on 2018/1/24.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
