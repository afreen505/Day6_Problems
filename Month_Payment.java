public class Month_Payment {
    public static void main(String[] args)
    {
        System.out.println("Enter years 'Y' : ");
        int Y = Integer.parseInt(args[0]);
        System.out.println("Enter principal loan amount 'P' : ");
        int P = Integer.parseInt(args[1]);
        System.out.println("Enter percent interest compounded monthly 'R' : ");
        int R = Integer.parseInt(args[2]);

        double n = 12 * Y;
        double r = R / (12 * 100);

        double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));

        System.out.println("Your Payment is: "+payment);
    }
}

