package news;

public class ControllerNews {
    public ControllerNews(News [] arrayNews){
        this.arrayNews=arrayNews;
    }
    private News [] arrayNews;
    public void view(int id) {
        System.out.println("Новина "+ arrayNews[id].viewNews() );
    }
    public void edit(int id, String title) {
        System.out.println("Новина "+arrayNews[id].changeNews(title));
    }

}
