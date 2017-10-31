import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Alex {

    static void findProblem(String data){
        StringBuilder sb = new StringBuilder(data);
        String[] names = new String[]{"Danil", "Olya", "Slava", "Ann", "Nikita"};

        int names_counter = 0;
        int last_index=0;
        int i=0;
        while(i<5){
            while(last_index!=-1){
                last_index = data.indexOf(names[i], last_index);
                if(last_index!=-1){
                    names_counter++;
                    last_index += names[i].length();
                }
            }
            i++;
            last_index++;
        }
        if(names_counter==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String args[]) throws IOException{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        findProblem(data);



    }
}