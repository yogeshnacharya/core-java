class Clock {

    Clock() {
        this("Wall Clock");
        System.out.println("I am Clock Constructor 1");
    }

    Clock(String type) {
        this("Wall Clock", "Titan");
        System.out.println("I am Clock Constructor 2");
        System.out.println("Type: " + type);
    }

    Clock(String type, String brand) {
        this("Wall Clock", 1500.5);
        System.out.println("I am Clock Constructor 3");
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }

    Clock(String type, double price) {
        this("Wall Clock", 4.5f);
        System.out.println("I am Clock Constructor 4");
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    Clock(String type, float rating) {
        System.out.println("I am Clock Constructor 5");
        System.out.println("Type: " + type);
        System.out.println("Rating: " + rating);
    }
}

