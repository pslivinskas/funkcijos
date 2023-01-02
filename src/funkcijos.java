import java.util.Arrays;

public class funkcijos {
//              public static void main(String[] args) {
//                int[] nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//                nums = rndIntArr(60,-160,200);
//                printIntArr(nums);
//            }
//
//            public static void printIntArr(int[] arr){
//                String res = "";
//                for (int i = 0; i < arr.length; i++) {
//                    res += arr[i] + ", ";
//                }
//                System.out.println( res.substring(0,res.length() -2) + "." );
//            }
//
//            public static int[] rndIntArr(int length, int min, int max){
//                int[] nums = new int[length];
//                for (int i = 0; i < length; i++) {
//                    nums[i] = (int) (min + Math.round(Math.random() * (max - min)));
//                }
//                return nums;

    //////// 1
//    public static void main(String[] args) {
//        System.out.println(sumInt(16, 30));
//        sayHi();
//        int sum = sumInt(40,80);
//        double rnd = Math.random();
//    }
//    public static void sayHi(){
//        System.out.println("labas rytas =)");
//    }
//    public static int sumInt ( int a, int b){
//        return a + b;

    /////////// 2
//    public static void main(String[] args) {
//        System.out.println(PISq() * PISq());
//    }
//    public static double PISq(){
//        return 3.14;
//    }
//}
/////////// 3
//    public static void main(String[] args) {
//        naujas(3, 6);
//    }
//    public static void naujas(int kint1, int kint2) {
//        System.out.println(kint1 * kint2);
//    }
//}

///////////4
//public static void main(String[] args) {
//    int[] masyvas = {5, 8, 3};
//    nums(masyvas);
//}
//
//    public static void nums(int[] arr) {
//    for (int i = 0; i < arr.length; i++) {
//        System.out.println(arr[1]);
//    }
//
//
//
//}
//}


//    5, 6, 7 uzduotys


    //    public static void main(String[] args) {
//
//
//        int[] masyvas3 = rndArr();
//        for (int i = 0; i < masyvas3.length; i++) {
//            System.out.println(masyvas3[i]);
//        }
//
//        int res = arrSum(masyvas3);
//        System.out.println(res);
//
//        double vidurkis = arrAvg(masyvas3);
//        System.out.println(vidurkis);
//    }
//
//
//    public static int[] rndArr() {
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = (int) Math.round(Math.random() * 100);
//
//        }
//        return arr;
//
//
//    }
//
//    public static int arrSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
//
//    public static double arrAvg(int[] arr) {
//        double avg = 0;
//        for (int i = 0; i < arr.length; i++) {
//            avg += arr[i];
//
//        }
//        return avg  / arr.length;
//    }
//
//}
////////////// 8
    public static void main(String[] args) {
      drawSquare();
    };
      public static void drawSquare(){
        for (int i = 1; i <= 5; i++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
//////////////////// 9
    public static void main(String[] args) {
        String test = "Siandien labai grazi diena";
        count(test);

    }


    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            }
        }
            System.out.println();
            System.out.println("letter: " + letter);
            System.out.println("space: " + space);
        }
    }
////////////// 10
public static void main (String a[]) {
String word = "Povilas";
    System.out.println(reverse(word));


}
public static String reverse (String a){
    int j = a.length();
    char[] newWord= new char[j];


    for (int i = 0; i < a.length() ; i++) {
        newWord[--j] = a.charAt(i);
    }
    return new String (newWord);
}
}
/////// 1 sunk

    public static void main(String[] args) {
        System.out.print("---");
        sayHi();
        System.out.print("---");

    }

    public static void sayHi() {
        System.out.print("labas rytas =)");
    }
}

///// 1 sunk

    public static void main(String[] args) {
        withLines("labas");
    }

    public static void withLines(String text) {
        System.out.print("---" + text + "---");
    }
///// 2 sunk
    public static void random() {
        String text = "";
        String alpha_numeric = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
           nuo 0 iki alpha numeric length -1
        }

    }
}








