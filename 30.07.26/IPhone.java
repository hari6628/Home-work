/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonecustomize;

public class IPhone implements Phone {

    @Override
    public String getDescription() {
        return "iPhone";
    }

    @Override
    public int getPrice() {
        return 60000;
    }
}