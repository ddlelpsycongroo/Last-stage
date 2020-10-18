public class StaticProxyOps {
    public static void main(String[] args) {
        Singer singer = new Singer("宋建华");
        SingerProxy sp = new SingerProxy(singer);
        sp.sing();
    }
}