class Employee{
    private int id;
    private String name;
    private float salary;
    private String designation;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
    public String getename(){
        return name;
    }
    public  void setName (String name) {
        this.name=name;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
}
public class Main1{
    public static void main(String[] args){
        Employee employee=new Employee();

        employee.setId(1);
        employee.setName("java");
        employee.setSalary(30000.98f);
        employee.setDesignation("mca");

        System.out.println("Employee Details");
        System.out.println("Employee id"+employee.getId());
        System.out.println(employee.getename());
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
}