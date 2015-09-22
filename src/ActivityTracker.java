import java.util.Scanner;
import java.util.TreeMap;

public class ActivityTracker {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        TreeMap<Integer, TreeMap<String,Integer>> users = new TreeMap<>();

        Integer dataLinesCounter = reader.nextInt();

        reader.nextLine();

        for(Integer i = 0; i < dataLinesCounter;i++){
            String[] currentInput = reader.nextLine().split(" ");

            String[] date = currentInput[0].split("/");

            Integer month = Integer.parseInt(date[1]);
            String name = currentInput[1];
            Integer activity = Integer.parseInt(currentInput[2]);

            if(!users.containsKey(month)){
                users.put(month,new TreeMap<>());
                users.get(month).put(name,activity);
            }else {
                if(users.get(month).containsKey(name)){
                    Integer activityStacker = users.get(month).get(name);
                    activityStacker += activity;
                    users.get(month).put(name,activityStacker);
                }
                else{
                    users.get(month).put(name,activity);
                }
            }
        }

        for(Integer month : users.keySet()){
            System.out.print(month + ": ");

            String fixedOutput = "";

            for(String user : users.get(month).keySet()){
                fixedOutput += String.format("%s(%d), ",user,users.get(month).get(user));
            }

            System.out.println(fixedOutput.substring(0,fixedOutput.length() - 2));
        }

    }
}
