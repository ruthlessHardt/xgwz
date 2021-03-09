package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * xg_n_user
 * @author 
 */
@Data
public class XgNUser implements Serializable {
    /**
     * 户编号
     */
    private Integer nId;

    /**
     * 用户名
     */
    private String nUname;

    /**
     * 用户密码
     */
    private String nPassword;

    /**
     * 用户电话
     */
    private String nPhone;

    /**
     * 用户性别
     */
    private String nSex;

    /**
     * 用户所属部门、机构
     */
    private String nDept;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态1/0，默认1
     */
    private String state;

    /**
     * 谁创建的
     */
    private String createBy;

    /**
     * 用户头像
     */
    private String avatar;

    private static final long serialVersionUID = 1L;
}