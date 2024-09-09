public class patternsA {

//    public static void inverted_rotated_half_pyramid(int n) {
//        //outer
//        for(int i=1; i<=n; i++) {
//            //space
//            for(int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//             //star
//            for(int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//        }
//    }
      //inverted half - pyramid with number
      public static void inverted_half_pyramid_withNumber(int n) {
          for(int i=1; i<=n; i++) {
              //inner number
              for(int j=1; j<=n-i+1; j++) {
                  System.out.print(j+" ");
              }
              System.out.println();
          }

      }

    public static void main(String[] args) {
//       inverted_rotated_half_pyramid(7);
        inverted_half_pyramid_withNumber(5);
  }
}
