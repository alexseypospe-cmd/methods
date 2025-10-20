public class Main {
    public static void printSeparator(){
        System.out.println("++++++++++++++");
    }
    public static void printIssues (int issueCount){
        System.out.println(issueCount);
    }
    public static int sum (int[] nambers) {
        int sum = 0;
        for (int namber : nambers) {
            sum = sum + namber;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6};
        printSeparator();

// Печатаем разделитель в консоль
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1 )% 3 == 0) {
                printSeparator();
                // Печатаем разделитель в консоль
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
// Печатаем разделитель в консоль

    }


}