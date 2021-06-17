interface Chain{
    public void setNextChain(Chain c);
    public void calculate(Number num);
}
class Number{
    int n1;
    int n2;
    String calc;
    Number(int n1,int n2,String calc){
        this.n1=n1;
        this.n2=n2;
        this.calc=calc;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public String getCalc() {
        return calc;
    }
}
class Add implements Chain{
    Chain next;
    Number nums;

    @Override
    public void setNextChain(Chain c) {
            this.next=c;
    }

    @Override
    public void calculate(Number num) {
        if(num.getCalc().equals("add")){
            System.out.println(num.n1+"+"+num.n2+"="+(num.n1+num.n2));
            return;
        }else{
            next.calculate(num);
        }
    }
}
class Sub implements Chain{
    Chain next;
    Number nums;

    @Override
    public void setNextChain(Chain c) {
        this.next=c;
    }

    @Override
    public void calculate(Number num) {
        if(num.getCalc().equals("sub")){
            System.out.println(num.n1+"-"+num.n2+"="+(num.n1-num.n2));
            return;
        }else{
            next.calculate(num);
        }
    }
}
class Mul implements Chain{
    Chain next;
    Number nums;

    @Override
    public void setNextChain(Chain c) {
        this.next=c;
    }

    @Override
    public void calculate(Number num) {
        if(num.getCalc().equals("mul")){
            System.out.println(num.n1+"*"+num.n2+"="+(num.n1*num.n2));
            return;
        }else{
            next.calculate(num);
        }
    }
}
class Div implements Chain{
    Chain next;
    Number nums;

    @Override
    public void setNextChain(Chain c) {
        this.next=c;
    }

    @Override
    public void calculate(Number num) {
        if(num.getCalc().equals("div")){
            System.out.println(num.n1+"+/"+num.n2+"="+(num.n1/num.n2));
            return;
        }else{
            System.out.println("only supports add sub mul div");
            return;
        }
    }
}
public class ChainofResponsibility {
    public static void main(String args[]){
        Chain c1=new Add();
        Chain c2=new Sub();
        Chain c3=new Mul();
        Chain c4=new Div();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c1.calculate(new Number(4,2,"add"));


    }
}

