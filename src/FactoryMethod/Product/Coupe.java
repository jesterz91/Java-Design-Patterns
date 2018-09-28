package FactoryMethod.Product;

public class Coupe implements Car {

    @Override
    public void TestDrive() {
        System.out.println("쿠페를 타고 시험주행을 합니다.");
    }
}
