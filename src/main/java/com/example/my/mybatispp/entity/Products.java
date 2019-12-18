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
 * @since 2019-12-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Products extends Model<Products> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String imgs;

    private Integer status;

    private String name;

    private String ddesc;

    private Long price;

    @TableField("pCategoryId")
    private String pCategoryId;

    @TableField("categoryId")
    private String categoryId;

    private String detail;

    private Integer v;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
