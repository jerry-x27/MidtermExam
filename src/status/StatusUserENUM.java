/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package status;

/**
 * @author vedivyan
 */
public enum StatusUserENUM {
    REJECTED, 
    PENDING, 
    PROCESSING, 
    APPROVED;

    public static StatusUserENUM getStatusByCode(int code) {
        switch (code) {
            case 0: return REJECTED;
            case 1: return PENDING;
            case 2: return PROCESSING;
            case 3: return APPROVED;
            default: throw new IllegalArgumentException("Invalid code: " + code);
        }
    }
}
