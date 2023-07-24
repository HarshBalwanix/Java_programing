// provide insurance if the employ is married
//  if unmarried and employ is male and age is less than 35 provide and for female if age is less than 30 provide

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
