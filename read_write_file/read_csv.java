
import java.util.*;
import java.io.*;


public class read_csv {
    public static void main(String[] args) {
        String path = "stocks.csv";
        String line = "";
        StringBuilder sb = new StringBuilder();
        sb.append("Company Name").append(",").append("PE Ratio").append(",").append("RB Ratio").append("\n");
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            br.readLine();
            while((line = br.readLine()) != null){
                String[]values = line.split(",");
                float price = Float.parseFloat(values[1]);
                float earn  = Float.parseFloat(values[2]);
                float book  = Float.parseFloat(values[3]);
                float pe_ratio = Math.round((price/earn)*100)/100;
                float pb_ratio = Math.round((price/book)*100)/100;
                String pe = String.valueOf(pe_ratio);
                String pb = String.valueOf(pb_ratio);
                sb.append(values[0]).append(",").append(pe).append(",").append(pb).append("\n");
            }
            br.close();
            
            BufferedWriter bw = new BufferedWriter (new FileWriter("out.csv"));
            bw.write(sb.toString());
            System.out.println("File is created");
            bw.close();
                 
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }   
    }
}
