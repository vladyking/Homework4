public class Task2
{
    public static void main(String[] args)
   // Задание №2:
    {   System.out.println("Ответ на задание №2: ");
        int firstfriday = 6;
        int lastFriday;
        for (lastFriday = firstfriday; lastFriday <= 31; lastFriday+=7 ) {
            System.out.println("Сегодня пятница, " + lastFriday + "-е число. Необходимо подготовить отчет.");
        }
    }
}