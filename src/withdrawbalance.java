
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class withdrawbalance {

    double save;
    double result;
    double Previous_balance;

    withdrawbalance(double w) {
        save = w;
    }

    double withdrawreturn() {
        try {
            File file4 = new File("userdata.txt");
            Scanner in = new Scanner(file4);
            String num = "";
            while (in.hasNext()) {
                num += in.nextLine() + "\n";
            }
            Previous_balance = Double.parseDouble(num);
            try{
            if(Previous_balance>save)
            {
               result = Previous_balance - save;
            }
            }catch(Exception e1)
            
            {
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                
            }
            System.out.println(result);
            try {
                File s1 = new File("userdata.txt");
                FileWriter fwith = new FileWriter(s1);

                fwith.write(String.valueOf(result));
                fwith.write("\r\n");
                fwith.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }
       

    try {
            File f1 = new File("viewuserinformation.txt");
            FileWriter fwith = new FileWriter(f1,true);
             
            
            fwith.write(String.valueOf(result));
            
            fwith.write("\r\n");
            fwith.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Doesnot save data");
        }


        return result;
    }
}
