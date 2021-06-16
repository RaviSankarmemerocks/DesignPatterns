import java.util.List;
import java.util.Scanner;

class DB{
    static List<List<String>> students=new ArrayList<>();
    private DB(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        List<String> details=new ArrayList<>();

        System.out.println("Enter name");
        String data=sc.next();
        details.add(data);
        System.out.println("Enter Course");
        data=sc.next();
        details.add(data);

        System.out.println("Enter dob");
        data=sc.next();
        details.add(data);
        this.students.add(new ArrayList<>(details));
    }
    static DB db;
    public static DB getInstance(){//we can add "synchronized" keyword to make it //ThreadSafe
        if(db==null){
            return new DB();
        }
        return db;
    }
    public static List<List<String>> getStudents(){
        return students;
    }
}
public class CollegeDB {
    public static void main(String args[]){
        DB d1=DB.getInstance();
        System.out.println(d1.getStudents());
        DB d2=DB.getInstance();
        System.out.println(d2.getStudents());

    }
}


