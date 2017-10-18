package yazdaniscodelab.firebaserecyleupdatedelete;

/**
 * Created by Yazdani on 10/17/2017.
 */

public class Data {


    String id;
    String title;
    String description;

    public String getImagecircle() {
        return imagecircle;
    }

    public void setImagecircle(String imagecircle) {
        this.imagecircle = imagecircle;
    }

    String imagecircle;

    public Data(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;

    }

    public Data(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
