import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        // 객체 생성
        Dog dog = new Dog();
        Baby baby = new Baby();
        Tiger tiger = new Tiger();
        Robot robot = new Robot();
        // 인터페이스 배열 생성
        ArrayList<Sounding> list = new ArrayList<>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);
        // 소리내기 foreach문
        for (Sounding ttt : list) {
            ttt.sound();
        }
    }
}

/* 인터페이스 및 클래스를 작성하시오. */
    interface Sounding{
        public void sound();
}
    class Dog implements Sounding{
        String name;
        @Override
        public void sound() {
            System.out.println("Dog: 멍멍!");
        }
    }
    class Baby implements Sounding{

        @Override
        public void sound() {
            System.out.println("Baby: 응애!");
        }
    }
    class Tiger implements Sounding{

        @Override
        public void sound() {
            System.out.println("Tiger: 어흥!");

        }
    }
    class Robot implements Sounding{

        @Override
        public void sound() {
            System.out.println("Robot: 삐빕!");
        }
    }