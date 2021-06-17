interface ChatRoom {

    public void showMsg(String msg, Participant p);

}

class ChatRoomImpl implements ChatRoom{

    @Override
    public void showMsg(String msg, Participant p) {

        System.out.println(p.getName()+"'sends message: "+msg);

    }
}
 abstract class Participant {
    public abstract void sendMsg(String msg);

    public abstract void setname(String name);

    public abstract String getName();
}

class User1 extends Participant {

    private String name;
    private ChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg,this);

    }

    @Override
    public void setname(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User1(ChatRoom chat){
        this.chat=chat;
    }

}

 class User2 extends Participant {

    private String name;
    private ChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg,this);

    }

    @Override
    public void setname(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User2(ChatRoom chat){
        this.chat=chat;
    }



}
public class MediatorPattern {
    public static void main(String args[])
    {

        ChatRoom chat = new ChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setname("Ravi Sankar");
        u1.sendMsg("Hi Ajith! how are you?");


        User2 u2=new User2(chat);
        u2.setname("Ajith Kumar");
        u2.sendMsg("I am Fine ! Hau?");
    }

