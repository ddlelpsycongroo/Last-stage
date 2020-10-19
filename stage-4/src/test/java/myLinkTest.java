import org.junit.Test;

/**
 * @program: Last-stage
 * @description: 自己的链表的测试
 * @author: 孙杰
 * @create: 2020-10-19 20:01
 **/
public class myLinkTest {

    @Test
    public void setLink(){
        myLink<Integer> myLink = new myLink<>();
        myLink.add(1);
        myLink.add(2);
        myLink.add(3);
        myLink.add(5);
        myLink.add(7);
        System.out.println(myLink.toString());
        boolean contains = myLink.contains(3);
        System.out.println("链表中包含3吗 "+contains);
        Integer remove0 = myLink.remove(0);
        System.out.println("删除数据"+remove0);
        Integer remove1 = myLink.remove(1);
        System.out.println("删除数据"+remove1);
        System.out.println(myLink.toString());
        myLink.add(0, 1);
        System.out.println("在0位置增加数字1");
        myLink.add(2, 3);
        System.out.println("在2位置增加数字3");
        System.out.println(myLink.toString());
        Integer set = myLink.set(4, 6);
        System.out.println("4位置上的元素原来为"+set);
        System.out.println("把4位置上的元素换为6");
        System.out.println(myLink.toString());
    }
}
