package live.code.ue.emp;

public class DemoEM {

    public static void main(String[] args) {

        Employee e1 = new Employee(1234,"John",1500.00,"CAMPUS02-IWI");
        Employee e2 = new Employee(4321,"Jane",2700.00,"CAMPUS02-IWI");
        Employee e3 = new Employee(9876,"Susi",2200.00,"CAMPUS02-INNO");

        EmployeeManager em = new EmployeeManager();

        em.addEmployee(e1);
        System.out.println("4321 exists? "+em.findByEmpNumber(4321));
        System.out.println("1234 exists? "+em.findByEmpNumber(1234));

        System.out.println(em.findByDepartment("FH"));

        em.addEmployee(e2);
        em.addEmployee(e3);

        System.out.println(em.findByDepartment("CAMPUS02-IWI"));

    }

}


