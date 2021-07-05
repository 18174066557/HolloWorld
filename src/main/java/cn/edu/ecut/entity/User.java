package cn.edu.ecut.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ecut
 * @since 2021-07-03
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      private String phone;

    private String password;

    @TableField("nickName")
    private String nickname;

    @TableField("imageUrl")
    private String imageurl;


}
