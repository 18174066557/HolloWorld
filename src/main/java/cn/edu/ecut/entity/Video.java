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
    public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

      @TableId("videoId")
      private String videoid;

    @TableField("groupId")
    private String groupid;

    @TableField("imageUrl")
    private String imageurl;

    @TableField("videoUrl")
    private String videourl;

    @TableField("creatorName")
    private String creatorname;

    @TableField("creatorImageUrl")
    private String creatorimageurl;

    @TableField("likeCount")
    private String likecount;

    @TableField("commentCount")
    private String commentcount;


}
