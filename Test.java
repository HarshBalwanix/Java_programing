class InsuranceGiven {
    public static void main(String args[]) {
        String mar = args[0];
        String gender = args[1];
        int age = Integer.parseInt(args[2]);

        if (mar.equals("unmarried")) {
            if (gender.equals("M")) {
                if (age < 35) {
                    System.out.println("Insurance given");
                    return;
                }
                System.out.println("Insurance not given");
            }

            if (gender.equals("F")) {
                if (age < 30) {
                    System.out.println("Insurance given");
                    return;
                }
                System.out.println("Insurance not given");
            }
        }

        if (mar.equals("married")) {
            System.out.println("Insurance given");
        }
    }
}
