/**
 * @program: Last-stage
 * @description: 自己的link
 * @author: 孙杰
 * @create: 2020-10-19 19:09
 **/
public class myLink<E> {
    private Node<E> node;
    private int size;

    static class Node<E> {
        E data;
        Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    //获取最后一个节点
    private Node<E> getLastNode() {
        Node<E> newNode = node;
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        return newNode;
    }

   //在此列表中指定的位置插入指定的元素。
    public void add(int index, E element) {
        checkIndex(index);
        Node<E> newNode = new Node<>(element,null);
        if (index == 0){
            newNode.next = node;
            node = newNode;
        } else {
            Node<E> nodeByIndex = getNodeByIndex(index - 1);
            newNode.next = nodeByIndex.next;
            nodeByIndex.next = newNode;
        }

    }

    //是否包含此元素
    public boolean contains(Object o) {
        Node<E> newNode = node;
        if (newNode == null){
            return false;
        }
        while (newNode.next != null){
            if (newNode.data != o){
                newNode = newNode.next;
            } else {
                return true;
            }
        }
        return newNode.data == o;
    }

    //移除此列表中指定位置处的元素。
    public E remove(int index) {
        E result = null;
        checkIndex(index);
        if (index == 0){
            Node<E> nodeByIndex = getNodeByIndex(index);
            node = node.next;
            result = nodeByIndex.data;
        } else {
            Node<E> nodeByIndex = getNodeByIndex(index-1);
            result = nodeByIndex.next.data;
            nodeByIndex.next = nodeByIndex.next.next;
        }
        return result;
    }

    //将此列表中指定位置的元素替换为指定的元素。
    public E set(int index, E element) {
        E result = null;
        checkIndex(index);
        Node<E> nodeByIndex = getNodeByIndex(index);
        result = nodeByIndex.data;
        nodeByIndex.data = element;
        return result;
    }

    //从此列表中移除所有元素。
    public void clear() {
        this.size = 0;
        node = null;
    }

    //添加一个节点
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e, null);
        if (node == null) {
            node = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
        return true;
    }

    //获取指定索引处节点
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> newNode = node;
        for(int i = 0; i < index; i++) {
            newNode = newNode.next;
        }
        return newNode;
    }

    //检查输入的索引
    private void checkIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }

    //懂的都懂，不懂写了注释也不懂
    public String  toString(){
        StringBuilder resulet = new StringBuilder("[");
        Node<E> newNode = node;
        while (newNode.next != null){
            resulet.append(newNode.data).append(",");
            newNode = newNode.next;
        }
        resulet.append(newNode.data).append("]");
        return resulet.toString();
    }
}
