import java.util.Random;

class Passey {
    //33 to 125
    private String pass;
    private int len;
    private char[] ch;
    Random rand;

    public Passey (int len) {
        this.len = len;
        rand = new Random();
        ch = new char [len];
    }

    private char getRandomChar () {
        char temp = (char) (rand.nextInt(90) + 33); //nextInt((max - min) + 1) + min;
        return temp;
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