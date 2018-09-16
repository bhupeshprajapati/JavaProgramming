//This program is synchronized using synchornized keyword on line 3.
class Callme{
    synchronized void call(String msg){ //only added synchronized keyword in notSynchronized code
        System.out.print("["+ msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    Caller(Callme targ,String s){
        msg=s;
        target=targ;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}
class Synchronized{
    public static void main(String[]args){
        Callme target=new Callme();
        System.out.println("Made an instance target of Callme class which contains call() method.");
        Caller ob1=new Caller(target,"Hello");
        Caller ob2=new Caller(target,"Synchronized"); 
        Caller ob3=new Caller(target,"World");

        //wait for threads to end
        try{
          //  System.out.println("Waiting for all threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("main thread Interrupted");
        }
    }
}
//Output of this program is as expected.
//[Hello]
//[Synchronized]
//[World]