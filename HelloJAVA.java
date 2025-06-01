
public class HelloJAVA {
	public static void main(String[] args) throws Exception{
	}
}


/* 	
 	자바프로그래밍 (객관식의 경우, "모두 고르시오."라고 하는 문제가 많을 예정, 문제는 보통 코드를 보여주고 잘못된 것은?이라고 물음.)

Ⅰ. 자바개요
	※ 자바가 만들어진 목적
		- 플랫폼 호환성 문제 해결
		- 독립적인 언어 개발
		- 메모리 사용량 ↓, 다양한 플랫폼 가진 가전 제품에 적용

	※ 기존 언어의 플랫폼 종속성
		※ 플랫폼 호환성 없는 이유? -> CPU, API, 실행파일 형식이 다름.

	ⅰ. WORA
		- 작성된 코드는 모든 플랫폼에 바로 실행되는 특징.
		- 기존 언어가 가진 플랫폼 종속성 극복
		- 어느 클라이언트에서나 실행

	※ 특징
		- 바이트 코드 (자바 소스 컴파일 목적 코드, 중립적 코드, 해석 AND 실행)
		- JVM (자바 가상 기계)

	ⅱ. 자바 특징
		- 객체지향 (클래스, 추상화, 상속 등 지원)
		- 플랫폼 독립성 ( 자바 가상 기계에서 바이트 코드 실행)
		- 멀티 스레드 제공 (운영체제 도움 x)
		- 패키지 단위 관리 (클래스를 패키지 단위로 묶어서 관리)
		- 손쉬운 GUI 프로그래밍

		※ 자바 응용 종류
			- 데스크톱 
			- 서블릿
			- 안드로이드 앱

	ⅲ. JDK(Java Development Kit, 자바 개발 환경, 개발 필요 도구 포함)와 
	JRE(Java Runtime Environment, 자바 실행 환경, 자바 가상 기계 포함, 프로그램 실행만 하는 경우 JRE만 설치)
		Java SE 구성 집합관계 : JDK (API 도구들 포함) > JRE

	ⅳ. 자바 API (Application Programming Interface, JDK에 포함된 클래스 라이브러리)
		※ 자바 패키지 
		- 서로 관련된 클래스들을 분류하여 묶음
		★ - 계층구조
		- 자신의 패키지 생성 가능
		- API는 JDK에 패키지 형태로 제공



Ⅱ. 자바 개발환경 구축
	bin -> 런쳐와 모듈 (주로 쓰임)
	include -> C클래스 헤더파일.
	lib -> 도구

	※ 환경변수 설정
	- 환경변수 확인 -> echo 변수명 	ex) echo %JAVA_HOME%, echo %PATH%
	
	※ 시스템 변수 추가
		- Java_Home : C:\Program Files\Java\jdkX.X.X_YYY
		- PATH : ;%JAVA_HOME%\bin
		- CLASSPATH : ;.;%JAVA_HOME%\lib

	※ 자바 통합 개발 환경
		- IDE -> 편집, 컴파일, 디버깅 한번에 하는 통합된 개발 환경
		- 이클립스 -> 자바 응용 프로그램 개발, IBM에 의해 개발된 오픈소스 프로젝트
		- 인텔리제이 

 
 	System.out.printIn -> 전달받은 문자열 받은 후 다음 줄로 개행
	System.out.print -> 전달받은 문자열 그대로 출력
	System.out.printf -> 전달받은 문자열 포맷해서 출력
	java.util.scanner ->입력받기(input) {import도 넣어줘야함.}
	nextInt() -> 정수입력 받기
	new -> 객체 생성할 때 쓰임.
	java.util.Scanner s = new java.util.Scanner(System.in)
	-> 클래스형 지정하고, ,new 해주면서 생성자를 호출한 객체 생성
	s.close() : 모든 변수에 입력을 끝내면 꼭 닫아줘야 함.
	
	과제 - scanner를 이용한 연봉들의 합 구하기
	
	Ⅳ. 변수와 자료형
	변수 : 메모리 공간 구분하기 위해 사용하는 이름, 메모리 주소 대신 이름 사용, 데이터 저장 또는 참조를 위해 메모리 공간에 접근가능
	
	※ 작명 규칙
		- 유니코드 사용 (한글 사용 가능)
		- '_' 및 '$' 사용 가능
		- 대소문자 구별, 첫 번째 위치에 숫자 및 자바 언어 키워드 사용 x, 길이 제한 x
		
	ⅰ. 기본자료형 : 크기는 CPU나 운영체제에 따라 변하지 않음.
	(숫자 범위도 알아놓을 것!)★★★ 1. 기본 자료형(8개)
	boolean : 1byte, true or false
	char : 2byte, Unicode
	byte : 1byte, -128 ~ 127
	short : 2byte, -32768 ~ 32767 (-2^15 ~ 2^15 - 1)
	int : 4byte, -2^31 ~ 2^31 - 1
	long : 8byte, -2^63 ~ 2^63 -1
	float : 4byte, -3.4E38 ~ 3.4E38
	double : 8byte, -1.7E308 ~ 1.7E308
	
	2. 참조 자료형
		- 클래스, 인터페이스, 배열, 기본형에 대한 레퍼런스 (Integer, Double)
	
	ⅱ. 연산자
	r1이 int타입일 때, r1 = 3 + 5 / 2 - 1로 하면 소수점이 짤린다. 소수점을 살리고 싶다면 5와 2에 각각 (double)로 형변환시켜준다.
	
	
	Ⅴ. 조건문 : if 구문
	operator : +, - , *, /
	
	
	Ⅵ. 순차구조를 반복구조로
	- 반복문(loop) : while, do~while, for문
	whlie문, for문, for-each문( -> for(타입 변수명 : 배열){ 문장 } )
	- 들여쓰기 : 일정 간격만큼 오른쪽으로 건너띄어쓰기 (∵ 코드의 가독성)
	- 배열만들기 : String[] 변수 = new String[] {집합};
	
	
	Ⅶ. ★★★★★★ 클래스와 객체 (학습 목표 4개 알기)
	★★★구조적 프로그래밍과 객제치향프로그래밍 차이점, 객체와 추상화 개념, 자바에서 클래스 정의하기
	- 구조적 프로그래밍 : 처리작업을 이련의 작업(기능) 순서로 표현, 함수 집합으로 프로그램 작성
	- 객체 지향 프로그래밍 : 컴퓨터 수행 작업을 객체 간 상호 작용으로 표현, 클래스 또는 객체들의 집합 프로그램 작성, Actor로 설계됨.
	클래스이름 - 필드 - 메소드
	키워드 : class 및 interface
	★★★ (무조건 시험에 나옴) 접근 지시자(access specifier) : default (동일 패키지 내부 클래스에서 접근 가능), private, protected, public
	제한 범위 : private(정의된 클래스 내부만) < default(동일 패키지 내부 클래스) < protected(default + 상속관계 서브 클래스) < public (패키지 내/외부 클래스)
	★★★ 접근 지시자를 활용한 패키지 문제 (무조건 나옴)
	
	1. 객체 (Object) : 현실 세계의 사물이나 개념을 사용할 수 있도록 만든 SW 모델
		-속성(attributes, properties) : 객체 특성 표현 정적 요소(= field)
		-행동(behaviors, messages) : 객체 내부 일 처리 or 동적 행위 처리 (= method)
		
	2. 추상화 : 현실 세계 객체에서 해결할 컴퓨터 프로그래밍 문제와 관련 요소(측면)만을 주목하여 설명하는 방식, 필드와 메소드를 캡슐화하여 정보은닉하는 과정
		- 현실 세계 객체에 필요한 요소만 찾아 클래스 생성
		- 속성, 행동 -> 추상화 실현
	
	3. 캡슐화 : 객체와 객체 간의 의사소통을 위한 정보노출, 추상화 과정에서 클래스 정의할 때
		※ 캡슐화 하는 이유 : 객체 내부구현 변경되어도 객체 사용 코드 수정 필요 x, 의사소통에 필요한 내용만 알 수 있음.
	
	클래스 : 객체 만들기 위한 설계도 또는 틀(template), 반드시 객체 특성 표현 가능 모형 클래스 필요
	객체 : 클래스의 구체적 하나의 실례적(instance) 클래스
	
	예재1. 원 클래스 (시험 나올 가능성 ★★★)	
	객체 생성 : new 연산자로 객체 생성(heap 영역)
	객체 소멸 : 메모리를 자바 가상 기계에 되돌리는 행위, 객체 (강제) 삭제 기능 없음.
	가비지 컬렉션(garbage collection) : 참조 없는 객체 메모리를 가용 메모리에 포함하는 과정, JVM이 판단함, 개발자에 의해 강제 가비지 컬렉션
	※ 클래스 안의 속성을 정의할 때 접근 지시자가 생략되면 묵시적으로 default로 선언됨.
	
	
	Ⅷ. 메소드 : 반드시 클래스 안에 위치(=캡슐화)
	 	- 하나의 파일에 클래스 여러 개 존재 가능, but public 클래스 2개 이상 존재 x
	 	- public 클래스 이름과 파일 이름 동일해야 함.
		- private 변수 선언 시 다른 객체에서 필드에 접근 x	->	Getter,Setter 이용
		
	1. 인자 전달 방식
		- 기본 타입 값을 전달하는 경우 (call by value) : 값 복사 전달 (값 기반 함수 호출)
		- 객체 또는 배열 전달하는 경우 (call by reference) : 참조가 전달 (참조 기반 함수 호출)
	
	2. 오버로딩(overloading)
		- 메소드 중복 정의 : 하나 클래스 안에 같은 두 개 이상의 메소드 정의
		- 시그니처 변경 : 매개변수의 개수, 자료형, 순서가 상이 (반환형이 다른 경우 해당 x)
		
		
	Ⅸ. 생성자
	this 레퍼런스 : 현재 객체 자기 자신을 가리킴. (객체 이름 생략하면 묵시적 this로 가정)
	this() : 생성자 -> 다른 생성자 호출, 생성자 내에서만 사용 가능, 반드시 생성자 코드 제일 처음에 수행해야 함.
	
	☆ 생성자
		- 클래스 이름과 동일한 특수 메소드
		- new 연산자로 객체 생성될 때 자동실행
		- 오버로딩 가능, 반환x, 반드시 하나 이상 정의되야함, 생성자 정의 안해도 컴파일러에 의해 기본 생성자 정의.
		
		
	Ⅹ. static 멤버
	1. 정적 멤버 활용
		- 전역 변수와 전역 함수를 만들 떄 사용
		- 공유 멤버 만들고자 할때
		
	2. 정적 메소드 제약 조건
		- static 멤버만 접근 가능 : 비정적 멤버에 대한 접근 불가, 비정적 메소드는 정적 멤버들 모두 사용 가능
		- this 키워드 사용 불가 : 객체 생성되지 않은 상태에서도 호출이 가능하므로 객체를 가르키는 this 사용 불가
		
		
	ⅩⅠ. 배열과 열거형
		int [] 배열 = new int[10];	-> 배열 생성
		int [][] 배열 = new int[10][5];	-> 2차원 배열 생성
		
	※ 열거형 이해 (시험 출제 x)
		- 일부 한정된 값만 가지는 경우 사용하는 자료형 (enum)
		
		
	ⅩⅡ. ★예외처리 (5.3 예외처리 pdf 참고)
	예외(exception)(= 오류(error)) : 문법적 오류 및 논리적 오류, 논리적 에러는 컴파일러가 알 수 없음. 예외처리 안하면 프로그램 강제종료
	☆ 처리방법 : try ~ catch ~ finally, 상위 메소드로 예외전달 : throws
		try : 예외 발생 가능성 있는 실행문
		catch : 처리할 예외 타입 선언, 예외 처리문
		finally : 예외 발생 여부와 무관하게 항상 실행되는 문장, 생략가능
		throws : 메소드 레벨에서 사용, 오류를 메소드 안에서 잡지 않고 메소드를 호출한 상위 메소드를 잡는다는 의미의 키워드.
		
	※ Exception vs RuntimeException
		Checked Exception : 컴파일 단계에서 예외처리 필요
		Unchecked Exception : 예외처리 x, RuntimeException을 상속함. 
		
	※ Custom Exception : 커스터마이징 사용 가능, 표준 예외로 예외를 표현하기 어려울 때 사용
	
	※ 예외적 오류
	- OutOfMemoryException : 메모리 부족하면 발생
	- ArrayIndexOutOfBoundsException : 배열 범위 벗어난 접근 시 발생
	- IllegalArgumentException : 잘못된 인자 전달 시 발생
	- InputMismatchException : 잘못된 자료형 입력한 경우 발생	
	
	
	ⅩⅢ. 패키지
	1. 패키지 : 연관 클래스 파일들을 하나의 디렉터리에 묶은 것, .jar 파일로 압축가능
	
	2. 주요 패키지
		- java.lang : 자바 언어 패키지, 자동 import 됨.
		- java.util : 자바 유틸리티 패키지, import 필요.
		- java.io : 입출력 클래스와 인터페이스 제공
		- java.awt : 자바 GUI 프로그래밍 클래스와 인터페이스 제공
		- javax.swing : 스윙 패키지
		
	3. 패키지 특징
		- 클래스 파일 관리 편이
		- 패키지별 접근 제한
		- 동일 이름의 클래스와 인터페이스 사용 가능
		★ 높은 SW 재사용성
	
	
	ⅩⅣ. 상속
	★ 상속 키워드 : extends
	
	※ 자바 상속 특징
		- 다중 상속 지원 x
		- 상속 횟수 무제한
		- 상속 최상위 조상 클래스 : java.lang.Object 클래스
		
	★ 슈퍼 클래스의 멤버에 대한 서브 클래스 접근
		private : sub 클래스 접근 x
		default : 서브 클래스가 동일 패키지에 있을 때만 접근 가능
		public : 항상 접근 가능
		protected : 같은 패키지 내 모든 클래스 접근 허용, 패키지 여부 상관없이 서브 클래스는 접근 가능
		
	※ sub와 super 클래스의 생성자 선택
		- 개발자의 명시적 선택 : super() 키워드 사용, 생성자 명시적 선택
		- 컴파일러가 기본 생성자 선택 : 자동 슈퍼 클래스의 기본 생성자 선택
		
	★ super()
	- 서브 클래스에서 명시적으로 슈퍼 클래스의 생성자 선택 호출할 떄 사용
		※사용방식
			- super(parameter);
			☆ 반드시 서브 클래스 생성자 코드 첫 번째 라인에 위치해야 됨!
			
			
	
	ⅩⅤ. 다형성
	업캐스팅(upcasting) : sub 레퍼런스를 super 레퍼런스에 대입
	다운캐스팅(downcasting) : super 레퍼런스를 sub 러페런스에 대입
	instanceof 연산자 : 레퍼런스가 가리키는 객체 타입 식별 (기본 자료형에 사용 불가)
	
	1. 메소드 재정의
		- super 메소드를 sub에서 재정의한 것 (super의 메소드이름, 매개변수타입 및 개수, 리턴타입 모두 동일 정의)
		- 동적 바인딩 발생 : 호출 메소드 실행 시점에 결정
	
	2. 메소드 재정의 조건
		- super의 메소드이름, 매개변수타입 및 개수, 리턴타입 모두 동일해야 됨!
		- 범위: 재정의 메소드 접근 지정자 > super 메소드 접근 지정자 이여야 함!
		- staic, private, final 메소드 재정의 x
		
	3. 다형성(polymorphism)
		- 한 클래스 내에 같은 이름이지만 다르게 동작하도록 표현 -> method overloading
		- 동일 이름의 동작을 클래스에 따라 다르게 구현 -> method overriding
		
		★★★ overloading vs overriding
		정의	 :	 클래스 내부	상속 관계
		목적	:	사용 편리성		super 메소드 기능 재정의
	조건	:	메소드 이름 동일, 개수와 타입이 다름		모두 동일
		바인딩 :	정적 바인딩		동적 바인딩
		
	4. super 키워드
		- sub에서 super 멤버로 접근할 때 사용하는 super 타입의 레퍼런스
		- 상속관계에 있는 sub에서만 사용가능
		- 재정의된 super 메소드 호출 시 사용
		
	5. final 키워드
		final 클래스 - 클래스 상속 불가
		final 메소드 - 오버라이딩 불가
		final 필드 - 값 변경 불가 (상수 정의)
		
		
	※ 과제는 0602 다형성 pdf 참고
	
	
	
ⅩⅥ. 추상클래스와 인터페이스
	1. 추상클래스 : 선언 되었으나 구현이 없는 메소드, 추상메소드를 하나라도 가진 클래스
		- 추상 메소드 선언 : public abstract int getValue();
		- sub에 재정의(overriding)하여 구현해야 함.
		- 클래스 앞에 abstract로 선언한 경우
			
		※ 필요성
			- 계층적 상속 관계를 갖는 클래스 구조 만들 때
			- 설계와 구현 분리
			- 설계의 동일성 확보
			
		※ 특성
			- 객체 생성 불가
			- 추상클래스 상속 : 상속할 때 추상메소드 미구현 (sub도 abstract로 선언해야 함)
	
	2. 인터페이스 : 다형성을 정의하는 객체간의 규약 (implements 키워드사용)
		public interface 이름 {} 초기화한후 활용하려면 활용하려는 클래스 뒤에 implements를 씀.
		※ 역할
			- 기능 명세서
			- 작성 코드가 클래스에 종속되지 않도록 함. (-> 클래스 쉽게 교체가능)
		※ 특징
			- 객체 생성 불가
			- 다중 상속 가능 	ex) public interface ClockRemoteController extends Clock, RemoteController (Interface)
			- 다중 구현 가능	ex) public class ClockRemoteController implements Clock, RemmoteController
			- 동시 상속 및 구현 가능 	ex) public class SmartPhone extends Phone (class) implements MP3 (Interface)
			
		※ 쓰는 이유
			- 개발시간 단축, 표준화 가능, 관계없는 클래스 연결, 독립적 프로그래밍 가능, 믹스인(mixin) 정의
			
	3. 인터페이스 구성 가능 멤버
		ⅰ. ☆ 상수 필드 : public static final
		ⅱ.☆ 추상 메소드 : public abstract
		ⅲ. 디폴트 메소드 : default 키워드 사용, public으로 가정
		ⅳ. 정적 메소드 : public으로 가정
		
	4. ★★★ 추상클래스와 인터페이스 비교
		※ 추상 클래스
			- 상수, 변수 필드 포함 가능
			- 모든 sub에 공통 메소드가 있으면 추상클래스가 적합
			- 단일 상속만 지원
			
		※ 인터페이스
			- 상수 필드만 가능
			- 객체 간 규약 정의하는 경우 인터페이스 사용
			- 다중 상속 지원
		
		
		
ⅩⅦ. Class Diagram in UML (과제는 0702 pdf도 참고)
	1. UML (Standardized specification language for object medeling)
		- SW 산출물을 명세화, 가시화, 구축, 문서화를 위한 시각적 모델링 언어
		※ 관점 : 사용자 관점, 시스템 정적구조, 시스템 동적행동

	2. Model	
		- 실체를 상상하거나 추측할 수 있도록 만든 대체표현
		
	3. class diagram
		- 클래스 정의 및 클래스간의 관계, 속성과 동작으로 표현
		※ 관계 : 일반화(generalization), 실체화(Realization), 연관(Association), 의존(dependency)
		※ 연관 종류 : 일방 관계 (화살표 사용 표현), 양방 관계 (직선 사용 표현), 관계 수 (연관을 가진 객체 수 표현)
	


------------------------기말------------------------------
Ⅰ. Object 클래스
	- 모든 자바 클래스는 Object 클래스 상속함.
	1. 속성관련 메소드
		- hashCode() : 객체 해시코드 값 리턴
		- getClass() : 객체 클래스 정보를 담은 class 객체 리턴, 객체 클래스 이름 리턴
		- toString() : 객체를 문자열로 리턴
		- equals(Object obj) : obj의 객체와 현재 객체 비교해서 같으면 true 리턴

	2. Wrapper 클래스
		- 자바 기본 데이터 타입을 클래스화한 8개 클래스
		- 기존 데이터 타입 사용 못하고 객체만 사용하는 경우에 사용 가능
			ex) Byte, Short, Integer, Long, Float, Double, Character, Boolean

	3. Wrapper 객체 생성
		Integer i = new Integer(10);	Double d = new Double("3.14");
		Boolean b = new Boolean(true);	Float f = new Float(3.14f);
		
	4. 박싱(boxing)과 언박싱(unboxing)	=> JDK 1.5부터 자동(auto) 박싱과 언박싱 지원함.
		박싱 : 기본 자료형을 Wrapper 클래스 객체로 변환
		언박싱 : 박싱 반대 변환


Ⅱ. String 관련 클래스
	- 문자열 리터럴(literal) : String 객체로 처리, 스트링 리터럴 테이블에 저장되고 관리되고 공유됨.
	- new String() 문자열 : 힙에 생성되고 공유 x 	
		ex) String d = new String("Hello"); String e = new String ("Hello"); 는 각각 다른 공간
			String a = "Hello";		String b = "Hello";	는 똑같이 공유된 공간
			if(a.equals(b))	// true		if(d.equals(e))	// true
			if(a == b)	// true			if(d == e) // false
		
	※ 주요 메소드
		- String substring(int s_idx, int e_idx) : 인덱스 s에서 e까지 부분 문자열 반환	
		- int compareTo(String str) : 0(동일), 음수 (사전 순서 먼저), 양수 (사전 순서 이후)
		- String concat(CharSequence cs) : 문자열 결합
		- String [] split(String regex) : 정규식 기반 문자열 분리
		- String substring(int index) : 부분 문자열 반환 (공백 제외해서 인덱스 읽음, 3이면 3번째부터 읽음)
		
		
	1. StringBuilder와 StringBuffer	->	둘다 문자열 내용 변경하는경우 높은 성능 제공
		StringBuilder : String 객체를 StringBuilder 객체로 자동 변환 (단순결합), 동기화 미지원
		StringBuffer : 문자열 수정이 많은 경우에 적합, ★동기화 지원, append(), insert(), replace() 메소드 제공


	2. Math 클래스
		- 기본 함수, 삼각 함수, 각도 변환, 지수-로그 함수
		
		★★★ 난수 생성 (java.util.Random)
			Math.random() 메소드 : 0 ≤ val < 1 사이 난수 발생
				ex) 1월에서 12월 사이의 달 생성 : int(Math.random() * 12 + 1)
			- int nextInt() : 지정 범위 내의 int 반환 (음수포함)
			- int nextInt(int bound) : [0, bound) 범위의 int 반환
			- double nextDouble() [0.0, 1.0) 범위의 double 반환
			- double nextGaussian() : 정규 분포를 따르는 [0.0, 1.0) 사이의 double 반환
			- void setSeed(long seed) : 시드 값 설정
			
	

Ⅲ. 컬렉션
	★ 컬렉션 : 자료구조(리스트, 큐, 스택, 집합, 해쉬 테이블) 구현, 가변길이(개수)의 객체 모음, 삽입/삭제/검색 등에 대한 관리 용이
	
	1. 컬렉션과 제네릭
		컬렉션 : 제네릭(generics) 기법으로 구현
		제네릭 : 구체적 자료형 정해두지 않고 객체 생성 또는 메소드 호출할 때 자료형을 지정하는 일반화 기법, C++의 템플릿과 동일
			- 원소의 자료형을 변수로 표시 (타입 매개 변수 (type parameter))
			
	2. ArrayList<E> 클래스
		- 데이터(원소) 추가, 데이터 제거, 삽입 가능 자료형 : 객체, null, 기본 타입 (자동박싱/언박싱 or Wrapper 객체 사용)
		
	3. Iterator<E> 인터페이스 : 원소 순차 검색을 위한 메소드 제공
		boolean hasNext() : 다음 반복에 원소가 있으면 true
		E next() : 다음 원소 반환
		void remove() : 마지막으로 반환된 원소 제거
		
		- iterator() 메소드 : 컬렉션 인터페이스 구현 객체에서 iterator 객체 얻을 수 있음, 인덱스 없이 순차적 검색 가능
		
	4. LinkedList<E> (☆비동기화, Set을 통해 동기화 가능)
		- java.util.LinkedList, 양방향 연결리스트제공
		- List와 Dequeue 인터페이스 구현, 원소 삽입/삭제
		- remove(int index) : index번째의 원소 삭제
		
	5. HashSet (☆비동기화, Set을 통해 동기화 가능)
		- java.util.HashSet
		- 집합에 대한 기능 제공 (원소 순서 없고 중복허용 x)
		- Set 인터페이스 구현한 클래스
		- Hash Table 사용하여 원소 저장 (성능 우수, 원소 순서 일정 x)
		- add, remove, contains and size (get() 메소드는 없음.)
				
		※ HashSet 관련 클래스
			ⅰ. TreeSet (비동기화, Set을 통해 동기화 가능 (= Set 인터페이스 구현))
			 - 이진 탐색 트리의 일종인 블랙트리에 원소에 저장
			 - 알파벳 순으로 순서 결정, HashSet보단 느림
			 - Integer 리스트로 만들면 값을 넣었을 때 자동으로 오름차순으로 정렬됨.
	
			ⅱ. LinkedHashSet (Set 인터페이스 구현)
				- 해시 테이블과 연결리스트 결합
				- 원소 순서는 삽입되었던 순서와 동일
				
	6. Set의 대량 연산 메소드
		s1.containsAll(s2) -> s2가 s1의 부분 집합이면 true
		s1.addAll(s2) -> s1과 s2의 합집합으로 변경
		s1.retainAll(s2)	-> 교집합
		s1.removeAll(s2)	-> 차집합
	
	7. Collections 클래스 (java.util 패키지에 포함)
		- 컬렉션에 대해 연산 수행 후 결과 컬렉션 반환
		- 모든 메소드는 static 타입
		- 주요 메소드 : sort(), reverse(), max(), min(), shuffle(), binarySearch()
		
	
	
Ⅳ. 제네릭 (= C++ 템플릿)
	1. 제네릭 만들기	
		- 클래스나 인터페이스 선언부에 일반화된 타입 추가
			ex) public class MyGenericClass<T>{}
		- 제네릭 클래스 레퍼런스 변수 선언 및 구체화 : 구체적 타입 대입하여 변수 및 객체 생성
			ex) <T>에 <String> 또는 <Integer>등으로 타입 결정
		※ 구체화 오류 : 타입 매개 변수에 기본 자료형 타입 사용 x
			ex) int를 사용할 수 없음.
	
	2. 타입 매개 변수
		- generic class는 자료형을 변수로 표시 (타입 매개변수)
		- 타입 매개변수의 자료형 객체는 생성 불가	ex) T obj = new T();는 안됨.
		
	3. 제네릭과 배열
		- 제네릭 클래스와 인터페이스에 대한 대한 배열 생성 불가
		- 타입 매개변수의 경우 배열에 대한 레퍼런스 허용
		- 메소드 정의 : <T> return_tupe function_name(T param1, T param2,...){}
		- 메소드 호출 : obj.<string>function_name(str1, str2)
		
	
	
Ⅴ. 입출력 스트림과 파일 입출력	
	1. stream (스트림)
		- 입/출력 장치와 프로그램 연결하여 그 사이의 데이터 흐름을 처리하는 SW 모듈
		- input stream (입력 스트림) : 입력 장치로 전달되는 데이터 흐름 또는 데이터 전송 SW 모듈
		- output steam (출력 스트림) : 출력 장치로 보내 데이터 흐름 또는 데이터 전송 SW 모듈
		
		※ 특징
			- 단방향, 선입선출 구조, ★ stream 기본 단위 : 바이트
	
		※ 종류
			- byte stream : 단순 바이트(이진 데이터)의 흐름 처리
				ex) 영상 파일 읽는 입력 스트림
			- character stream : 문자 입출력, 문자 아닌 이진 데이터는 처리과정에 문제 발생 (글자깨짐등)
				ex) 텍스트 파일 읽는 입력 스트림
			+ JDK는 입출력 스트림을 구현한 다양한 클래스 제공
	
	2. 바이트 스트림 클래스 개요 (java.io 패키지에 포함)
		- InputStream/OutputStream (추상클래스) : 바이트 입출력 스트림을 다루는 슈퍼 클래스
		- FileInputStream/FileOutputStream : 이진 파일 입출력, 바이트 단위로 파일을 읽거나 저장하는 클래스
		- DataInputStream/DataOutputStream : 문자열을 이진 형태로 입출력, 변수를 바이너리 값 그대로 입출력, 기본 자료형 단위로 데이터 읽고 씀.
		- ObjectInputStream/ObjectOutputStream : 객체가 가진 데이터들을 순차적 데이터로 변환 입출력 ( -> 직렬화(serialization))
		
	3. 문자 스트림 클래스 (java.io 패키지에 포함)
		- Reader/Writer : 추상클래스, 문자 스트림을 다루는 슈퍼 클래스
		- InputStreamReader/OutputStreamWriter : 지정된 문자집합 이용, 바이트와 문자 스트림 연결하는 다리 역할
			전자 : 바이트를 읽어 문자로 인코딩
			후자 : 문자를 바이트로 디코딩하여 출력
		- FileReader/FileWriter : 텍스트 파일 -> 문자 데이터 입출력
		
	4. 파일 입출력과 예외 처리
		- 스트림 생성 과정 : FileNotFoundException (파일 경로 오류, 디스크 고장) 발생
		- 파일 읽/쓰/닫기 과정 : IOException (디스크 오동작, 파일 손상, 디스크 공간 부족) 발생
		=> try-catch 블록 반드시 사용
	
	5. 문자 스트림으로 텍스트 파일 쓰기
		- FileWriter 클래스 이용
			파일 열기 : FileWriter fout = new FileWriter("경로");
			파일 쓰기 : fout.writer('A'); -> 문자 'A'를 파일에 기록
			스트림 닫기 : fout.close();
	
	6. File 클래스
		- 파일의 경로명을 다루는 클래스 (java.io.File, 추상적 표현)
		- 파일 이름 변경/삭제/디렉토리 생성/크기 등 파일 관리 (but File 객체는 파일 읽/쓰 기능이 없음, 파일 스트림 클래스 이용해야 됨.)
	
	7. 직렬화 (serialization)
		- 객체가 가진 데이터들을 순차적 데이터로 변환
	
	8. 버퍼 스트림
		- 입출력 데이터를 일시적으로 저장하는 버퍼 사용 -> 입출력 효율 개선
		목적 : 운영체제의 API 호출 횟수를 줄여 입출력 성능 개선
	
	
	
	
	
 */