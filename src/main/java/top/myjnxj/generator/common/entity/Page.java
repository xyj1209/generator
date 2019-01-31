package top.myjnxj.generator.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    /**
    * 页数
    */
    private int pageNum;
    /**
    * 页容量
    */
    private int pageSize=10;

}
