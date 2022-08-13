public class Task3
{
    public static void main(String[] args)
   // Задание №2:
    {   System.out.println("Ответ на задание №3: ");
        int year = 2022;
        int startYear = year - 200;
        int finishYear = year + 100;
        int i;
        for (i = startYear; i <= finishYear; i++ ) {
            if (i %79 == 0) {
                System.out.println(i);
            }
        }
    }
}