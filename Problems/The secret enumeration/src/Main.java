public class Main {

    public static void main(String[] args) {
        Secret[] secret = Secret.values();
        int count = 0;
        for (Secret value : secret) {
            if (value.toString().contains("STAR")) {
                count++;
            }
        }
        System.out.println(count);

    }
}

 /*At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}*/
