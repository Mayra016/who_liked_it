public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(whoLikesIt());
    }

    static String whoLikesIt(String... names) {
        int num = 0;
        int i = 0;
        String text = "no one likes this";

        try {
            for (String name : names) {
                if (names[0] == "") {
                    text = "no one likes this";
                    i = num + 2;
                } else {
                    num = num + 1;
                }
            }
            while (i <= num) {
                i = i + 1;
                if (num == 1) {
                    text = names[0] + " likes this";
                } else if (num == 2) {
                    text = names[0] + " and " + names[1] + " like this";
                } else if (num == 3) {
                    text = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                } else if (num >= 4) {
                    int others = num - 2;
                    text = names[0] + ", " + names[1] + " and " + others + " others like this";
                }
            }
            return text;
        } catch (ArrayIndexOutOfBoundsException e) {
            return text;
        }
    }
}
