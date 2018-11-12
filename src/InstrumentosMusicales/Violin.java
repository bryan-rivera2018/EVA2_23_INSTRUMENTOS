/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstrumentosMusicales;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Violin extends InstrumentosMusicales
implements ViolinElectrico, ViolinAcustico{
    private int numeroCuerdas;
    private String efectos;
    private int Potencia;
    private String tipoViolin;

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    @Override
    public void TocarInstrumento() {
        System.out.println("Arco, violin con " + numeroCuerdas + "cuerdas");
        System.out.println("El violin es de tipo" + getNombre());
        System.out.println(tipoViolin);
        System.out.println("tiene efectos" + efectos);
        System.out.println("potencia de amplificador" +Potencia);
    }

    @Override
    public void efectos(String tipoEfecto) {
        efectos = tipoEfecto;
    }

    @Override
    public void Amplificador(int Potencia) {
        this.Potencia = Potencia;
    }

    @Override
    public void tipoViolin(String tipoViolin) {
         
    }
}
