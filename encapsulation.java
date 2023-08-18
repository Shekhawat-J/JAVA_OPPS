class Employee{
    private String eid;
    private String ename;

    public void setEid(String eid){
        this.eid = eid;
    }

    public void setEname(String ename){
        this.ename = ename;
    }

    public String getEid(){
        return eid;
    }
    public String getEname(){
        return ename;
    }
}


class Encapsulation{
    public static void main(String[] args){
        Employee emp = new Employee();

        emp.setEid("1234");
        emp.setEname("Kiki");

        System.out.println(emp.getEid());
        System.out.println(emp.getEname());
    }
}