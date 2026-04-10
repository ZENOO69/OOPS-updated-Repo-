class Restaurant {
    boolean foodReady = false;
    synchronized void chef() {
        foodReady = true;
        System.out.println("Chef prepared food");
        notify();
    }
    synchronized void waiter() {
        while (!foodReady) {
            try { wait(); } catch (Exception e) {}
        }
        System.out.println("Waiter served food");
    }
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        new Thread(r::waiter).start();
        new Thread(r::chef).start();
    }
}
