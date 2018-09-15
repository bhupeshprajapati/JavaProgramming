//This is an example of throws
class throwsExample{
    static void Throwone() throws IllegalAccessException {
        System.out.println("Inside ThrowOne.");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String[]args){
        try{
            Throwone();            
        }catch(IllegalAccessException e){
            System.out.println("Caught :"+e);
        }
    }
}