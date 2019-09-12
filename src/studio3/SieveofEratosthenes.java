package studio3;

import support.cse131.ArgsProcessor;

public class SieveofEratosthenes {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n = ap.nextInt("What is the size of the array?");
        int[] mat = new int[n];


        for (int i = 0; i < n; i++) {
            mat[i] = i + 2;
            if (mat[i] % 2 == 0 && mat[i] != 2) {
                mat[i] = 0;
            } else if (mat[i] % 3 == 0 && mat[i] != 3) {
                mat[i] = 0;
            } else if (mat[i] % 5 == 0 && mat[i] != 5) {
                mat[i] = 0;
            } else if (mat[i] % 7 == 0 && mat[i] != 7) {
                mat[i] = 0;
            }
        }
        System.out.print("Primes under " + n + " = ");
        for(int j = 0; j < n-1; j++)
        {
            if(mat[j]!=0)
            {
                System.out.print(mat[j] + " ");
            }
        }
    }
}


//        //for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n; j++) {
//                if (mat[i] % mat[j] == 0 && mat[i] != 0 && mat[i] != mat[j]) {
//                    mat[i] = 0;
//                }
//            }
