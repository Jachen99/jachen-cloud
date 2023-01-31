package space.jachen.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author JaChen
 * @date 2023/1/31 15:46
 */
@Data
public class VideoOrder {
    private Integer id;
    private String outTradeNo;
    private Integer state;
    private Date createTime;
    private  Integer totalFee;
    private Integer videoId;
    private String videoTitle;
    private String videoImg;
    private Integer userId;
}