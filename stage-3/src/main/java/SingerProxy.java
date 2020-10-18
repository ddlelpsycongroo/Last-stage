public class SingerProxy {
    private Singer singer;

    public SingerProxy(Singer singer) {
        this.singer = singer;
    }

    public void sing() {
        System.out.println("歌手演唱之前，需要经纪人来接通告~");
        singer.sing();
        System.out.println("收钱走人");
    }
}