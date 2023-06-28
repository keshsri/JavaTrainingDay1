public class do_while_loop {
    public static void main(String[] args){
        System.out.println("Print numbers from 0 to 20 but 0 is not part of the loop");
        int i = 0;
        do{
            System.out.printf(i + " ");
            i++;
        } while(i<=20);
    }
}
