class employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() { return basic + hra + da; }

    void havedata(int id, String name, float b, float h, float d) {
        empno = id; ename = name; basic = b; hra = h; da = d;
        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }
}
