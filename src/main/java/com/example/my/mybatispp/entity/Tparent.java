package com.example.my.mybatispp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Admin
 * @since 2019-12-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Tparent extends Model<Tparent> {

    private static final long serialVersionUID=1L;

    /**
     * 自Id
     */
    @TableId(value = "Did", type = IdType.AUTO)
    private Long Did;

    /**
     * 一级分类Id
     */
    @TableField("parentId")
    private Long parentId;

    /**
     * 二级分类Id
     */
    private Long idc;

    /**
     * 一级Id名称
     */
    private String name;

    private Integer v;


    @Override
    protected Serializable pkVal() {
        return this.Did;
    }

}
