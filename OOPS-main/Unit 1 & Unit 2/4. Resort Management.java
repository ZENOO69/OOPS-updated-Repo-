class Resort {
    int RNo, Days;
    String Name;
    float Charges;

    float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) return 1.02f * amount;
        return amount;
    }

    void GetInfo(int r, String n, float c, int d) {
        RNo = r; Name = n; Charges = c; Days = d;
    }

    void DispInfo() {
        System.out.println(RNo + " " + Name + " " + Charges + " " + Days + " " + Compute());
    }
}
