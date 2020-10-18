public class Singer implements SingerInterface {

    private String name;

    public Singer(String name) {
        this.name = name;
    }

    public void sing() {
        System.out.println(name + ", it's your show time: 余音绕梁，不绝回响，三日不知肉味~");
    }
}
