//using join to wait for thread to finish
class Newthread implements Runnable{
    String name;
    Thread t;
    Newthread(String threadname){
        name=threadname;
        t= new Thread(this,name);
        System.out.println("New thread: "+t);
        t.start();
    }
    //this is the entry for the thread 
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+" : "+i );
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+" interrupted");
        }
        System.out.println(name+" exiting");
    }
}
class isAliveAndJoin{
    public static void main(String[]args){
        Newthread ob1 =new Newthread("One");
        Newthread ob2 =new Newthread("Two");
        Newthread ob3 =new Newthread("Three");
        System.out.println("Thread one is alive: "+ob1.t.isAlive());
        System.out.println("Thread two is alive: "+ob2.t.isAlive());
        System.out.println("Thread three is alive: "+ob3.t.isAlive());

        //wait for threads to finish
        try{
            System.out.println("waiting for threads to finish");
            ob1.t.join();//waiting for thread 1 to finish
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        //All threads are finished till
        System.out.println("Thread one is alive: "+ob1.t.isAlive());
        System.out.println("Thread two is alive: "+ob2.t.isAlive());
        System.out.println("Thread three is alive: "+ob3.t.isAlive());
    }
}