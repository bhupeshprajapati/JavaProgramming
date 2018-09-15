//An example of nested Try
class nestedTry{
    public static void main(String[]args){
        try{
            int a=args.length;
            /*If no command line arguments are present then,
            the following statement will generate a 
            divide-by-zero exception */
            int b =7/a;
            System.out.println("a= "+ a);
            
            try{//nested try block
                /*If one command line argument is given then the folling 
                statement will generate a divide-by-zero exception.*/
                if(a==1) a=a/(a-a);//divide by zero
                /*If two commandline argumends are used then 
                out-of-bound exception is generated.*/
                if(a==2) {
                    int c[]={1};
                    c[42]=99; //generating an out of bound exception
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound: "+ e);
            }
        }catch(ArithmeticException e){
            System.out.println("divide by 0: "+e);
        }
    }
}