package space.jachen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import space.jachen.domain.Video;
import space.jachen.domain.VideoOrder;
import space.jachen.utils.ResponseUtil;

import java.util.Date;

/**
 * @author JaChen
 * @date 2023/1/31 17:26
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/save/{id}")
    public Object save(@PathVariable Integer id){
        Video v = restTemplate.getForObject("http://127.0.0.1:9000/api/v1/video/getById/"
        + id, Video.class);

        if (v != null) {
            VideoOrder.builder()
                    .videoId(v.getId())
                    .videoTitle(v.getTitle())
                    .createTime(new Date());
        }else {
            return ResponseUtil.resultMap(false,444,"下单失败");
        }
        return ResponseUtil.resultMap(true,200,"下单成功"
                ,VideoOrder.VideoOrderBuilder.class);
    }



}
