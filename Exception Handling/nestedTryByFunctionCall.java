//Try statement can be implicitly nested via calls to methods
class nestedTryByFunctionCall{
    static void nestTry(int a){
        try{//nested try block
            /*If one command line argument is given then the folling 
            statement will generate a divide-by-zero exception.*/
            if(a==1) a=a/(a-a);//divide by zero
            /*If two commandline argumends are used then 
            out-of-bound exception is generated.*/
            if(a==2) {
                int c[]={1};
                c[23]=99; //generating an out of bound exception
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound: "+ e);
        }
    }
    public static void main(String[]args){
        try{
            int a=args.length;
            /*if no command line arguments are present then
            divide-by-zero exception will be generated.*/
            int b=1/a;
            System.out.println("a= "+ a);
            nestTry(a); //calling the static function for nestedTry
        }catch(ArithmeticException e){
            System.out.println("Divide by 0:" +e);
        }
    }
}