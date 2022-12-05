package dto;


import javax.persistence.*;

@Entity
@Table
public class Cat {

    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Name")
    private String name;

    public Cat(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
