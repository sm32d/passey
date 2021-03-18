class Passey {
    //33 to 125
    private String pass;
    private int len;
    private char[] ch;

    public Passey (int len) {
        this.len = len;
        ch = new char [len];
    }

    private char getRandomChar () {
        String chars = "ABCDEFGHIJKLMNOP4567QRST^UVWXYZ28abcdefghi@#jklmnop$qrstuvwxyz!%&*3019";
        char ch;
        int index = (int)Math.floor(Math.random() * chars.length());
        ch = chars.charAt(index);
        return ch;
    }

    private void buildPass () {
        for (int i = 0; i < len; i ++) {
            ch [i] = getRandomChar();
        }
        pass = new String (ch);
    }

    @Override
    public String toString() {
        buildPass();
        return pass;
    }

}