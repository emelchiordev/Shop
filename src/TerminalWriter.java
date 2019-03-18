public class TerminalWriter implements Writer{
    @Override
    public void start() {

    }

    @Override
    public void writeLine(String line) {
        System.out.print(line);

    }

    @Override
    public void stop() {

    }
}
