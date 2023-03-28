/**
 * 제네릭 인터페이스
 * 
 * @param <P> 타입 파라미터로 상품을 전달 받는다.
 */

package com.javalab.api.pkg04;

public interface Rentable<P> {
	P rent(); // 추상메소드 : 구현클래스(자식)에서 반드시 오버라이딩!   public abstract 생략 되있음.
}