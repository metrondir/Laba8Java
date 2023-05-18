import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try
        {
            Reader input = new FileReader("C:\\Users\\38096\\IdeaProjects\\Lab8\\src\\MainText.txt");
            Reader input_2 = new FileReader("C:\\Users\\38096\\IdeaProjects\\Lab8\\src\\CodedText.txt");
            Writer output = new FileWriter("C:\\Users\\38096\\IdeaProjects\\Lab8\\src\\CodedText.txt");
            Writer output_2 = new FileWriter("C:\\Users\\38096\\IdeaProjects\\Lab8\\src\\UncodedText.txt");
            String myKey = "Medvediev Roman Anatoliovych";
            int index = 0;
            int x;
            while ((input.ready()))
            {
                x = myKey.charAt(index);
                index++;
                if(index == myKey.length())
                    index = 0;
                output.write(input.read()^x);
            }
            input.close();
            output.flush();
            output.close();
            index = 0;
            while ((input_2.ready()))
            {
                x = myKey.charAt(index);
                index++;
                if(index == myKey.length())
                    index = 0;
                output_2.write(input_2.read()^x);
            }
            input_2.close();
            output_2.flush();
            output_2.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}