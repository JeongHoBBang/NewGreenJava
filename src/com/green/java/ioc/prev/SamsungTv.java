package com.green.java.ioc.prev;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;

public class SamsungTv implements Tv {
    private Speaker speaker;
    public SamsungTv(){
        speaker = new AppleSpeaker();
    }
    @Override
    public void turnOn() {
        System.out.println("삼성tv 켜키");
        speaker.volumUp();

    }

    @Override
    public void turnOff() {
        System.out.println("삼성tv 끄기");
        speaker.vloumeDown();
    }
}
