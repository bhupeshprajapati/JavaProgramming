//creating multiple threads
class newthread implements Runnable{
    String name;
    Thread t;
    newthread(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("New Thread: "+ t);
        t.start();//starting the new thread
    }
    //this is the enterance to the new thread 
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(t.getName()+" prints: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("thread is interrupted.");
        }
        System.out.println(t.getName() + " is exinting.");
    }
}
class multipleThreads{
    public static void main(String []args){
        new newthread("My");
        new newthread("Name");
        new newthread("is");
        new newthread("Bhupesh");
        try{//waiting for othre threads to exit
           Thread.sleep(15000);
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("exiting");
    }
}