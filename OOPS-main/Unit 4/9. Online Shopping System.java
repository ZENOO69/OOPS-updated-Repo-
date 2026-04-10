class OnlineShoppingSystem {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Processing payment...")).start();
        new Thread(() -> System.out.println("Order confirmed...")).start();
    }
}
