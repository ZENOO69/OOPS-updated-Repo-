class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
        Rent = GetRent();
    }

    float GetRent() {
        if (CarType.equals("Small Car")) return 1000;
        if (CarType.equals("Van")) return 800;
        if (CarType.equals("SUV")) return 2500;
        return 0;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }
}
