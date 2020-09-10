/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-11
 * Time:6:03
 **/
public class MyArrayList {

    private int[] elem;
    private int usedSize;
    public static final int SIZE = 100;

    public MyArrayList() {
        this.elem = new int[SIZE];
        this.usedSize = 0;
    }
    public void add(int pos,int data){
        if (pos < 0 || pos > this.usedSize){
            throw new RuntimeException("pos位置不合法!");
        }
        for (int i = this.usedSize; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
         }
         this.elem[pos] = data;
        this.usedSize++;
    }
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+"  ");
        }
        System.out.println();
    }
    public int size(){
        return this.usedSize;
    }
    public boolean contains(int x){
        for (int m: elem) {
            if (m == x){
                return true;
            }
        }
        return false;
    }
    public int search(int x){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i]  == x){
                return i;
            }
        }
        return -1;
    }
    public void remove(int x){
        int ret = search(x);
        if (ret == -1){
            System.out.println("没有当前要删除的元素");
            return;
        }
        for (int i = ret; i < this.usedSize; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize -- ;
    }
}
