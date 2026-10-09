/**
 * 生成问候语。把问候文本从 Main 里抽出来，方便复用和单独测试。
 */
public class Greeter {
    private final String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello and welcome, " + name + "!";
    }
}
