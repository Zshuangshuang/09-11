/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-11
 * Time:6:03
 **/
public class TestDemo {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,12);
        myArrayList.add(1,3);
        myArrayList.add(2,14);
        myArrayList.add(3,40);
        myArrayList.display();
        System.out.println(myArrayList.contains(4));
        myArrayList.remove(3);
        myArrayList.display();
        myArrayList.remove(90);
        myArrayList.display();
    }
}
