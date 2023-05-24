package com.green.java.ioc.next;

import com.green.java.ioc.Speaker;
import com.green.java.ioc.Tv;
import com.green.java.ioc.Woofer;

public class TvFactory {
    public static Tv getInstance(String speaker){
        Woofer woofer = new BoWoofer();
        switch (speaker){
            case "Apple":
                Speaker s1 = new AppleSpeaker(woofer);
                return new SamsungTv(s1);
            case "Haman":
                Speaker s2 = new HamanSpeaker(woofer);
                return new SamsungTv(s2);
        }
        return null;
    }
}
