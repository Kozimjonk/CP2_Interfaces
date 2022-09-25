import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {

    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File chosenFile;
        String rec = "";
        ArrayList<String> lineList = new ArrayList<String>();
        ShortWordFilter ShortWordFilter = new ShortWordFilter();
        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                chosenFile = chooser.getSelectedFile();
                Path file = chosenFile.toPath();
                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));
                while(reader.ready())
                {
                    rec = reader.readLine();
                    lineList.add(rec);
                }
                System.out.println(Main.collectAll(ShortWordFilter, lineList.toArray()));
                reader.close(); // must close the file to seal it and flush buffer
                System.out.println("\n\nData file filtered!");
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}