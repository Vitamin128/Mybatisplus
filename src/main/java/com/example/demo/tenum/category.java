package com.example.demo.tenum;

public enum category {
    CREATED(0,"待支付"),
    PAID(1,"已支付"),
    SHIPPED(2,"已发货"),
    COMPLETED(3,"已完成"),
    CANCELLED(4,"已取消");

    private final Integer code;
    private final String message;
    category(Integer code,String message)
    {
        this.code=code;
        this.message=message;
    }

    public static category forCode(Integer code)
    {
        for(category item:values())
        {
            if(item.code.equals(code))
            {
                return item;
            }
        }
        throw new IllegalArgumentException("位置订单号");
    }

    public Integer GetCode()
    {
        return code;
    }

    public String GetMessage()
    {
        return message;
    }
}
