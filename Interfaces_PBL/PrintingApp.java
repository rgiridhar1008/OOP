package Interfaces_PBL;
interface Printable {
    void printContent();
}

class PDFDocument implements Printable {
    @Override
    public void printContent() {
        System.out.println("Printing PDF document: Sample PDF content...");
    }
}

class WordDocument implements Printable {
    @Override
    public void printContent() {
        System.out.println("Printing Word document: Sample Word content...");
    }
}

public class PrintingApp {
    public static void main(String[] args) {
        Printable[] docs = new Printable[2];
        docs[0] = new PDFDocument();
        docs[1] = new WordDocument();

        for (Printable d : docs) {
            d.printContent();
            System.out.println("----------------------");
        }
    }
}
