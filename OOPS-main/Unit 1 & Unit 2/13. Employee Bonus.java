abstract class Employee {
    String name; int id; double salary;
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateBonus() { System.out.println(salary * 0.20); }
}

class Developer extends Employee {
    void calculateBonus() { System.out.println(salary * 0.10 + 500); }
}
