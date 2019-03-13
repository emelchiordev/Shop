public interface Writer {
    /**
        start writing process
     */
    public void start();
    /**
     * write differents line
     */
    public void writeLine(String line);
    /**
     * stop writing process
     */
    public void stop();

}
