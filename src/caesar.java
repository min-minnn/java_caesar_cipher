import java.util.*;
import java.lang.*;

public class caesar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------< Caesar Cipher Decoder >----------");
        System.out.print("변환할 문자열을 입력해 주세요.: ");
        String str = input.nextLine();

        System.out.print("이동 숫자를 입력하세요.: ");
        int num = input.nextInt();

        System.out.println("설정을 선택해 주세요.");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.print(">> ");
        int choice = input.nextInt();

        if(choice == 1){
            String result = ""; //결과값 넣어줄 곳

            for(int i = 0; i < str.length() ; i++) {
                if((byte)str.charAt(i) >= 65 && (byte)str.charAt(i) <= 90) {
                    if ((byte)str.charAt(i) + num  > 65) {
                        if((byte)str.charAt(i) + num > 90) {
                            result += (char) (Math.abs((str.charAt(i) + num) - 26));
                        }else {
                            result += (char)((byte)str.charAt(i) + num);
                        }
                    }
                }else if((byte)str.charAt(i) >= 97 && (byte)str.charAt(i) <= 122) {
                    if ((byte)str.charAt(i) + num  > 97) {
                        if((byte)str.charAt(i) + num > 122) {
                            result += (char) (Math.abs((str.charAt(i) + num) - 26));
                        }else {
                            result += (char)((byte)str.charAt(i) + num);
                        }
                    }
                }
            }
            System.out.println(result);
        } else if(choice == 2){
            String result = ""; //결과값 넣어줄 곳곳
            for(int i = 0; i < str.length() ; i++) {
                if((byte)str.charAt(i) >= 65 && (byte)str.charAt(i) <= 90) {
                    if ((byte)str.charAt(i) - num  < 65) {
                        result += (char)( 90 - (65 - ((byte)str.charAt(i) - num ))+1);
                    }else {
                        result += (char)((byte)str.charAt(i) - num);
                    }
                }else if((byte)str.charAt(i) >= 97 && (byte)str.charAt(i) <= 122) {
                    if ((byte)str.charAt(i) - num  < 97) {
                        result += (char)( 122 - (97 - ((byte)str.charAt(i) - num ))+1);
                    }else {
                        result += (char)((byte)str.charAt(i) - num);
                    }
                }
            }
            System.out.println(result);
        } else {
            System.out.println("잘못 입력했습니다.");
        }
    }
}
