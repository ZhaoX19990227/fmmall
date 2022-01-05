package com.qfedu.fmmall;

import com.qfedu.fmmall.dao.CategoryMapper;
import com.qfedu.fmmall.dao.ProductMapper;
import com.qfedu.fmmall.entity.CategoryVO;
import com.qfedu.fmmall.entity.ProductVO;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class ApiApplicationTest {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void contextLoads(){
        List<CategoryVO> categoryVOS = categoryMapper.selectAllCategories();
        for (CategoryVO c1:categoryVOS){
            System.out.println(c1);
            for (CategoryVO c2:categoryVOS){
                System.out.println("\t"+c2);
                for (CategoryVO c3:categoryVOS){
                    System.out.println("\t\t"+c3);
                }
            }
        }

    }

    @Test
    public void testRecommand(){
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        for (ProductVO p:productVOS){
            System.out.println(p);
        }
    }

    @Test
    public void testSelectFirstLevelCateory(){
        List<CategoryVO> categoryVOS = categoryMapper.selectFirstLevelCategories();
        for (CategoryVO c:categoryVOS){
            System.out.println(c);
        }
    }
}
