package com.jupiter.ts.mapper;

import com.jupiter.ts.model.Phase;
import com.jupiter.ts.model.PhaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

@Component
public interface PhaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    long countByExample(PhaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int deleteByExample(PhaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int insert(Phase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int insertSelective(Phase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    List<Phase> selectByExampleWithRowbounds(PhaseExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    List<Phase> selectByExample(PhaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    Phase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Phase record, @Param("example") PhaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Phase record, @Param("example") PhaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Phase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ts_xw
     *
     * @mbg.generated Sat Nov 09 22:46:37 GMT+08:00 2019
     */
    int updateByPrimaryKey(Phase record);
}