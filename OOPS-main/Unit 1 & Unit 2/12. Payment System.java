abstract class Payment { abstract void pay(double amount); }
class CreditCardPayment extends Payment { void pay(double a) { System.out.println("CC: " + a); } }
class UPIPayment extends Payment { void pay(double a) { System.out.println("UPI: " + a); } }
class NetBankingPayment extends Payment { void pay(double a) { System.out.println("NB: " + a); } }
