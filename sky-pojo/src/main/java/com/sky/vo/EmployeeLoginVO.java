package com.sky.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


//Lombok：自动生成getter/setter方法,toString方法
@Data
//Lombok：可以使用构造器模式创建对象
@Builder
//Lombok：生成一个无参构造器
@NoArgsConstructor
//Lombok：生成一个全参构造器
@AllArgsConstructor
//Swagger：用于生成接口文档
@ApiModel(description = "员工登录返回的数据格式")
public class EmployeeLoginVO implements Serializable {

    //Swagger：用于生成接口文档
    @ApiModelProperty("主键值")
    private Long id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("jwt令牌")
    private String token;

}
