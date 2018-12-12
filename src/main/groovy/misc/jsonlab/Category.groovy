package misc.jsonlab

/**
 * Created by mdb on 10/21/18.
 */
class Category {
    String name
    ArrayList<String> urls
    public Category(String name,urls){
        urls = new ArrayList<String>()
        this.name = name
        this.urls = urls
    }
    @Override
    public String toString(){
        return "Name : " + name +  " " + "urls: " + urls.toString()
    }
}
