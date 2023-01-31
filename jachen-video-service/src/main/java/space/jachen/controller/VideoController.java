package space.jachen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.jachen.domain.Video;
import space.jachen.service.VideoService;
import space.jachen.utils.ResponseUtil;

import java.util.List;
import java.util.Map;

/**
 * @author JaChen
 * @date 2023/1/31 16:21
 */
@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @GetMapping("list")
    public Map<String, Object> getList(){

        List<Video> serviceList = videoService.getList();

        return ResponseUtil.resultMap(true,200,"查询成功",serviceList);

    }
}
