package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeProductEnum {
    CAMERA(1, "Камера"),
    KEFIR(2, "Кефир"),
    LAPTOP(3, "Ноутбук"),
    LEGO(4, "Лего"),
    MILK(5, "Молоко");

    private int id;
    private String name;
    
    public static TypeProductEnum from(int source){
        for(TypeProductEnum productEnum:TypeProductEnum.values()){
            if(source == productEnum.getId()){
                return productEnum;
            }
        }
        throw new RuntimeException("Enum 'Product' not found with id "+ source);
    }

    public static String showAllTypeProduct() {
        StringBuilder result = new StringBuilder();
        for (TypeProductEnum productEnum : TypeProductEnum.values()) {
            result.append(productEnum.getId()).append(" - ").append(productEnum.getName());
        }
        return result.toString();
    }

}
