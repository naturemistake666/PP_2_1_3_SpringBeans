package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String say;
    public Cat(String say) {
        this.say = say;
    }

    @Override
    void say() {
        System.out.println("МЯУ");
    }
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
