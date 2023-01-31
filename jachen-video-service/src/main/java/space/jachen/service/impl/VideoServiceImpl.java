package space.jachen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import space.jachen.dao.VideoDAO;
import space.jachen.domain.Video;
import space.jachen.service.VideoService;

import java.util.List;

/**
 * @author JaChen
 * @date 2023/1/31 16:24
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoDAO videoDAO;

    @Override
    public List<Video> getList() {
        return videoDAO.getList();
    }
}
