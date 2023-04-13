public class Test {
    public static void main (String[] args) {
        Vehicle bike = new Vehicle();
        bike.setColor("blue");
        bike.setNumberOfWheels(2);
// pulls out the info from the private class info with getter
        int bikeWheels = bike.getNumberOfWheels();

        System.out.println(bikeWheels);
    }
}

