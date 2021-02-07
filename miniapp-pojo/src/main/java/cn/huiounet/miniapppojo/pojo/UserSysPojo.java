package cn.huiounet.miniapppojo.pojo;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 09:47
 */

@Table(name = "huiou_user_sys")
public class UserSysPojo {
    private Integer id;
    private String open_id;
    private String nick_name;
    private String user_head_img;
    private String phone_number;
    private String sex;
    private String from_user;
    private String create_time;
    private String status;

    @Override
    public String toString() {
        return "UserSysPojo{" +
                "id=" + id +
                ", open_id='" + open_id + '\'' +
                ", nick_name='" + nick_name + '\'' +
                ", user_head_img='" + user_head_img + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", sex='" + sex + '\'' +
                ", from_user='" + from_user + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getUser_head_img() {
        return user_head_img;
    }

    public void setUser_head_img(String user_head_img) {
        this.user_head_img = user_head_img;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFrom_user() {
        return from_user;
    }

    public void setFrom_user(String from_user) {
        this.from_user = from_user;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserSysPojo() {
    }
}
