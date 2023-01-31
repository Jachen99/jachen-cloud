package space.jachen.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import space.jachen.domain.Video;

import java.util.List;

/**
 * @author JaChen
 * @date 2023/1/31 16:23
 */
@Mapper
public interface VideoDAO {

    @Select("select * from `video`")
    List<Video> getList();

}
