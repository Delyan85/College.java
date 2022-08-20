package recap;

public class CompactDisc {
    int capacity;
    double price;
    boolean isRw;
    int freeMemory;
    String title;


    public CompactDisc() {
        this.capacity = 700;
        this.freeMemory = 650;
    }

    public CompactDisc(boolean isRw) {
        this();
        this.isRw = isRw;
    }

    public CompactDisc(int capacity, double price, boolean isRw, int freeMemory, String title) {
        this.capacity = capacity;
        this.price = price;
        this.isRw = isRw;
        this.freeMemory = freeMemory;
        this.title = title;
    }

    void writeData (int memory) {
        if (memory > this.freeMemory) {
            System.out.println("There is not enough memory");
        } else {
            this.freeMemory = this.freeMemory - memory;
        }
    }
    // before writeData 600 Mb; System.out.println(cd.freeMemory); -> 600
    // cd.writeData(150); -> this.freeMemory = 450;
    // after writeData 450 Mb; System.out.println(cd.freeMemory); -> 450

    int memoryAfterWrite(int memory) {
        return this.freeMemory - memory;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "capacity=" + capacity +
                ", price=" + price +
                ", isRw=" + isRw +
                ", freeMemory=" + freeMemory +
                ", title='" + title + '\'' +
                '}';
    }
}
