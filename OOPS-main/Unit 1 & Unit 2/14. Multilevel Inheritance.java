class Person { void role() { System.out.println("Person"); } }
class EmployeeRole extends Person { void role() { System.out.println("Employee"); } }
class ManagerRole extends EmployeeRole { void role() { System.out.println("Manager"); } }
