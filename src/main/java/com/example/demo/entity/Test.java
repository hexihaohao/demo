package com.example.demo.entity;

import javax.persistence.*;

/**
 * @Author dengqh
 * @Since 2019/9/16
 */
@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    @Column(columnDefinition = "varchar(100)")
    private String t_name;
    private String t_data;
    @Column(columnDefinition = "datetime")
    private String create_time;
    @Column(columnDefinition = "datetime")
    private String update_time;

    @Override
    public String toString() {
        return "Test{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_data='" + t_data + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_data() {
        return t_data;
    }

    public void setT_data(String t_data) {
        this.t_data = t_data;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
}
