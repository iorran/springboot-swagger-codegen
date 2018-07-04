package br.com.iorran.main;

import br.com.iorran.handler.ItemResourceApi;

public class ItemResourceApiExample {

    public static void main(String[] args) {
        
        ItemResourceApi apiInstance = new ItemResourceApi();
        Long id = 1L; // Long | id
        try {
            br.com.iorran.model.Item result = apiInstance.findOneItem(id);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Exception when calling ItemResourceApi#findOneItem");
            e.printStackTrace();
        }
    }
}