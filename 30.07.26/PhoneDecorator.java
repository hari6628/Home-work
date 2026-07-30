/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonecustomize;

public abstract class PhoneDecorator implements Phone {

    protected Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getDescription() {
        return phone.getDescription();
    }

    @Override
    public int getPrice() {
        return phone.getPrice();
    }
}