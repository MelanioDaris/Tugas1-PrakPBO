public class Konversi {
    double celcius;

    Konversi(double celcius) {
        this.celcius = celcius;
    }

    double reamur() {
        return (4 * celcius) / 5;
    }

    double fahrenheit() {
        return (9 * celcius) / 5 + 32;
    }

    double kelvin() {
        return celcius + 273.15;
    }
}
