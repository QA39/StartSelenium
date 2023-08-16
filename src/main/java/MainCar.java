public class MainCar {

    public static void main(String[] args) {

        int[] ar = {3,7,6};

        System.out.println(ar);

        System.out.println(ar[1]);

        Car c = new Car();

        System.out.println(c);

        System.out.println(c.getBrand());

        c.toDrive();

        Car.fire();

        Car c1 = new Car(2020);

        System.out.println(c1.getYear());

        Car c2 = new Car(0.0001, -2023, 2, "Fignya");

        System.out.println(c2);

        Car c3 = new Car();
        c3.setEngine(1.5);
        c3.setYear(2023);
        c3.setModel("Civic");
        c3.setPrice(10000);

        System.out.println(c3);

        Car c4 = new Car()
                .withYear(2020)
                .withEngine(2.4);



    }

}



/*

            Stack                               Heap

    Car c <------------- reference ------ { engine = 0.0
                                            year = 0
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }
    Car c1 <------------- reference ------ { engine = 0.0
                                            year = 2020
                                            electric = false
                                            colors = null
                                            colorCode = 0
                                            brand = HONDA
                                            model = null
                                           }










 */