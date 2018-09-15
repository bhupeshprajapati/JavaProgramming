class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "MyException[" + detail + "]";
    }
}
class customException{
    static void compute(int a) throws MyException{
        System.out.println("called compute{"+a+"}");
       if(a>10) throw new MyException(a);//When the if condition is removed the following statement is unreachable
        System.out.println("Normal exit");//this statement will not execute if a<10
    }
    public static void main(String[]args){
        try{
            compute(1);
            compute(20);
        }catch(MyException e){
            System.out.println("caught :"+ e);
        }
    }
}