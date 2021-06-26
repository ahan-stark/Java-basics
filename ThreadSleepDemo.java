class Hi{
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

class Hey{
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("Hey");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class ThreadSleepDemo {

    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hey obj2 = new Hey();
        obj1.show();
        obj2.show();
    }
}