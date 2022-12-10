package com.dream.iot.test.db.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.iot.test.db.product.entity.SpProduct;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lgl
 * @since 2022-06-27
 */
public interface SpProductMapper extends BaseMapper<SpProduct> {


    @Select("select * from user where product_id like '%‘ #{productId} ’%' ")
    List<SpProduct> findByLikeProductId(@Param("productId")String productId);

  ;
    @Update({ "update SpProduct set productId = #{productId}   where id = #{id}" })
    int updateSpProductById(SpProduct spProduct);

    }
