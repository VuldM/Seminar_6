
public class Laptop {
    private  String model;
    private int in;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Laptop (int in, int ram, int hdd,String model, String os, String color) {
        this.in = in;
        this.ram = ram;
        this.hdd = hdd;
        this.model = model;
        this.os = os;
        this.color = color;
    }


    @Override
    public String toString() {
        String res = String.format("серийний номер %d,\nМодель %s,\nОЗУ %d Гб,\nжесткий диск %d Гб,\nоперационнай система %s,\nцвет %s.\n", in,model, ram, hdd, os, color);
        return res;
    }

    @Override
    public int hashCode() {
        return in + hdd + ram + 6 * model.hashCode() + 15 * os.hashCode() + 21 * color.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Laptop)) return false;
        Laptop laptop = (Laptop) obj;
        return in == laptop.in && ram == laptop.ram && hdd == laptop.hdd && os.equals(laptop.os) && color.equals(laptop.color);
    }
}