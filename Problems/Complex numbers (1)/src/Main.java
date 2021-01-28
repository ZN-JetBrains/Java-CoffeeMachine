class Complex {

    double real;
    double image;

    // write methods here
    void add(Complex num) {
        real += num.real;
        image += num.image;
    }

    void subtract(Complex num) {
        real -= num.real;
        image -= num.image;
    }
}