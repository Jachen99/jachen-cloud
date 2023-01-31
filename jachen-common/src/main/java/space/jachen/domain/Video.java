package space.jachen.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author JaChen
 * @date 2023/1/31 15:45
 */
@Data
public class Video {
    private Integer id;
    private String title;
    private String summary;
    private String coverImg;
    private Integer  price;
    private Date createTime;
    private Double point;
}
