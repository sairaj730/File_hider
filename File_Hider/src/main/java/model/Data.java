package model;

public class Data {
    private int id;
    String fileName;
    private String path;
    private String email;

    public int getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Data(int id, String name, String path, String email) {
        this.path = path;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
