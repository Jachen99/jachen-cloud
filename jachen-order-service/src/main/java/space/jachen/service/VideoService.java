package space.jachen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import space.jachen.domain.Video;

import java.util.List;

/**
 * @author JaChen
 * @date 2023/2/4 23:08
 */
@FeignClient(value = "jachen-video-service")
public interface VideoService {

    @GetMapping("/api/v1/video/getById/{id}")
    Video getById(@RequestParam("id") Integer id);
}
