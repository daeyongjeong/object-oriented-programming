public class Test {

    /* select: takes a number and returns an appropriate Exercise object. */
    static Exercise select(int i) {
        String str = "";
        switch (i) {
            case 0:
                str = "exercise";
                break;
            case 1:
                str = "baseball";
                break;
            case 2:
                str = "soccer";
                break;
            case 3:
                str = "bastketball";
                break;
            default:
                break;
        }
        Exercise ex = new Exercise(str);
        return ex;
    }

    static void exe(Exercise ex) {
        ex.play();
    }

    public static void main(String[] args) {
        Exercise[] ex_list = new Exercise[4];

        for (int i = 0; i < 4; i++) {
            ex_list[i] = select(i);
            exe(ex_list[i]);
        }
    }
}