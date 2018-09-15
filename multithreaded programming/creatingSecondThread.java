//Create a second thread by implementing Runnnable
class NewThread implements Runnable{
    Thread t;
    //Create a new,second thread
    NewThread(){
        t= new Thread(this,"New Bhupesh Jr.");
        System.out.println("Child thread: "+t);
        t.start();//strting the new thread
    }
    //This is the entry point for the second thread
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child : "+i);
                if(i%2==0){Thread.sleep(2000);}
                else
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exinting Child Thread");
    }
}
class creatingSecondThread{
    public static void main(String[]args){
        new NewThread();//Create a new thread
       
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main : "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted.");
        }
        System.out.println("Exiting Main Thread.");
    }
}

