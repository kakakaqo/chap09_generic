/**
 * 제네릭 메소드를 사용하는 실행클래스
 * 제네릭 메소드 boxing()
 * - 맨앞의 <T> : 타입 파라미터 
 * - Box<T> : 반환타입
 * - boxing(T t) : 메소드명(파라미터)
 */

package com.javalab.api.pkg05;

public class GenericExample {

	// 제네릭 메소드 boxing()
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		// Box<String> box = new Box<>();
		box.set(t);
		return box; // 제네릭 객체(Integer객체를 갖고 있는)
	}

	// 메인 메소드
	public static void main(String[] args) {
		
		Box<Integer> box1 = boxing(100); // 제네릭 메소드 호출(Integer type)
		// boxing(100) =  boxing(new Integer (100));
		int intValue = box1.get();
		System.out.println(intValue);

		// 제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동"); // 제네릭 메소드호출(String type)
		// boxing("홍길동")  = boxing(new String("홍길동"));
		String strValue = box2.get();
		System.out.println(strValue);
	}
}