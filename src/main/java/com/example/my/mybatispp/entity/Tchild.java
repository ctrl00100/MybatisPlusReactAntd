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
public class Tchild extends Model<Tchild> {

    private static final long serialVersionUID=1L;

    /**
     * 自Id
     */
    @TableId(value = "Idme", type = IdType.AUTO)
    private Long Idme;

    /**
     * 父Id
     */
    @TableField("parentId")
    private Long parentId;

    /**
     * 子分类名
     */
    private String name;

    private Integer v;


    @Override
    protected Serializable pkVal() {
        return this.Idme;
    }

}
