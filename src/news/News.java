package news;

import java.util.Date;
import java.util.GregorianCalendar;

public class News {
    private String title;
    private Date dateCreation;
    private Date dateChange;

    public String getNews(){
        return title;
    }
    public Date getDateCreation(){
        return dateCreation;
    }
    public Date getDateChange(){
        return dateChange;
    }
    public String changeNews(String title){
        dateChange= GregorianCalendar.getInstance().getTime();
        this.title = title;
        return "Назва: "+title+" Дата створення: "+dateCreation+"  Дата зміни: "+dateChange;
    }
    public News(String title){
        this.title=title;
        dateCreation = GregorianCalendar.getInstance().getTime();
        dateChange= GregorianCalendar.getInstance().getTime();
    }
    public String viewNews(){
        return "Назва: "+title+" Дата створення: "+ dateCreation + " Дата зміни: "+dateChange;
    }
}
