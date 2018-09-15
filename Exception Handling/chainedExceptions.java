//Programm to demonstrate exception chaining
//initCause() and getCause() are inbuilt methods in Exception class
class chainedExceptions{
    static void demoproc(){
        //create an exception
        NullPointerException e=new NullPointerException("Top Layer");
        //add a cause
        e.initCause(new ArithmeticException("This is the Cause"));

        throw e;
    }
    public static void main(String[]args){
        try{
            demoproc();
        }catch(NullPointerException e){
            //display top level exception
            System.out.println("Caught :"+e);
            //display cause exception
            System.out.println("original cause :" + e.getCause());
        }
    }
}

