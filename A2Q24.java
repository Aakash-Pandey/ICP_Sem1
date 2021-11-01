public class A2Q24 {

        public static void main(String[] args) {
 /*Write a java program that prints five uniform random values between 0 and 1, their average value, 
  and their minimum and maximum value.*/
 
         double A = Math.random();
   		 double B = Math.random();
   		 double C = Math.random();
   		 double D = Math.random();
   		 double E = Math.random();
   		 
   		 double avg = (A+B+C+D+E)/5;
   		 
   		 double min = Math.min(A, (Math.min(B, Math.min(C, Math.min(D, E)))));
   		 double max = Math.max(A, (Math.max(B, Math.max(C, Math.max(D, E)))));
   		
   		System.out.println(A);
   		System.out.println(B);
   		System.out.println(C);
   		System.out.println(D);
   		System.out.println(E);
   		System.out.println(avg);
   		System.out.println(min);
   		System.out.println(max);
        }
        }