package com.orderservice.helper;

import com.orderservice.model.entity.Carts;
import com.orderservice.model.request.CartRequest;
import org.springframework.beans.BeanUtils;

public interface CartMappingHelper {

    public static CartRequest map(Carts carts)
    {
        if(carts ==null)
            return null;

        CartRequest cartRequest =new CartRequest();
        BeanUtils.copyProperties(carts,cartRequest);
        return cartRequest;
    }

    public static Carts map(CartRequest cartRequest)
    {
        if(cartRequest ==null)
            return null;

        Carts carts =new Carts();
        BeanUtils.copyProperties(cartRequest,carts);
        return carts;
    }



}
