class EmployeeCount {
    static int count = 0;
    EmployeeCount() { count++; }
    static void showCount() { System.out.println("Total: " + count); }
}
