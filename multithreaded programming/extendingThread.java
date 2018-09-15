//Creating a new thread by extending Thread Class
class newThread extends Thread{
    newThread(){
        super("Demo Thread");
        System.out.println("Child Thread: "+ this);
        start();
    }
    //This is the entry point for the second Thread
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread exiting.");
    }
}
class extendingThread{
    public static void main(String[]args){
        new newThread();
        try{
            for(int m=5;m>0;m--){
                System.out.println("Main : "+m);
                Thread.sleep(1000);
            }
        }  catch(InterruptedException l){
           System.out.println("main thread interrupted.");
        }
        System.out.println("main thread exiting.");
    } 
}