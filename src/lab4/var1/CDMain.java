package lab4.var1;

public class CDMain {
    public static void main(String[] args) {
        CD mp3 = new CD("Disk");
        mp3.addFile("folder/other/doc.txt");
        mp3.addFile("folder/123/1.mp3");
        mp3.addFile("folder/123/2.mp3");
        mp3.addFile("folder/123/3.mp3");
        mp3.addFile("folder/123/4.mp3");
        mp3.addFile("folder/other/another/doc.txt");
        mp3.tree();
    }
}
