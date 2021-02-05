package cn.huiounet.miniapppojo.pojo;

import lombok.Data;

import javax.persistence.Table;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 09:47
 */
@Data
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
}
