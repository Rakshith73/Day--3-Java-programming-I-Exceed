class karnataka {
    String cm, capital;
    double area_state;

    karnataka(String cm) {
        this.cm = cm;
    }

    public void displayState() {
        System.out.println("Name of CM: " + cm);
    }

    class mysuru {
        String collector_name;
        int area_dist;

        mysuru(String collector_name, int area_dist) {
            this.collector_name = collector_name;
            this.area_dist = area_dist;
        }

        public void displayMysuru() {
            System.out.println("Name of the collector: " + collector_name);
            System.out.println("District area: " + area_dist);
            System.out.println("Name of CM (from outer class): " + cm);
        }
    }
}

class demoinnerclass {
    public static void main(String[] asd) {
        karnataka k = new karnataka("Siddaramaiah");

        
        karnataka.mysuru my = k.new mysuru("Rajeev", 54543543);

       
        k.displayState();
        my.displayMysuru();
    }
}