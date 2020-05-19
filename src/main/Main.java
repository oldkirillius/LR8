package main;
import  news.*;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ns = 4;
        News[] news = new News[ns];

        news[0]=new News("Как мы переучивали поддержку разговаривать по-человечески, и что получилось");
        news[1]=new News("Вскрываем чип гальванической развязки с крохотным трансформатором внутри");
        news[2]=new News("Как построить диаграмму Венна с 50 кругами? Визуализация множеств и история моего Python-проекта с открытым кодом");
        news[3]=new News(".NET: Лечение зависимостей");
        int pt = 8;
        String[] path = new String[pt];
        path[0]="view/0";
        path[1]="edit/0";
        path[2]="view/1";
        path[3]="edit/1";
        path[4]="view/2";
        path[5]="edit/2";
        path[6]="view/3";
        path[7]="edit/3";

        ControllerNews controller = new ControllerNews(news);

        for (int i = 0; i < pt; i++){
            StringTokenizer string = new StringTokenizer(path[i], "/");

            String function = string.nextToken();
            int id = Integer.parseInt(string.nextToken());

            if (function == "view" || id == 0) {
                controller.view(id);
            }

            if (function == "edit" || id == 0){
                System.out.println("Яка нова назва для 0 новини: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 1) {
                controller.view(id);
            }

            if (function == "edit" || id == 1){
                System.out.println("Яка нова назва для 1 новини: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 2) {
                controller.view(id);
            }

            if (function == "edit" || id == 2){
                System.out.println("Яка нова назва для 2 новини: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            if (function == "view" || id == 3) {
                controller.view(id);
            }

            if (function == "edit" || id == 3){
                System.out.println("Яка нова назва для 3 новини: ");
                String newTitleNews = new Scanner(System.in).nextLine();
                controller.edit(id, newTitleNews);
            }

            else {
                System.out.println("Не найден путь");
            }





        }


    }
}
