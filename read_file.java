
import java.io.*;
import java.util.*;


class read_file {
    public static void main(String[] args) {

        try {
            File file = new File("poem.txt");
            Scanner s = new Scanner(file);
            Dictionary<String, Integer> dict = new Hashtable<>();
            dict = read(dict,s);

            Enumeration<String> keys = dict.keys();
            int max_val = max_value(keys, dict);

            keys = dict.keys();
            print_max_key(keys, dict, max_val);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(read_file.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }
    
    public static Dictionary<String, Integer> read (Dictionary<String, Integer> dict, Scanner s){
        while (s.hasNextLine()){
                String[] temp = s.nextLine().split(" ");
                for (int i= 0; i < temp.length; i++){
                    temp[i] = temp[i].toLowerCase();
                    temp[i] = temp[i].replaceAll("\\p{Punct}", "");
                    if (dict.get(temp[i]) == null){
                        dict.put(temp[i], 1);
                    }
                    dict.put(temp[i], (dict.get(temp[i]) + 1));
                }
            }
        return dict;
    }
    
    public static int max_value(Enumeration<String> keys,Dictionary<String, Integer> dict ){
        int max_val = 0;
            while(keys.hasMoreElements()){
                String key = keys.nextElement();
                if (max_val < dict.get(key)){
                    max_val = dict.get(key);
                }
            }        
    return max_val;    
    }
    
    public static void print_max_key (Enumeration<String> keys,Dictionary<String, Integer> dict, int max_val){
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            if (dict.get(key) == max_val){
                System.out.println("key: " + key + "\t" + max_val);
            }
        }               
    }

}
