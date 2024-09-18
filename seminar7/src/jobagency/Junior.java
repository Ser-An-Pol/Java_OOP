package jobagency;

public class Junior implements Observer{
    String name;
    int salary;

    public Junior(String name){
        this.name = name;
        salary = 30;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.println(String.format("Junior %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else{
            System.out.println(String.format("Junior %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
