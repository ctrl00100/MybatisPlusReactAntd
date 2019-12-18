package com.example.my.mybatispp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author Admin
 * @since 2019-12-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("uuser")
public class Uuser extends Model<Uuser> {

    private static final long serialVersionUID=1L;

    private Long id;

    private String username;

    private String password;

    private Integer phone;

    private String email;

    private String roleId;

    private LocalDate createTime;

    private Integer v;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
