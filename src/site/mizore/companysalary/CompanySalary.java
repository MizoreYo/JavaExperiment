package site.mizore.companysalary;

public class CompanySalary {
    public static void main(String[] args) {
        Employee[] employee=new Employee[129];
        for(int i=0;i<129;i++) {
            if(i%2==0)
                employee[i]=new YearWorker();
            else
                employee[i]=new MonthWorker();
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额："+company.salaryPay()+"元");
    }
}
