/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Local;

/**
 *
 * @author Ladzani_fabian
 */
@Local
public interface UnitConvertSBLocal {
    public Float toInches(Float meters);
    public Float toMillis(Float meters);
    public Float toCentis(Float meters);
}
