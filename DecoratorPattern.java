
interface Shape{
    public void draw();
}
class Circle_Shape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
class Rectangle_Shape implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Reactangle");
    }
}
abstract class Decorator implements Shape{
    Shape decorateShape;
    Decorator(Shape ds){
        this.decorateShape=ds;
    }

    @Override
    public void draw() {
        decorateShape.draw();
    }
}
 class Redcolour extends Decorator {
    Redcolour(Shape s){
        super(s);
    }
    @Override
    public void draw() {
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
public class DecoratorPattern {
    public static void main(String args[]){
        Shape cir=new Circle_Shape();
        cir.draw();
        
        Shape redcir=new Redcolour(new Circle_Shape());
        redcir.draw();
    }

}


