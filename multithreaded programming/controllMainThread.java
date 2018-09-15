//Controlling the main thead
class controllMainThread{
    public static void main(String []args){
        Thread t= Thread.currentThread();
        System.out.println("Currnet thread: "+t);
        //Change the name of the thread
        t.setName("Bhupesh's Thread");
        System.out.println("After Renamein, new name is : "+ t);
        try{
            for(int i =5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
    }
}
