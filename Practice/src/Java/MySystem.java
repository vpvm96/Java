package Java;
/*
System.in: 자바에서 사용자로부터 키 입력을 받는 방법
System.in은 키보드 장치를 직접 제어하고 키 입력을 받는 표준 입력 스트림 객체이다.
하지만 System.in은 받은 바이트 정보를 문자나 숫자로 변환해야하는 번거러움이 있다.
그러므로 키보드에서 입력된 키를 문자나 정수, 실수, 문자열 등 사용자가 원하는 타입으로 변환해주는 Scanner 클래스를 사용하는 것이 효과적이다.
Scanner 는 응용프로그램이 쉽게 받을 수 있도록 자바 패키지에서 제공하는 클래스이다. 받는 방법을 알아보자.
ex) scanner sc = new scanner(System.in);
구조 System.in -> 0 1 1 1 0 1 0 -> scanner -> 'a', 3.5, "Hello" -> 자바 응용프로그램
import 문 사용: scanner 을 이용하기 위해서는 프로그램 맨 앞줄에 다음 import 문이 필요하다.
ex) import java.util.scanner;
scanner 는 자바에서 제공되는 java.util 패키지에 있으므로 꼭 입력해야 한다.
Scanner 클래스로 키 입력받기: Scanner 클래스는 사용자가 입력하는 키 값을 공백 문자('', '\t', '\n')를 기준으로 분리하여 토큰 단위로 읽는다.
사용자가 "Kim Seoul 20 65.1 true"를 입력하면, Scanner 객체는 빈칸으로 끊어 "Kim","Seoul","20","65.1","true"의 토큰 단위로 읽는다.
Scanner 클래스를 이용하여 키 입력을 받을 때 <표 2-4>의 메소드를 사용한다. 다음은 예와 같이 사용자가 키를 입력할 때
Scanner 클래스의 메소드를 사용하여 사용자가 입력한 문자열, 정수, 실수 등을 읽는 코드이다.
ex) scanner sc = new scanner(System.in);
ex) String name = sc.next(); // "kim"
ex) String city = sc.next(); // "Seoul"
ex) int age = sc.nextInt(); // 20
ex) double weight = sc.nextDouble(); // 65.1
ex) boolean isSingle = sc.nextBoolean(); / true
<표 2-4>
메소드               |                    설명
String next()           다음 토큰을 문자열로 리턴
byte nextByte()         다음 토큰을 byte 타입으로 리턴
short nextShort()       다음 토큰을 short 타입으로 리턴
int nextInt()           다음 토큰은 int 타입으로 리턴
long nextLong()         다음 토큰을 long 타입으로 리턴
flot nextFlot()         다음 토큰을 flot 타입으로 리턴
double nextDouble()     다음 토큰을 double 타입으로 리턴
boolean nextBoolean()   다음 토큰을 boolean 타입으로 리턴
String nextString()     다음 토큰은 String 타입으로 리턴
void close()            Scanner 의 사용 종료
boolean hasNext()       현재 입력된 토큰이 있으면 true, 아니면 입력 때까지 무한정 대기, 새로운 입력이 들어올 때 true 리턴

nextLine()과 next()
"Seoul Korea"와 같이 공백이 낀 문자열을 입력받기 위해서는 Scanner 클래스의 nextLine()을 이용하면 된다.
앞의 경우 next()는 "Seoul"만 문자열로 리턴한다.

Scanner 객체 닫기: scanner 객체의 사용을 종료하려면 다음과 같이 닫아 준다.
ex) scanner.close();
Scanner 객체가 닫히면 System.in도 함께 닫이므로 더 이상 System.in을 사용하여 키 입력을 받을 수 없다.
ex) scanner.close();
scanner = new Scanner(System.in); // scanner 를 닫은 후 다시 scanner 로 키 입력 받을 수 없음.
* */


public class MySystem {
}
