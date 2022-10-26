//Написать программу вычисления n-ого треугольного числа. 
import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = st.nextInt();
        st.close();
        double t = n* 0.5*(n+1);
        System.out.println(t); 
    }
    }