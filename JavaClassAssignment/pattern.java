// class pattern {
//     public static void main(String[] args) {
//         // int n = 5;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j <= 4; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// 1 
// 1 2 
/// 1 2 3

class pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}