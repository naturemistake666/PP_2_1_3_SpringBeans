package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String say;
    public Dog (String say) {
        this.say = say;
    }
    @Override
    void say() {
        System.out.println("ГАВ");
    }
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
