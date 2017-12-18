import cs1.Keyboard;
public class Swapper2 {

    public static String[][] swap(String[][] ary, int column, int row, int column2, int row2) {
        String temp = ary[column][row];
        ary[column][row] = ary[column2][row2];
        ary[column2][row2] = temp;
        return ary;
    }

    public static void print(String[][] ary) {
        for (String[] row : ary) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int column, column2, row, row2;
        String[][] ary = {{"foo", "oof", "goo"},
                          {"boo", "oob", "oog"}};
        System.out.println("Here is a grid of strings.");
        print(ary);
        System.out.println("To exit, press Control-C");

        for (;;) {
            System.out.print("Give me the row of the first string you want to swap: ");
            row = Keyboard.readInt();
            System.out.print("Give me the column: ");
            column = Keyboard.readInt();
            System.out.print("Give me the row of the second string you would like to swap: ");
            row2 = Keyboard.readInt();
            System.out.print("Give me the column: ");
            column2 = Keyboard.readInt();
            ary = swap(ary, column, row, column2, row2);
            System.out.println("Here is your new array:");
            print(ary);
        }
    }
}