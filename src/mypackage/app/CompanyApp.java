package mypackage.app;

import mypackage.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Nursalim corp");

        Company.Employee employee = company.new Employee();
        employee.setName("Nursalim");
        System.out.println(employee.getName());
        System.out.println(employee.getCompanyName());

        Company company2 = new Company();
        company2.setName("Ziah Corp");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Ana");
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompanyName());

    }
}
