import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-26
 * Time: 14:58
 */
public class Thread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                dianping();
            }

            private void dianping() {
            }


        };


        t.run();
        System.out.println("dazhong");
    }
}
//    static boolean out(char c) {
//        System.out.println(c);
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        for (out('A'); out('B') && (i < 2); out('c')) {
//            i++;
//            out('D');
//        }
//    }

//    abstract void say();
//}
//public class Cat extends Animal{
//    public Cat(){
//        System.out.println(" i  am  a  cat");
//    }
//
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//    }
//}

//    public static void main(String[] args) {
//        public void getCustomerInfo{
//            try {
//                //do something that cause an Exception
//            } catch (java.io.FileNotFoundException ex) {
//                System.out.println("FileNotFoundException!");
//            } catch (java.io.IOException ex) {
//                System.out.println("FileNotFoundException!");
//            } catch (java.lang.Exception ex) {
//                System.out.println("FileNotFoundException!");
//            }
//    }
//
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int num = sc.nextInt();
//            for (int i = num / 2; i >= 2; i--) {//为什么
//                if (isPrime(i) && isPrime(num - i)) {
//                    System.out.println(i);
//                    System.out.println(num - i);
//                    break;
//                }
//            }
//        }
//    }
//
//    //判断一个数是否是素数
//    public static boolean isPrime(int n) {
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


//    import java.util.*;
//
//    public class BinInsert {
//        public int binInsert(int n, int m, int j, int i) {
//            // write code here
//            int x = n |(m<<j);
//            return x;
//        }
//    }

//链接：https://www.nowcoder.com/questionTerminal/f8538f9ae3f1484fb137789dec6eedb9?answerType=1&f=discussion
//        来源：牛客网
//
//        import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            for(int i=n/2;i>=2;i--){
//                if(isPrime(i)&&isPrime(n-i)){
//                    System.out.println(i);
//                    System.out.println(n-i);
//                    break;
//                }
//            }
//        }
//    }
//
//    public static boolean isPrime(int n){
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//}