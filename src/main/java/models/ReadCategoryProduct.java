package models;

import java.util.TreeMap;
import models.Product;

public class ReadCategoryProduct {
    
     //準備好產品清單  
    public static TreeMap<String, Product> readProduct() {
        //read_product_from_file(); //從檔案或資料庫讀入產品菜單資訊
        //放所有產品  產品編號  產品物件
        TreeMap<String, Product> product_dict = new TreeMap<>();
        String[][] product_array = {
            {"p-j-101", "果汁", "奇異果汁", "70", "kiwi.png", "紐西蘭特選，酸甜的口味，令人忍不住再喝一口"},
            {"p-j-102", "果汁", "椰子汁", "80", "coconut.png", "產品描述"},
            {"p-j-103", "果汁", "水蜜桃汁", "90", "peach.png", "產品描述"},
            {"p-j-104", "果汁", "葡萄汁", "100", "grapes.png", "產品描述"},
            {"p-j-105", "果汁", "草莓汁", "100", "strawberry.png", "產品描述"},
            {"p-j-106", "果汁", "芒果汁", "100", "mango.png", "產品描述"},
            {"p-j-107", "果汁", "櫻桃汁", "120", "cherry.png", "產品描述"},
            {"p-j-108", "果汁", "香蕉汁", "75", "banana.png", "產品描述"},
            {"p-j-109", "果汁", "橘子汁", "65", "orange.png", "產品描述"},
            {"p-j-110", "果汁", "西瓜汁", "60", "watermelon.png", "產品描述"},
            {"p-t-112", "茶飲", "紅茶", "45", "blacktea.jpg", "產品描述"},
            {"p-t-113", "茶飲", "綠茶", "45", "greentea.jpg", "產品描述"},
            {"p-t-114", "咖啡", "咖啡加珍珠", "70", "perlmilktea.jpg", "產品描述"}
        };

        //一筆放入字典變數product_dict中
        for (String[] item : product_array) {
            Product product = new Product(
                    item[0], 
                    item[1], 
                    item[2], 
                    Integer.parseInt(item[3]), //價格轉為int
                    item[4], 
                    item[5]);
            //將這一筆放入字典變數product_dict中 
            product_dict.put(product.getProduct_id(), product);
        }
        return product_dict; 
    }
}
