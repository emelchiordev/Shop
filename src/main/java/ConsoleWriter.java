public class ConsoleWriter implements Writer {
    @Override
    public void start() {
        System.out.println("");
    }

    @Override
    public void writeLine(String line) {
        System.out.println(line);
    }

    @Override
    public void stop() {
        System.out.println("");
    }
}
