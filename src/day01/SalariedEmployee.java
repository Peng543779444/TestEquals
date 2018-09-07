package day01;

public class SalariedEmployee extends  Employee {
    private double monthlySalary; //月工资
/*

 */

    /**
     * @param name
     * @param number
     * @param birthday
     * @param monthlySalary
     */
    public SalariedEmployee(String name,int number,MyDate birthday,double monthlySalary) {
        super(name, number, birthday);

        this.monthlySalary = monthlySalary;
    }
    @Override
    public double earnings() {
        return monthlySalary;
    }
    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString()+
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
