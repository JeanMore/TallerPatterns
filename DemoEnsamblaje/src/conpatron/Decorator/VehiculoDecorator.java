/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conpatron.Decorator;

/**
 *
 * @author adria
 */
public abstract class VehiculoDecorator implements IVehiculo {
    protected IVehiculo vehi;
    
    
    public VehiculoDecorator(IVehiculo v){
        this.vehi=v;
    }

    @Override
    public String getPrestaciones() {
        return vehi.getPrestaciones();
    }
    
}
