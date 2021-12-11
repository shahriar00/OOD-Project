
import java.io.File;
import java.util.Scanner;

public class checkbalance {

    double result;

    double balancecheck() {
        
        try {
            File file2 = new File("userdata.txt");
            Scanner input = new Scanner(file2);
            String num = "";
            while (input.hasNext()) {
                num += input.nextLine() + "\n";
                System.out.println(num);
            }
            //jTextArea1.setText(num);
            result = Double.parseDouble(num);
            

        } catch (Exception e) {
            System.out.println(e);

        }
        return result;
    }
}
