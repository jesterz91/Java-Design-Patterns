package Singleton;

/**
 * 싱글톤 패턴(Singleton Pattern)
 * 오직 하나만 생성해야할 객체가 필요할 때 사용하는 패턴
 */

public class Korea {
    public static void main(String[] args) {
        // 생성자의 private 키워드가 있기 때문에 new 키워드를 통한 인스턴스 생성불가
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        // 오직 하나의 인스턴스만 생성되기 때문에 동일한 값 출력
        System.out.println(president1);
        System.out.println(president2);

    }
}
