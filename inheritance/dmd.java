//Applying Dynamic method dispatch (applying Method Overloading)
//Use of Runtime-Polymorphysm
class figure{
    double dim1;
    double dim2;
    figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    double area(){
        System.out.println("Area of the figure undefined !");
        return 0;
    }
}
class Rectangle extends figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    //Overrides area for Rectangle
    double area(){
        System.out.println("Inside area of Rectangle.");
        return (dim1 * dim2);
    }
}
class Triangle extends figure{
    Triangle(double a, double b){
        super(a,b);
    }
    //Overrides area for right triangle
    double area(){
        System.out.println("Inside area of Triangle.");
        return(dim1*dim2/2);
    }
}
class dmd{ //for finding area
    public static void main(String args[]){
        figure f = new figure(10,10);
        Triangle t= new Triangle(9,5);
        Rectangle r= new Rectangle(10,8);
        figure figref;
        
        figref =r;//figref refrencing r
        System.out.println("Area is : "+ figref.area());

        figref =t;//figref refrencing t
        System.out.println("Area is : "+ figref.area());

        figref =f;//figref refrencing f
        System.out.println("Area is : "+ figref.area());
    }
}