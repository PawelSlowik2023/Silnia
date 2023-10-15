public class Main {
    public static void main(String[] args) {


        int liczba = 5;
        long silnia = obliczenieSilni(liczba);
        System.out.print("SIlnia z liczby" + liczba + "wynosi = " + silnia);
    }


        public static long obliczenieSilni(int n){
        if (n==0) {
            return 1;
        }
        else {
          return  n * obliczenieSilni (n-1);

        }
        }




    }
