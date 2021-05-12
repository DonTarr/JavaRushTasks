public class Account {
int a;
int b;

public void setData (int a, int b){
    a=a;
    b=b;
    }
    public void showData () {
        System.out.println("Число А ="+a);
        System.out.println("Число B ="+b);
    }
    public static void main (String [] args){
    Account obj = new Account();
    obj.setData(2, 3);
    obj.showData();
    }
}


