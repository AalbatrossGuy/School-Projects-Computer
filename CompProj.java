
//Written By: Kishaloy Roy
//Date: 26.08.2021
//Class: IX A
//Topic: Make a calculator in java with all the Mathematical libraries in java.

import java.util.Scanner;
import java.text.DecimalFormat;

class CompProj{
    public static void main(String[] args){
        double a=0, b=0, c=0, d=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Finding a power value\n6. Square of a number\n7. Cube of a number\n8. Square root\n9. Absolute Value\n10. Floor Value\n");
        System.out.print("11. Ceil Value\n12. Max of 2 numbers\n13. Min of 2 numbers\n14. Max of 3 numbers\n15. Min of 3 numbers\n16. Second largest/smallest among 3 numbers\n17. Simple Interest\n18. Compound Interest\n19. Fahrenheit to Celcius\n");
        System.out.println("20. Celcius to Fahrenheit");
        System.out.println("\n");
        System.out.println("Enter your choice: ");

        int OPTION = scan.nextInt();
        if(OPTION >=6 && OPTION <=11) {
            System.out.print("Enter a number: ");
            a = scan.nextDouble();
        }
        
        if (OPTION >=1 && OPTION <= 4){
            System.out.print("Enter 2 numbers: ");
            b = scan.nextDouble();
            c = scan.nextDouble();
        }

        // System.out.println()

        switch (OPTION) {
            case 1:
                // Addition
                d = b+c;
                System.out.println("Answer = "+d);
                break;

            case 2:
                // Substraction
                d = b-c;
                System.out.println("Answer = "+d);
                break;

            case 3:
                // Multiplication
                d = b*c;
                System.out.println("Answer = "+d);
                break;

            case 4:
                // Division
                d = b/c;
                System.out.println("Answer = "+d);
                break;
            
            case 5:
                // Finding a power of a value
                System.out.print("Enter base: ");
                int base = scan.nextInt();
                System.out.print("Enter power: ");
                int power = scan.nextInt();
                double out = Math.pow(base, power);
                System.out.println("Answer = "+out);
                break;

            case 6:
                // Square of a number 
                double res = Math.pow(a, 2);
                System.out.println("Answer = "+res);
                break;
            
            case 7:
                // Cube of a number
                double cres = Math.pow(a, 3);
                System.out.println("Answer = "+cres);
                break;
            
            case 8:
                // Square Root
                double sres = Math.sqrt(a);
                System.out.println("Answer = "+sres);
                break;
            
            case 9:
                // Absolute Value
                double abres = Math.abs(a);
                System.out.println("Answer = "+abres);
                break;

            case 10:
                // Floor Value
                double fres = Math.floor(a);
                System.out.println("Answer = "+fres);
                break;

            case 11: 
                // Ceil Value
                double cvres = Math.ceil(a);
                System.out.println("Answer = "+cvres);
                break; 

            case 12: 
                // Max of 2 num 
                System.out.print("Enter two numbers: ");
                double maxnum1 = scan.nextDouble();
                double maxnum2 = scan.nextDouble();
                double maxres = Math.max(maxnum1, maxnum2);
                System.out.println("Answer = "+maxres);
                break; 

            case 13: 
                // Min of 2 num 
                System.out.print("Enter two numbers: ");
                double minnum1 = scan.nextDouble();
                double minnum2 = scan.nextDouble();
                double minres = Math.min(minnum1, minnum2);
                System.out.println("Answer = "+minres);
                break;

            case 14:
                // Max of 3 nums
                System.out.print("Enter three numbers: ");
                double maxxnum1 = scan.nextDouble();
                double maxxnum2 = scan.nextDouble();
                double maxxnum3 = scan.nextDouble();
                double maxxres = Math.max(maxxnum1, Math.max(maxxnum2, maxxnum3));
                System.out.println("Answer = "+maxxres);
                break;
            
            case 15:
                // Min of 3 nums
                System.out.print("Enter three numbers: ");
                double min_num1 = scan.nextDouble();
                double min_num2 = scan.nextDouble();
                double min_num3 = scan.nextDouble();
                double min_res = Math.min(min_num1, Math.min(min_num2, min_num3));
                System.out.println("Answer = "+min_res);
                break;

            case 16:
                // Second Largest/Smallest Num 
                int n = 3, temparr;
                int arr[] = new int[n];
                System.out.print("Enter 3 numbers: ");
                
                for (int i = 0; i<n; i++){
                    arr[i] = scan.nextInt();
                }
                
                for (int i = 0; i<n; i++){
                    for (int j = i+1; j<n; j++){
                        if (arr[i] > arr[j]){
                            temparr = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temparr;
                        }
                    }
                }
                
                System.out.println("Second Largest Number = "+arr[n-2]);
                //System.out.println("Smallest Number: "+arr[0]);
                break;

            case 17:
                // Simple Interest 
                System.out.print("Enter Principal Value: ");
                double principal = scan.nextDouble();
                System.out.print("Enter Time: ");
                double time = scan.nextDouble();
                System.out.print("Enter Rate %: ");
                double rate = scan.nextDouble();
                double si = (principal*rate*time)/100;
                System.out.println("Answer = "+si);
                break;

            case 18:
                // Compound Interest 
                System.out.print("Enter Principal Value: ");
                double princi = scan.nextDouble();
                System.out.print("Enter Rate%: ");
                double ratepercent = scan.nextDouble();
                System.out.print("Enter Time: ");
                double timetaken = scan.nextDouble();
                double ci = princi*(Math.pow((1+ ratepercent / 100), timetaken));
                System.out.println("Answer = "+ci);
                break;

            case 19:
                // Fahrenheit to Celcius
                String pattern = "#.##";
                DecimalFormat decfor = new DecimalFormat(pattern);
                System.out.print("Enter temperature in Fahrenheit: ");
                float temp = scan.nextFloat();
                double celcius = (5*(temp - 32))/9;
                String fmtcelcius = decfor.format(celcius);
                System.out.println("Answer = "+fmtcelcius+"°C");
                break;

            case 20:
                // Celcius to Fahrenheit 
                String pattern2 = "#.##";
                DecimalFormat decfor2 = new DecimalFormat(pattern2);
                System.out.print("Enter temperature in Celcius: ");
                float temp2 = scan.nextFloat();
                double fahrenheit = ((temp2 * 9)/5) + 32;
                String fmtfahrenheit = decfor2.format(fahrenheit);
                System.out.println("Answer = "+fmtfahrenheit+"°F");
                break;

            default:
                System.out.println("Choice no Exist :)");
                break;
        }
    }
}
