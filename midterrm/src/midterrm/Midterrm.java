/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterrm;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Midterrm {
    class Account {
    private String accountNumber;
    private String password;
    private int balance;

    public Account(String accountNumber, String password, int balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.balance = balance;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int getBalance() {
        return balance;
    }
}

    private static int[] arr;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //第一題
//        Scanner num = new Scanner(System.in);
//        System.out.println("輸入正整數");
//
//        double a = num.nextDouble();
//
//        if (a % 1 == 0) {
//            System.out.println("是");
//        } else {
//            System.out.println("否");
//        }
//        

        //第二題
//       Scanner num = new Scanner(System.in);
//       System.out.println("輸入一個度數(正整數)");
//       
//       float price = num.nextFloat();
//       float summer = 0,nonsummer = 0;
//       
//       while(price != 0){
//           if(price>700){
//               summer += (price-700.0)*5.63f;
//               nonsummer += (price-700.0)*4.50f;
//               price=700;
//           }
//           if(price>500){
//               summer += (price-500.0)*4.97f;
//               nonsummer += (price-500.0)*4.01f;
//               price=500;  
//           }
//           if(price>330){
//               summer += (price-330.0)*4.39f;
//               nonsummer += (price-330.0)*3.61f;
//               price=330;  
//           }
//          if(price>120){
//               summer += (price-120.0)*3.02f;
//               nonsummer += (price-120.0)*2.68f;
//               price=120;  
//           }
//           if(price>0){
//               summer += price*2.10f;
//               nonsummer += price*2.10f;
//               price=0;  
//           };
//         }
//        System.out.println("Summer months:"+summer);
//        System.out.println("Summer months:"+nonsummer);
//
        
        //第三題
//         Scanner num = new Scanner(System.in);
//         System.out.println("請輸入西元年分");
////         
//         int year = num.nextInt();
//         
//         String[] animal;
//         animal = new String[12];
//         animal[0] = "猴";
//         animal[1] = "雞";
//         animal[2] = "狗";
//         animal[3] = "豬";
//         animal[4] = "鼠";
//         animal[5] = "牛";
//         animal[6] = "虎";
//         animal[7] = "兔";
//         animal[8] = "龍";
//         animal[9] = "蛇";
//         animal[10] = "馬";
//         animal[11] = "羊";
//         
//         int kk;
//         kk = year%12;
//         if(kk<0){
//            kk +=12;
//          }
//        for(int i = 0;i<animal.length;i++){
//             if(kk==i){
//                 System.out.println(animal[i]);
//             }
//          }

        
        
         //第四題
//        Scanner point1 = new Scanner(System.in) ;
//        System.out.println("X軸座標");
//        int x = point1.nextInt();
//        
//        Scanner point2 = new Scanner(System.in) ;
//        System.out.println("Y軸座標");
//        int y = point2.nextInt();
//        
//        double distance;
//        distance = Math.pow(x, 2)+Math.pow(y, 2);
//        
//        if (x>0){
//            if(y>0){
//                System.out.print("該點位於第一象限，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於第四象限，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於右半平面X軸上，離原點距離為根號"+distance);
//            }
//        }else if(x<0){
//            if(y>0){
//                System.out.print("該點位於第二象限，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於第三象限，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於左半平面X軸上，離原點距離為根號"+distance);
//            }
//        }else{
//            if(y>0){
//                System.out.print("該點位於上半平面Y軸上，離原點距離為根號"+distance);
//            }else if(y<0){
//                System.out.print("該點位於下半平面Y軸上，離原點距離為根號"+distance);
//            }else{
//                System.out.print("該點位於原點");
//            }
//        }
        
        
        
        //第五題
//        Scanner num = new Scanner(System.in);
//        System.out.println("請輸入階層值M");
//        double M = num.nextDouble();
//        
//        double N = 1 ;
//        double a = 1;
//        while(N<M){
//            N=N*a;
//            a = a+1;
//        }
//        System.out.println("超過M為"+M+"的最小階層N值為:"+(a-1));
        
        
        
        //第六題
//        Scanner num = new Scanner(System.in);
//        System.out.println("請輸入值為:");
//        
//        String line = num.next();
//        String[] split_line = line.split(",");
//        System.out.println(split_line);
//        
//        String a[] = split_line;
//        int temp;
//
//        for (int i=0; i<a.length; i++) {
//            int intValue1 = Integer.parseInt(a[i]);
//            for (int j=i+1; j<a.length; j++) {
//                int intValue2 = Integer.parseInt(a[j]);
//                if (intValue1< intValue2) {
//                    temp = intValue2;
//                    intValue1 = intValue2;
//                    intValue2 = temp;
//                }
//            }
//        }
        

        //第七題
    //     Scanner num =new Scanner(System.in);
    //     System.out.println("請輸入月租費型式及通話時間為:");
        
    //     String line = num.next();
    //     String[] split_line = line.split(",");
    //     System.out.println(split_line);
    //     int intValue = Integer.parseInt(split_line[0]);
    //     double doubleValue = Double.parseDouble(split_line[1]);
        
    //     switch (intValue){
    //         case 186:
    //                 double payprice = doubleValue*0.09;
    //                 if(payprice>186){
                        
    //                 }
    //             break;
    //         case 386:
    //             break;
    //         case 586:
    //             break;
    //         case 986:
    //             break;
    //     }


    // //第八題
    // HashMap<Integer, Integer> map = new HashMap<>();
    // int maxCount = 0;
    // int maxNum = 0;

    // for (int num : arr) {
    //     if (map.containsKey(num)) {
    //         int count = map.get(num);
    //         count++;
    //         map.put(num, count);
    //         if (count > maxCount) {
    //             maxCount = count;
    //             maxNum = num;
    //         }
    //     } else {
    //         map.put(num, 1);
    //     }
    // }
    // if (maxCount == 1) {
    //     System.out.println("每個數字剛好出現1次");
    // } else {
    //     System.out.println("最大出現次數的數字為 " + maxNum + "，出現次數為 " + maxCount);
    // }


    //第九題
    // String str = "Hello World";
    // String subStr = "World";
    // boolean isSubstring = str.contains(subStr);
    // if (isSubstring) {
    //     System.out.println("yes");
    // } else {
    //     System.out.println("no");
    // }


    //第十題
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number of rows: ");
    // int rows = sc.nextInt();
    // System.out.print("Enter the number of columns: ");
    // int columns = sc.nextInt();
    // int[][] matrix = new int[rows][columns];
    
    // System.out.println("Enter the elements of the matrix:");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         matrix[i][j] = sc.nextInt();
    //     }
    // }
    
    // System.out.println("Original matrix:");
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         System.out.print(matrix[i][j] + " ");
    //     }
    //     System.out.println();
    // }
    
    // int[][] transposedMatrix = new int[columns][rows];
    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < columns; j++) {
    //         transposedMatrix[j][i] = matrix[i][j];
    //     }
    // }
    
    // System.out.println("Transposed matrix:");
    // for (int i = 0; i < columns; i++) {
    //     for (int j = 0; j < rows; j++) {
    //         System.out.print(transposedMatrix[i][j] + " ");
    //     }
    //     System.out.println();
    // }


    //第十一題
    // Scanner input = new Scanner(System.in);

    //     System.out.print("輸入月份 (1-12): ");
    //     int month = input.nextInt();
    //     System.out.print("輸入日期 (1-31): ");
    //     int day = input.nextInt();

    //     String zodiacSign = "";

    //     if ((month == 3 && day >= 21 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
    //         zodiacSign = "牡羊座";
    //     } else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
    //         zodiacSign = "金牛座";
    //     } else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 21)) {
    //         zodiacSign = "雙子座";
    //     } else if ((month == 6 && day >= 22 && day <= 31) || (month == 7 && day >= 1 && day <= 22)) {
    //         zodiacSign = "巨蟹座";
    //     } else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 23)) {
    //         zodiacSign = "獅子座";
    //     } else if ((month == 8 && day >= 24 && day <= 31) || (month == 9 && day >= 1 && day <= 23)) {
    //         zodiacSign = "處女座";
    //     } else if ((month == 9 && day >= 24 && day <= 31) || (month == 10 && day >= 1 && day <= 23)) {
    //         zodiacSign = "天秤座";
    //     } else if ((month == 10 && day >= 24 && day <= 31) || (month == 11 && day >= 1 && day <= 22)) {
    //         zodiacSign = "天蠍座";
    //     } else if ((month == 11 && day >= 23 && day <= 31) || (month == 12 && day >= 1 && day <= 21)) {
    //         zodiacSign = "射手座";
    //     } else if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 20)) {
    //         zodiacSign = "魔羯座";
    //     } else if ((month == 1 && day >= 21 && day <= 31) || (month == 2 && day >= 1 && day <= 18)) {
    //         zodiacSign = "水瓶座";
    //     } else if ((month == 2 && day >= 19 && day <= 31) || (month == 3 && day >= 1 && day <= 20)) {
    //         zodiacSign = "雙魚座";
    //     }
        
    //     System.out.println("你的星座是 " + zodiacSign + "。");
    
    //第十三題
    // Scanner sc = new Scanner(System.in);
    //     System.out.print("請輸入一個字串: ");
    //     String input = sc.nextLine();

    //     // 用 StringBuilder 顛倒字串
    //     String reversed = new StringBuilder(input).reverse().toString();

    //     if (input.equals(reversed)) {
    //         System.out.println("這是一個回文字串");
    //     } else {
    //         System.out.println("這不是一個回文字串");
    //     }


    //第十四題
    // Scanner scanner = new Scanner(System.in);
    //     System.out.print("請輸入字串: ");
    //     String inputString = scanner.nextLine();
    //     int length = inputString.length();
    //     System.out.println("字串字元數: " + length);


    //第十五題
    // Scanner input = new Scanner(System.in);

    // System.out.print("Enter the first number: ");
    // int num1 = input.nextInt();

    // System.out.print("Enter the second number: ");
    // int num2 = input.nextInt();

    // System.out.print("Enter the third number: ");
    // int num3 = input.nextInt();

    // System.out.print("Enter the fourth number: ");
    // int num4 = input.nextInt();

    // num1 = (num1 + 1) % 10;
    // num2 = (num2 + 1) % 10;
    // num3 = (num3 + 1) % 10;
    // num4 = (num4 + 1) % 10;

    // int temp = num1;
    // num1 = num3;
    // num3 = temp;

    // temp = num2;
    // num2 = num4;
    // num4 = temp;

    // System.out.println("Encrypted numbers: " + num1 + " " + num2 + " " + num3 + " " + num4);

    //第十九題
    // Scanner sc = new Scanner(System.in);
    // final int fullPrice = 250;
    // final int halfPrice = 175;
    // int fullCount, halfCount, totalPrice;
    
    // System.out.print("請輸入全票張數: ");
    // fullCount = sc.nextInt();
    
    // System.out.print("請輸入半票張數: ");
    // halfCount = sc.nextInt();
    
    // totalPrice = fullCount * fullPrice + halfCount * halfPrice;
    // System.out.println("總價格為: " + totalPrice);
    
    //第二十題
    // HashMap<String, String> studentMap = new HashMap<>();
    //     // 儲存學生資料
    //     studentMap.put("123", "Tom, DTGD");
    //     studentMap.put("456", "Cat, CSIE");
    //     studentMap.put("789", "Nana,ASIE");
    //     studentMap.put("321", "Lim, DBA");

    //     Scanner scanner = new Scanner(System.in);
    //     while (true) {
    //         System.out.print("請輸入學號 (輸入 Q 離開程式): ");
    //         String studentId = scanner.nextLine();
    //         if (studentId.equalsIgnoreCase("Q")) {
    //             break;
    //         }
    //         if (studentMap.containsKey(studentId)) {
    //             System.out.println("學生資料: " + studentMap.get(studentId));
    //         } else {
    //             System.out.println("查無此學號的學生資料");
    //         }
    //     }
    //     scanner.close();


    //第二十一題
        // 建立帳戶資訊
        // HashMap<String, Account> accounts = new HashMap<>();
        // accounts.put("123456", new Account("123456", "1234", 10000));
        // accounts.put("654321", new Account("654321", "4321", 20000));
        // // 讀取使用者輸入
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("請輸入帳號: ");
        // String accountNumber = scanner.nextLine();
        // System.out.print("請輸入密碼: ");
        // String password = scanner.nextLine();
        // // 查詢餘額
        // Account account = accounts.get(accountNumber);
        // if (account != null && account.checkPassword(password)) {
        //     System.out.println("餘額: " + account.getBalance());
        // } else {
        //     System.out.println("Error");
        // }
        

    //第二十五題
    // Scanner input = new Scanner(System.in);
    // System.out.print("請輸入一個字串: ");
    // String str = input.nextLine();
    // System.out.print("請輸入要檢測的字元: ");
    // char ch = input.next().charAt(0);

    // int count = 0;
    // for (int i = 0; i < str.length(); i++) {
    //     if (str.charAt(i) == ch) {
    //         count++;
    //     }
    // }

    // System.out.println("字元" + ch + "出現次數為: " + count);

    }
    // class Account {
    //     private String accountNumber;
    //     private String password;
    //     private int balance;
    
    //     public Account(String accountNumber, String password, int balance) {
    //         this.accountNumber = accountNumber;
    //         this.password = password;
    //         this.balance = balance;
    //     }
    
    //     public boolean checkPassword(String password) {
    //         return this.password.equals(password);
    //     }
    
    //     public int getBalance() {
    //         return balance;
    //     }
    // }
}
