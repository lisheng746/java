package com.lisheng.designpattern.adapter.impl;

import com.lisheng.designpattern.adapter.intf.AdvancedMediaPlayer;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
