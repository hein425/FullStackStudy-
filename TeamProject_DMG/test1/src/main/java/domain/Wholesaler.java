package domain;

public class Wholesaler {
    @Override
    public String toString() {
        return "Wholesaler{" +
                "w_id=" + w_id +
                ", w_department='" + w_department + '\'' +
                ", w_name='" + w_name + '\'' +
                ", w_phone='" + w_phone + '\'' +
                ", w_jobTitle='" + w_jobTitle + '\'' +
                '}';
    }

    private int w_id;
    private String w_department;
    private String w_name;
    private String w_phone;
    private String w_jobTitle;


    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public String getW_department() {
        return w_department;
    }

    public void setW_department(String w_department) {
        this.w_department = w_department;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public String getW_phone() {
        return w_phone;
    }

    public void setW_phone(String w_phone) {
        this.w_phone = w_phone;
    }

    public String getW_jobTitle() {
        return w_jobTitle;
    }

    public void setW_jobTitle(String w_jobTitle) {
        this.w_jobTitle = w_jobTitle;
    }
}
