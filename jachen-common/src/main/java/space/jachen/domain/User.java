package space.jachen.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author JaChen
 * @date 2023/1/31 15:45
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private String wechat;
}