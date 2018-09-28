package FactoryMethod.Product;

public class Sedan implements Car {

    @Override
    public void TestDrive() {
        System.out.println("세단을 타고 시험주행을 합니다.");
    }
}
