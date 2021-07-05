package cn.edu.ecut.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Playlist implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

      @TableId("listId")
      private String listid;

    @TableField("imageUrl")
    private String imageurl;


}
