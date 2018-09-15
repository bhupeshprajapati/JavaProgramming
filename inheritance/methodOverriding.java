//Method overriding
class A{
    int i,j;
    A(int a,int b){
        j=a;
        i=b;
    }
    //display i and j
    void show(){
        System.out.println("i and j:" + i+ " "+j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }
    void show(){//display k - this overrides show() in A.
        super.show(); // this calls show() from A
        System.out.println("k: "+ k);        
    }
}
class methodOverriding{
    public static void main(String []args){
        B subOb = new B(1,2,3);
        subOb.show();//this calls show() in B
    }
}