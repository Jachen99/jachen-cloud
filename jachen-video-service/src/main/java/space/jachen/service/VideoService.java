package space.jachen.service;

import org.springframework.stereotype.Service;
import space.jachen.domain.Video;

import java.util.List;

/**
 * @author JaChen
 * @date 2023/1/31 16:23
 */
@Service
public interface VideoService {


    List<Video> getList();


    Video getById(Integer id);
}
