package com.snow.oauserconsume.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author snowfly
 * @since 2021-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TestTable对象", description="")
public class TestTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String first;

    private String last;

    private LocalDate dateofbirth;

    private String placeofbirth;


}
