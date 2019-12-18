package com.example.my.mybatispp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.my.mybatispp.entity.Uuser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Admin
 * @since 2019-12-11
 */
public interface UuserMapper extends BaseMapper<Uuser> {


//    @Select("SELECT * FROM USER WHERE CODE = #{userCode}")
//    List<User> selectByUsername(@Param("userCode")String userCode);

        @Select("SELECT * FROM UUSER WHERE username = #{userCode}")
    Uuser selectByUsernamezj(@Param("userCode")String userCode);
//    Uuser selectByUsername(@Param("username")String username);
}
