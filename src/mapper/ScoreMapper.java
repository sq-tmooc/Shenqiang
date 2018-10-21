package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Score;
import po.ScoreExample;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);
}