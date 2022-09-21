public class Main {


    public static int countWord(String s, String check){
        s = s.trim();
        int count = 0;
        String[] newS = s.split("\\s+");
        for(String c : newS){
            if(c.contains(check)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "In the beginning God created the heavens and the earth.";
        System.out.println("occurrence of 'the': " + countWord(s, "the"));
        System.out.println("occurrence of 'begin': " + countWord(s, "begin"));
        System.out.println("occurrence of 'recreate': " + countWord(s, "recreate"));

    }

}
