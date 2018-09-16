//An incorrect implementation of a producer and consumer
class Q{
    int n;
    synchronized int get(){
        System.out.println("Got: "+n);
        return n;
    }
    synchronized void put(int n){
        this.n=n;
        System.out.println("Put: "+n);
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this,"Producer").start(); //Starting the thread in the declaration line
    }
    public void run(){
     //   try{
        int i =0;
        while(true){
            q.put(i++);
            //Thread.sleep(1000);
        }  
    }//catch(InterruptedException e){
      //  System.out.println("interrupted");      
   // }
//}
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run(){
        //try{
        while(true){
            q.get();
            //Thread.sleep(1000);
        }
    }//catch(InterruptedException e){
       // System.out.println("interrupted");
   // }
    //}
}
class incorrectProducerConsumer{
    public static void main(String[]args){
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
       // System.out.println("Press Ctr-C to stop");
    }
}
//doubt : after adding a try block in the run() of both get()and put() the producer
//and consumers are working correctly , why?

//remove comments form the try and catch statements and the compile and run.