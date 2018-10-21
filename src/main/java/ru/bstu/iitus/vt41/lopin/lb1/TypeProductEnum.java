package ru.bstu.iitus.vt41.lopin.lb1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeProductEnum {
    CAMERA(1),
    KEFIR(2),
    LAPTOP(3),
    LEGO(4),
    MILK(5);

    private int value;
    
    public static TypeProductEnum from(int source){
        for(TypeProductEnum productEnum:TypeProductEnum.values()){
            if(source == productEnum.getValue()){
                return productEnum;
            }
        }
        throw new RuntimeException("Enum 'Product' not found with value "+ source);
    }

}
