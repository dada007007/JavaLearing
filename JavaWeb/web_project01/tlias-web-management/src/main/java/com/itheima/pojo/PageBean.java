package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.scripting.xmltags.XMLScriptBuilder;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
    private Long total;
    private List<Emp> rows;
}
