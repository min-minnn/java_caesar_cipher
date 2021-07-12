import java.util.*;
import java.lang.*;

public class caesar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); //

        System.out.println("----------< Caesar Cipher Decoder >----------");
        System.out.print("변환할 문자열을 입력해 주세요.: ");
        String str = input.nextLine(); //' \n '을 포함하는 한 라인을 읽고 ' \n '을 버린 나머지만 리턴

        System.out.print("이동 숫자를 입력하세요.: ");
        int num = input.nextInt(); //토큰을 int형으로 반환

        System.out.println("설정을 선택해 주세요.");
        System.out.println("1. Encryption");
        System.out.println("2. Decryption");
        System.out.print(">> ");
        int choice = input.nextInt(); //토큰을 int형으로 반환

        if(choice == 1){ //1을 입력하면 Encryption 해주는 코드 실행
            String result = ""; //결과값 넣어줄 곳

            for(int i = 0; i < str.length() ; i++) {
                if((byte)str.charAt(i) >= 65 && (byte)str.charAt(i) <= 90) { //입력한 값이 A~Z 아스키코드 값과 일치하는지 판별
                    if ((byte)str.charAt(i) + num  > 65) { //입력한 값과 옮길 칸 수를 더 했을 때 Z를 넘길 경우
                        if((byte)str.charAt(i) + num > 90) {
                            result += (char)(Math.abs((str.charAt(i) + num) - 26));
                        }else {
                            result += (char)((byte)str.charAt(i) + num);
                        }
                    }
                }else if((byte)str.charAt(i) >= 97 && (byte)str.charAt(i) <= 122) { //입력한 값이 a~z 아스키코드 값과 일치하는지 판별
                    if((byte)str.charAt(i) + num > 122) { //입력한 값과 옮길 칸 수를 더 했을 때 z를 넘길 경우
                        result += (char) (Math.abs((str.charAt(i) + num) - 26));
                    }else {
                        result += (char)((byte)str.charAt(i) + num);
                    }
                }
            }
            System.out.println("암호화한 결과: " + result);
        } else if(choice == 2){ //2를 입력했을 때 Decryption 해 주는 코드 실행
            String result = ""; //결과값 넣어줄 곳곳
            for(int i = 0; i < str.length() ; i++) {
                if((byte)str.charAt(i) >= 65 && (byte)str.charAt(i) <= 90) { //입력한 값이 A~Z 아스키코드 값과 일치하는지 판별
                    if ((byte)str.charAt(i) - num  < 65) { //입력한 값과 옮길 칸 수를 더 했을 때 Z를 넘길 경우
                        result += (char)( 90 - (65 - ((byte)str.charAt(i) - num ))+1);
                    }else {
                        result += (char)((byte)str.charAt(i) - num);
                    }
                }else if((byte)str.charAt(i) >= 97 && (byte)str.charAt(i) <= 122) { //입력한 값이 a~z 아스키코드 값과 일치하는지 판별
                    if ((byte)str.charAt(i) - num  < 97) { //입력한 값과 옮길 칸 수를 더 했을 때 z를 넘길 경우
                        result += (char)( 122 - (97 - ((byte)str.charAt(i) - num ))+1);
                    }else {
                        result += (char)((byte)str.charAt(i) - num);
                    }
                }
            }
            System.out.println("해독한 결과: " + result);
        } else { //1과 2 이외의 다른 값을 입력했을 경우
            System.out.println("잘못 입력했습니다.");
        }
    }
}
