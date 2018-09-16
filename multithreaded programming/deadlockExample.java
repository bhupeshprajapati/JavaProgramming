//An Example of Deadlock
class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered A.foo");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("A Interrupted.");
        }
        System.out.println(name+" trying to call B.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println("Inside A.last");
    }
}
class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered B.bar");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("B Interrupted.");
        }
        System.out.println(name+" trying to call A.last()");
        a.last();
    }
    synchronized void last(){
        System.out.println("Inside B.last");
    }
}
class deadlockExample implements Runnable{
    A a=new A();
    B b=new B();
    deadlockExample(){
    Thread.currentThread().setName("mainThread");
    Thread t= new Thread(this,"RacingThread");
    t.start();
    a.foo(b);//get lock on a in this thread.
    System.out.println("back in main thread");
    }
    public void run(){
        b.bar(a);//get lock on b in other thread.
        System.out.println("Back in other thread");
    }
    public static void main(String[]args){
        new deadlockExample();
    }
}