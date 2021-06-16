interface db{
    public void executequery(String q);
}
class dbexecuter implements db{
    @Override
    public void executequery(String q) {
        System.out.println("executing query: "+q);
    }
}
class dbexecuterproxy implements db{
    boolean isadmin;
    dbexecuter dbx;
    dbexecuterproxy(String s,String p){
        if(s.equals("admin")&&p.equals("admin@123")){
            this.isadmin=true;
        }
        dbx=new dbexecuter();
    }

    @Override
    public void executequery(String q) {
        if(isadmin){
            dbx.executequery(q);
        }else{
            if(q.equals("DELETE")){
                System.out.println("non-admin user cant perform: "+q);
            }else{
                dbx.executequery(q);
            }
        }
    }
}
public class ProxyPattern {
    public static void main(String args[]){
        db db=new dbexecuterproxy("admin","admin@123");
        db.executequery("DELETE");
        db=new dbexecuterproxy("aDn","admin@123");
        db.executequery("DELETE");
         db=new dbexecuterproxy("ad","admin@123");
        db.executequery("SELECT");

    }
}

