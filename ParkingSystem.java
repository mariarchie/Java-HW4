class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big-- > 0) {
            return true;
        } else if (carType == 2 && medium-- > 0) {
            return true;
        } else if (carType == 3 && small-- > 0) {
            return true;
        }
        return false;
    }
}