package site.mizore.dogstate;

public class MainClass {
    public static void main(String[] args) {
        Dog yellowDog=new Dog();
        yellowDog.setState(new DogState() {
            @Override
            public void showState() {
                System.out.println("摇了摇尾巴~");
            }
        });
        yellowDog.cry();
        yellowDog.setState(new DogState() {
            @Override
            public void showState() {
                System.out.println("汪汪汪！！！");
            }
        });
        yellowDog.cry();
        yellowDog.setState(new DogState() {
            @Override
            public void showState() {
                System.out.println("用舌头舔了舔你的脸颊。");
            }
        });
        yellowDog.cry();
    }
}
