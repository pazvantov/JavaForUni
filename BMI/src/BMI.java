import java.util.Scanner;
public class BMI {
    public static String bmiCalc(double weight,
                                     double height) {
        double bmi = weight / ( height * height) ;
        System.out.print(bmi + "\n");
        if(bmi < 18.5)
            return "Thin";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Fat";
        else
            return "BIG CHONK";
    }

    public static void main(String[] args) {
        double weight= 0.0f;
        double height= 0.0f;
        String result = null;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight(Kg): ");
        weight = Double.parseDouble((scan.nextLine()));
        System.out.print("Enter height(meters): ");
        height = Double.parseDouble((scan.nextLine()));
        result = bmiCalc( weight,height );
        System.out.println(result);
        scan.close();
    }
}
