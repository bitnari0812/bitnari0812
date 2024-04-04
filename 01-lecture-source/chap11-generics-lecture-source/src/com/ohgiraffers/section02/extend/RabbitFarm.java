package com.ohgiraffers.section02.extend;
//public class RabbitFarm<T implements Animal> {}// 에러남
//public class RabbitFarm<T extends Animal> {}      // 정상
//public class RabbitFarm <T extends Rabbit>{}
//public class RabbitFarm <T extends Rabbit & Animal>{}    // 반드시 클래스가 앞에, 인터페이스 상속이 뒤에
//public class RabbitFarm <T extends Rabbit, Snake>{}      //클래스 클래스는 안됨(콤마를 찍으면 되긴 하지만 하나의 클래스만 구현됨)
public class RabbitFarm <T extends Rabbit>{
    private T animal;
    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}