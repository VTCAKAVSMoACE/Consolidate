import java.nio.file.*;

public class Consolidate {
    public static void main(String[] args) throws Exception {
        args = new String(Files.readAllBytes(Paths.get("../../Source Array"))).split(" ");
        int[] toConsolidate = new int[args.length];
        for (int i=0; i<args.length; i++){
            toConsolidate[i]=Integer.parseInt(args[i]);
        }
        for (int i=0; i<toConsolidate.length; i++) {
            for (int k=0; k<toConsolidate.length-1; k++) {
                if (toConsolidate[k] == 0){
                    toConsolidate[k] = toConsolidate[k+1];
                    toConsolidate[k+1] = 0;
                }
            }
        }
        for (int i:toConsolidate)
            System.out.print(i+" ");
    }
}