package recap;

public class CompactDiscDemo {
    public static void main(String[] args) {
        CompactDisc cdRw = new CompactDisc();
        System.out.println(cdRw.toString());

        CompactDisc cdR = new CompactDisc(2345, 150, false, 2300, "DVD");
        System.out.println(cdR.toString());

        int memoryToWriteMoive = cdRw.memoryAfterWrite(150);

        if (memoryToWriteMoive > 0) {
            System.out.println("We can write the data. Free memory left: " + memoryToWriteMoive);
        } else {
            System.out.println("Not enough memory: " + memoryToWriteMoive);
        }

        // String mem = result from operation
        String mem = memoryToWriteMoive > 0 ? "We can write data" : "We don't have enough memory";
        System.out.println(mem);

        int memResult = memoryToWriteMoive > 0 ? 1 : -1;
        System.out.println(memResult);

    }
}
