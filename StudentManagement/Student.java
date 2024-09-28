public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * ham lay ten student
     *
     * @return ten student
     */
    public String getName() {
        return name;
    }

    /**
     * ham lay ten student
     *
     * @return ten student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ham lay id student
     *
     * @return id student
     */
    public String getId() {
        return id;
    }

    /**
     * ham set id student
     *
     * @return id student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ham lay group student
     *
     * @return group student
     */
    public String getGroup() {
        return group;
    }

    /**
     * ham set group student
     *
     * @return group student
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * ham lay email student
     *
     * @return email student
     */
    public String getEmail() {
        return email;
    }

    /**
     * ham set email student
     *
     * @return email student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ham info ten student
     *
     * @return chuoi ttin cua student
     */
    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }

    /**
     * Phuong thuc khoi tao mac dinh student
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Ham nhan thong tin student
     *
     * @param name  la ten
     * @param id    la id student
     * @param email la dia chia email cua student
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * ham gan thong tin cho student
     *
     * @param s la student can gan
     */
    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}
