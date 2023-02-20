class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung",  32);

        System.out.println(tv);  // toString() automatically called

        tv.mute();               // put it in the muted state
        System.out.println(tv);

        tv.mute();               // unmutes it, should be back to volume 32
        System.out.println(tv);

        tv.mute();               // back into the muted state
        System.out.println(tv);

        tv.setVolume(50);        // should automatically unmute, and now be volume 50
        System.out.println(tv);
    }
}