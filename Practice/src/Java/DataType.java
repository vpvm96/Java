package Java;

/* 데이터 타입(DataType)이란 자바에서 다룰 수 있는 데이터의 종류이다.
자바의 언어는 다음과 같이 총 9개 타입의 데이터를 다룰 수 있다.
기본 타입(basic type): 8개  (boolean, char, byte, short, int, long, float, double)
레퍼런스 타입(reference type): 1개 타입은 한 가지이지만 용도는 3가지이다.
1.배열에 대한 레퍼런스,  2.클래스(class)에 대한 레퍼런스, 3.인터페이스(interface)에 대한 레퍼런스
간단하게 레퍼런스는 배열에 대한 주소 값, 클래스에 대한 레퍼런스는 객체에 대한 주소 값.
기본 타입은 정수를 저장하는 타입(byte, short, int, long)4개이다, 실수는(float, double)의 두 타입을 사용한다.
타입마다 크기가 다르기에 적절한 타입을 선택해야 한다.
자바에서 영어든 한글이든 문자 하나는 2바이트 유니코드(unicode)로 저장된다.
그러므로 자바에서 문자를 나타내는 char 타입은 크기가 2바이트이다. 이것은 문자를 처리하는데 있어 자바의 강점이다.
문자열은 자바의 기본 타입에 속하지 않기 때문에. 자바 라이브러리에서 제공하는 String 클래스를 이용한다. ex) String strName = "Kite";
자바에서 다음과 같이 문자열과 기본 타입의 + 연산이 실행되면. 기본 타입의 값이 문자열로 바뀌고 두 문자열이 연결된 새로운 문자열이 생성된다.
ex) String toolName = "JDK";
ex) toolName + 1.8          -> "JDK1.8"
ex) "(" + 3 + "," + 5 + ")" -> "(3,5)"
System.out.println(toolName + "이 출시됨");  ->  "JDK1.8이 출시됨" 출력

변수와 선언
변수는 데이터를 저장하는 공간이다. 변수를 선언하면 타입 크기의 메모리가 할당됨. 프로그램 실행 중에 값을 쓰고 읽는 공간으로 사용됨.
ex) int(테이터 타입) price;(변수 이름) int 는 정수 타입이라 실수는 저장 안됨.
같은 타입의 변수를 여러 개 선언하려면 다음과 같이 콤마로 분리하면 된다.
ex) char c1, c2, c3;  // 3개의 문자 변수 c1, c2, c3 선언.
변수 선언과 동시에 초기화: 변수 선언과 동시에 초깃값을 지정할 수 있다.
ex) int radius = 10;
ex) char c1 = 'a', c2 = 'b', c3 = 'c';
ex) double weight = 75.56;
변수 읽기와 저장: 변수를 선언한 후에는 다음과 같이 변수에 값을 저장하고 읽을 수 있다.
ex) radius = 10 * 5; // 변수 radius 에 10 x 5의 결과 50 저장.
ex) c1 = 'r'; // 변수 c 에 문자 'r' 저장.
weight = weight + 5.0; // 변수 weight 의 값을 읽고 5.0 을 더해 weight 에 다시 저장.

리터럴: 리터럴이란 프로그램에 직접 표현한 값을 말한다. 정수, 실수, 문자, 논리, 문자열 타입 모두 리터럴이 있으며 다음과 같다.
ex) 34, 42.195, '%', true, "hello"
정수 리터럴: 정수 리터럴은 다음과 같이 4가지 유형이 있으며 변수와 함께 사용하면 다음과 같다.
ex) int n = 15; // 십진수 15
ex) int m = 015; // 015는 8진수로서 십진수 13
ex) int k = 0x15; // 0x15는 16진수로서 십진수 21
ex) int b = 0b0101; // 0b0101은 2진수로서 십진수 5
정수 리터럴은 int 타입으로 자동 컴파일된다. 만일 long 타입으로 지정하려면 숫자 뒤에 L 또는 1 을 붙이면 된다.
ex) long g = 24L; // 24L은 241과 동일
ex) 정수 리터럴의 4가지 유형과 사례 표
    유형       |          설명                 |            사례
   10진수        0으로 시작하지 않는 수                15 -> 10진수 15
   8진수         0으로 시작하는 수                    015 -> 십진수 13 (1x8+5=13)
   16진수        0x로 시작하는 수                     0x15 -> 십진수 21(1x16+5=21)
   2진수         0b로 시작하는 수                     0b0101 -> 십진수 5
실수 리터럴: 실수 리터럴은 소수점 형태나 지수(exponent) 형태로 다음과 같이 실수를 표현한 값 이다.
ex) 12. 12.0 .1234, 0.1234, 1234E-4
실수 리터럴은 double 타입으로 자동 처리되며, 변수와 함께 쓰면 다음과 같다.
ex) double d = 0.1234;
ex) double e = 1234E-4; // 1234E-4 = 1234x10<-4>이므로 0.1234와 동일
숫자 뒤에 f나 F를 붙이면 float, d나 D를 붙이면 double 타입으로 강제 변환할 수 있다.
ex) flot f = 0.1234f; // f = 0.1234로 하면 컴   파일 오류
ex) double w = .1234D // .1234D와 .1234는 동일
문자 리터럴: 문자 리터럴은 단일 인영부호('')로 문자를 표현하거나 \\u 다음에 문자의 유니코드 값을 사용하여 표현한다.
ex) 'w', 'A', '가', '*', '3', '글', \u0041
문자 리터럴을 변수와 함께 쓰면 다음과 같다.
ex) char a = 'A';
ex) char b = '글';
ex) char c = \u0041; // 문자 'A' 의 유니코드 값 (0041) 사용
ex) char d = \uae00; // 문자 '글' 의 유니코드 값 (ae00) 사용
특수문자 리터럴도 있다. 백슬래시(\) 다음에 특수 기호를 붙여서 표현한다. 특수 문자를 이스케이프 시퀸스 라고도 한다.
ex) \b : 백스페이스, \t : 탭, \n : 라인피드, \f : 폼피드, \r : 캐리지 리턴, \" : 이중 인용부호, \' : 단일 인용부호
논리 리터럴과 boolean 타입: 논리 리터럴은 true, false 두 개밖에 없으며, boolean 타입의 변수에 직접 치환하거나 조건문에 사용한다.
ex) boolean a = true;
boolean b = 10 > 0; // 10 > 0가 참이므로 b 값은 true.
boolean c = 1; // 타입 불일치 오류!! C/C++와 달리 자바에서 숫자를 참, 거짓으로 사용 불가.
while(true) {} // 자바에서 무한 루프. while(1)로 하면 안됨.

Tip 기본 타입 이외의 리터럴
1. null 리터럴: null 은 기본 타입에 사용될 수 없고 객체 레퍼런스에 대입된다.
ex) int n = null; // 오류!! 기본 타입에 null 값을 지정할 수 없다.
ex) String str = null; // 정상!!
2. 문자열(String) 리터럴: 문자열 리터럴은 "Hello"와 같이 이중 인용부호로 표현하며, 간단히 문자열이라고도 한다.
ex) "Good", "Morning", "자바", "3.19", "26", "a"
자바에서 문자열 리터럴을 포함하여 모든 문자열은 String 클래스의 객체이다. 그러므로 문자열 리터럴은 다음과 같이 String 객체에 저장된다.
ex) String str = "Good";

상수: 상수를 만드는 방법은 변수 선언 시 final 키워드를 사용하면 된다. 상수는 변수와 달리 실행 중에 값이 바꿀 수 없다.
원주율 3.141592 값을 가진 상수 PI를 선언한 사례이다.
ex) final(상수 선언)double(데이터 타입)PI(상수 이름)= 3.141592(초기화);
   final double PI = 3.141592
개발자는 프로그램에 3.141592를 사용하는 것보다 PI를 사용하는 것이 훨씬 편리하다. 상수는 값이 한 번 초기화되면 더 이상 변경될 수 없다.
그러므로 3.141592의 값을 가진 PI를 다음과 같이 변경하면 컴파일 오류가 생긴다.
ex) PI = 2.3; // 컴파일 오류.
타입 변환: 타입 변환이란 상수 혹은 리터럴의 타입을 다른 타입으로 바꾸는 것을 말한다.
자동 타입 변환: 다음과 같이 차환문(=)이나 수식 내에서 타입이 일치하지 않을 때, 컴파일러는 오류 대신 작은 타입을 큰 타입으로 자동 변환한다.
ex) long m = 25; // 리터럴 25는 int 타입. 25가 long 타입으로 자동 변환.
ex) double d = 3.14 * 10; // 실수 연산을 하기 위해 10이 10.0으로 자동 변환
강제 타입 변환: 강제 타입 변환은 개발자가 강제로 타입 변환을 지시하는 경우이다. 예를 들어 보자. 먼저 다음과 같이 변수 n에 300을 저장한다.
ex) int n = 300;
그리고 다음과 같이 n 값을 byte 변수 b에 저장해보자.
ex) byte b = n; // 컴파일 오류!! int 타입은 byte 타입으로 자동 변환 안 됨.
변수 n에 저장된 값 300은 byte 타입(0~255 범위)의 범위보다 크기 때문에, 컴파일러가 자동 변환을 하게 되면, b에 300이 저장되지 않고
256을 뺀 나머지 (300%256=44)값 44가 저장된다 . 이처럼 큰 타입의 값을 작은 타입의 값으로 변환해야 할 때, 컴파일러는 자동 변환 대신
컴파일러 오류를 발생시킨다.
개발자가 이 사실을 알고도 타입 변환을 원한다면 다음과 같이 () 안에 타입을 명시하여 강제 타입 변환을 지시해야 한다.
ex) byte b = (byte)n; // n을 byte 타입으로 강제 변환. b = 44 (비추천)
강제 변환을 하면 컴파일 오류가 발생하지 않을 뿐 300에서 256을 초과한 만큼 변수 b에 저장되어 데이터 손실이 발생한다. (비추천)
강제 타입 변환의 다른 사례로, 다음과 같이 실수를 정수로 강제 변환하면 소수점이하의 손실이 발생한다.
ex) double d = 1.9;
ex) int n = (int)d; // 강제 타입 변환으로 n은 1이 됨
강제 타입 변환을 캐스팅(casting)이라고도 부른다.
* */



public class DataType {
}
