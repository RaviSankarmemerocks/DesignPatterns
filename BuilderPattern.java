class PhoneBuilder{
    String os;
    String ram;
    String processor;
    String storage;
    String cam;
    public PhoneBuilder setOS(String os){
        this.os=os;
        return this;
    }
    public PhoneBuilder setRam(String ram){
        this.ram=ram;
        return this;
    }
    public PhoneBuilder setProcessor(String processor){
        this.processor=processor;
        return this;
    }
    public PhoneBuilder setStorage(String storage){
        this.storage=storage;
        return this;
    }
    public PhoneBuilder setCam(String cam){
        this.cam=cam;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,ram,processor,storage,cam);
    }
}
class Phone{
    String os;
    String ram;
    String processor;
    String storage;
    String cam;
    Phone(String os,String ram,String processor,String storage,String cam){
        this.os=os;
        this.ram=ram;
        this.processor=processor;
        this.storage=storage;
        this.cam=cam;
    }
   public String toString(){
       return "Phone is ready with "+os+" os, "+ram+" ram, "+processor+" processor, "+storage+" storage, "+cam+" maga pixel camera";
   }



}
public class BuilderPattern {
    public static void main(String args[]){
        PhoneBuilder phbuild=new PhoneBuilder().setOS("android").setCam("12").setProcessor("quard-core");
        Phone ph= phbuild.getPhone();
        System.out.println(ph.toString());
    }
}

