import java.io.*;

public class LearnFileHandling {
    public static void main(String[] args) {
        createAFile();
        writeAFile();
        appendingAFile();
        readAFile();
    }

    public static void createAFile(){
        try{
            File fileObject = new File("Filehandling/src", "new-file.txt");
            System.out.println(fileObject.createNewFile());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void writeAFile(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("Filehandling/src/new-file.txt")))) {
            bufferedWriter.write("विद्या नाम नरस्य रूपमधिकं प्रच्छन्नगुप्तं धनम्\n" +
                    "\n" +
                    "विद्या भोगकारी यशः सुखकरी विद्या गुरुणां गुरुः।\n" +
                    "\n" +
                    "विद्या बन्धुजनो विदेशगमने विद्या परा देवता\n" +
                    "\n" +
                    "विद्या राजसु पूज्यते न हि धनं विद्या-विहीनः पशुः।।4।।");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void appendingAFile(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(new File("Filehandling/src/new-file.txt"), true))) {
            bufferedWriter.write("\n");
            bufferedWriter.write("meaning: \n");
            bufferedWriter.write("Knowledge is the beauty of man, that is a beauty. It is secretly Hidden wealth.\nVidya Gives us many pleasures. Vidya is the Guru of the gurus. If we ever go foreign, then The work come only.\nVidya Is the biggest Goddess. Vidya is Worshiped in kings, not wealth.\nTherefore, the person who is without education is a animal.");
        }
        catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void readAFile(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("Filehandling/src/new-file.txt")))) {
            while (bufferedReader.ready()){
                System.out.print((char) bufferedReader.read());
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
